package java_15;

import java.util.Arrays;

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book2(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book2(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
    public String getAuthorName(){
        String au = "";
        for (int i = 0; i < getAuthors().length; i++){
            au += getAuthors()[i].getName() + ", ";
        }
        return au;
    }
}
