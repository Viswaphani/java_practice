abstract class Shape {
  public abstract double calculateArea();

  public abstract double calculatePerimeter();

}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double calculateArea() {
    return length * width;
  }

  public double calculatePerimeter() {
    return 2 * (length + width);
  }
}

class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double calculateArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  public double calculatePerimeter() {
    return side1 + side2 + side3;
  }
}

class application {
  public static void main(String[] args) {
    Circle c = new Circle(5);
    Rectangle r = new Rectangle(4, 6);
    Triangle t = new Triangle(3, 4, 5);
    calculateTotal(c);
    calculateTotal(r);
    calculateTotal(t);
  }

  public static void calculateTotal(Shape shape) {

    System.out.println(" The " + shape.getClass().getName() + " has the perimeter : " + shape.calculatePerimeter());
    System.out.println("The area of the shape " + shape.calculateArea());

  }
}