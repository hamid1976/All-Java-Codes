class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
   // @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    //@Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Example{
    public static void main(String[] args) {
        Shape s1 = new Circle();
	  //fatherclass    childclass
        Shape s2 = new Square();
        //fatherclass    childclass
        s1.draw();  // prints "Drawing a circle"
        s2.draw();  // prints "Drawing a square"
		// Circle c=new Circle();
		// Square s=new Square();
		
		// Shape  s1=c;
		// c.draw();
		
		// s1=s;
		// s1.draw();
    }
}