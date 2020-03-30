package java_15;

public class MyCircle {
    private MyPoint center;
    // Quan trog
    private int radius = 1;

    //

    public MyCircle(int xCenter, int yCenter, int radius) {
        center = new MyPoint(xCenter,yCenter);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        int[] XY = new int[2];
        XY[0] = center.getX();
        XY[1] = center.getY();
        return XY;
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2.0 * Math.PI * radius;
    }
    public double
    distance(MyCircle another){
        return center.distance(another.center);
    }

}
