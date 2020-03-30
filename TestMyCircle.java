package java_15;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle m1 = new MyCircle(1, 2, 3);
        System.out.println(m1);
        m1.setCenterXY(4, 5);
        System.out.println(m1.getCenterXY()[0]);
    }
}
