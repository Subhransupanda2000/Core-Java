import javafx.scene.shape.Circle;

public class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double result = length * width;
        System.out.println(result);
        return result;
    }

}

class circle extends Shape {
    private double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double result = Math.PI * radius * radius;
        System.out.println(result);
        return result;
    }
}

class test {
    public static void main(String[] args) {
        Rectangle t = new Rectangle(3.0, 3.2);
        t.calculateArea();
        circle d = new circle(3.2);
        d.calculateArea();
    }
}

