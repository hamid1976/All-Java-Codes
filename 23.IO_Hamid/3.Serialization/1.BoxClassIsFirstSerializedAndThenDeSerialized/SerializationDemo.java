import java.io.*;
class Box implements Serializable{
	int feet;
	int inch;
	
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("Feet:"+feet);
		System.out.println("Inch:"+inch);
	}
}
class SerializationDemo{
	public static void main(String arg[])throws IOException{
		FileOutputStream file=new FileOutputStream("abc.obj");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		
		Box ob=new Box(100,50);
		
		obj.writeObject(ob);
		
		file.close();
		
		System.out.println("Saved Object");
	}
}