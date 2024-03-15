interface Shape {
    double getArea();
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Example {
    public static void main(String[] args) {
        Shape s1 = new Square(5);
        Shape s2 = new Circle(3);
        System.out.println("Area of square: " + s1.getArea());  // prints "Area of square: 25.0"
        System.out.println("Area of circle: " + s2.getArea());  // prints "Area of circle: 28.274333882308138"
    }
}