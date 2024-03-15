import java.io.*;
class DeSerializedDemo{
	public static void main(String arg[])throws Exception{
		FileInputStream file=new FileInputStream("abc.obj");
		ObjectInputStream obj=new ObjectInputStream(file);
		
		Box ob=(Box)obj.readObject();
		ob.show();
	}
}
