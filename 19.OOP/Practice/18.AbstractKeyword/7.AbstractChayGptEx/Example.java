abstract class Shape {
    abstract double getArea();

    public void displayArea(){
        System.out.println("Area: " + getArea());
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

  //  @Override
    double getArea() {
        return side * side;
    }
}

class Example{
    public static void main(String[] args) {
        Shape s = new Square(5);
        s.displayArea();  // prints "Area: 25.0"
    }
}



