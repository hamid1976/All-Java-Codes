import java.io.*;
class DeSerializedDemo{
	public static void main(String arg[])throws Exception{
	FileInputStream file=new FileInputStream("student.ser");
	ObjectInputStream obj=new ObjectInputStream(file);
	
	Student ob=(Student)obj.readObject();
	ob.show();
	
	file.close();
	
	}
}