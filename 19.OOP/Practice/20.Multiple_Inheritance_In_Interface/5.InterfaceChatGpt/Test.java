interface Shape {
    void draw();
}

interface Color {
     void fill();
}

class Circle implements Shape, Color {
    public void draw() {
        System.out.println("I am Circle");
    }

    public void fill() {
        System.out.println("Circle is fill");
    }
}
class Test{
	public static void main(String arg[]){
		Circle ob=new Circle();
		ob.draw();
		ob.fill();
	}
}