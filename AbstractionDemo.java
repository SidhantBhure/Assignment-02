abstract class Shape {
    double area;

    abstract void calculateArea();

    void display() {
        System.out.println("Displaying shape area: " + area);
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        area = length * width;
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.calculateArea();
        circle.display();

        Shape rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
        rectangle.display();
    }
}
