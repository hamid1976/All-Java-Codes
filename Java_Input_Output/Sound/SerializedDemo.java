import java.io.*;
class Box{
	int feet,inch;
	Box(int feet, int inch){
		this.feet=feet;
		this.inch=inch;
	}
	void show(){
		System.out.println("feet : "+feet);
		System.out.println("inch : "+inch);
	}
}
class SerializedDemo{
	public static void main(String[] args)throws Exception {
		FileOutputStream file = new FileOutputStream("ab.obj");
		ObjectOutputStream ob = new ObjectOutputStream(file);
		Box b = new Box(10,5);
		ob.writeObject(b);
		file.close();
		System.out.println("Saved Object");
	}
}