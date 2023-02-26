package ss00_java.generics;

public class DemoGeneric {
    public static void main(String[] args) {
//        Dictionary<String, String> dictionary = new Dictionary<>("Study", "Hoc");
//        String english = dictionary.getKey();
//        String vietnamese = dictionary.getValue();
//        System.out.println(english + ": " + vietnamese);

//        Book<String> book = new Book<String>("Study", "Hoc");
//        String english = book.getKey();
//        String vietnamese = book.getValue();
//        System.out.println(english + ": " + vietnamese);

//        Book<String, String, Integer, String> book = new Book<String, String, Integer, String>("Study", "hoc", 123);
//        String english = book.getKey();
//        String vietnamese = book.getValue();
//        int quantity = book.getInfo();
//        System.out.println(english + ": " + vietnamese + "\nQuantity: " + quantity);
//        book.write("Add data to book");

        Book<String> book = new Book<String>();
        book.write("Add data to book");
    }
}
