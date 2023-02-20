package ss00_java.generics;

public class DemoGeneric {
    public static void main(String[] args) {
//        Dictionary<String, String> dictionary = new Dictionary<String, String>("Study", "Hoc");
//        String english = dictionary.getKey();
//        String vietnamese = dictionary.getValue();
//        System.out.println(english + ": " + vietnamese);

//        Book<String> book = new Book<String>("Study", "Hoc");
//        String english = book.getKey();
//        String vietnamese = book.getValue();
//        System.out.println(english + ": " + vietnamese);

        Book<String, String, Integer> book = new Book<String, String, Integer>("Study", "hoc", 123);
        String english = book.getKey();
        String vietnamese = book.getValue();
        int quantity = book.getInfo();
        System.out.println(english + ": " + vietnamese + "\nQuantity: " + quantity);
    }
}
