package java_15;

public class TestInvoice {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Tung", 80);
        System.out.println(c1);
        Invoice i1 = new Invoice(1, c1, 80);
        System.out.println(i1);

        System.out.println("ID is: " + i1.getID());
        System.out.println("Customer is: " + i1.getCustomer());
        System.out.println("Amount is: " + i1.getAmount());
        System.out.println("Customer name is: " + i1.getCustomerName());
        System.out.println("Amount after discount is: " + i1.getAmountAfterDiscount());
    }
}
