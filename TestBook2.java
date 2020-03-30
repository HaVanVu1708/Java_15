package java_15;

public class TestBook2 {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("TanAh Teck", "ahtech@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@nowhere.com", 'm');

        Book2 javaDummy = new Book2("Java for dummy", authors, 20, 99);
        System.out.println(javaDummy);
        System.out.println(javaDummy.getAuthorName());
    }
}
