package java_15;

public class TestBook {
    public static void main(String[] args) {
        Author codelean = new Author("Code Lean", "codeleanvn@gmail.com", 'f');
        System.out.println(codelean);

        Book dummyBook = new Book("Java for dummy", codelean, 20, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.5);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());

        //Thử
        Book authorBook = new Book("more Java", new Author("Dang Kim Thi", "acb@gmail.com", 'f'), 29.5);
        System.out.println(authorBook);

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Anthor's email is: " + dummyBook.getAuthor().getEmail());

        System.out.println(dummyBook.getAuthorName());
    }
}
