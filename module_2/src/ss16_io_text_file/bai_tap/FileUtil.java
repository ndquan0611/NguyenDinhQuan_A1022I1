package ss16_io_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static final String FILE_PATH = "E:\\Workspace\\codegym\\module_2\\src\\ss16_io_text_file\\bai_tap\\nation.csv";
    private static List<Nation> nationList = new ArrayList<>();

    public static void writeCSV(List<Nation> nationList) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (Nation nation : nationList) {
                buff.write(nation.getInfo() + "\n");
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Nation> readCSV() {
        List<Nation> nationList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            Nation nation;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];

                nation = new Nation(id, code, name);
                nationList.add(nation);
            }
            buff.close();
            return nationList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        /* Read
        nationList = readCSV();
        for (Nation nation : nationList) {
            System.out.println(nation);
        }
        *  */

        Nation nation = new Nation(9, "VN", "Vietnamese");
        nationList.add(nation);
        writeCSV(nationList);
    }
}
