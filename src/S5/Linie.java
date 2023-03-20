package S5;

public class Linie extends Shape { //derivarea clasei shape
    private double length;
    public Linie(double length) {this.length = length;}
    public double getLength() {
        return length;
    }
    public void setLength(double length) {this.length = length;}
    public double area() {
        return 0;
    }
    public double perimeter() {
        return length;
    }
}
