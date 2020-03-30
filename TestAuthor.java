package java_15;

public class TestAuthor {
    public static void main(String[] args) {
        Author codelean = new Author("Code Lean", "codeleanvn@gmail.com", 'm');
        System.out.println(codelean);
        codelean.setEmail("codelean@gmail.com");
        System.out.println("name is: " + codelean.getName());
        System.out.println("email is: " + codelean.getEmail());
        System.out.println("gender is: " + codelean.getGender());
    }
}
