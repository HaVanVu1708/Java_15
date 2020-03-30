package java_15;

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer( 1, "Tung", 80);
        System.out.println(c1);

        System.out.println("ID is: " + c1.getID());
        System.out.println("Name is: " + c1.getName());
        System.out.println("Discount is : " + c1.getDiscount());
    }
}
