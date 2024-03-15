import java.io.*;
class Student implements Serializable{
	String name;
	int age;
	transient String studentId;  // Marking a field as transient excludes it from serialization
	
	Student(String name,int age,String studentId){
		this.name=name;
		this.age=age;
		this.studentId=studentId;
	}
	void show(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Student ID:"+studentId);
	}
}
class SerializationDemo{
	public static void main(String arg[])throws IOException{
		FileOutputStream file=new FileOutputStream("student.ser");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		
		Student ob=new Student("Hamid",22,"44");
		
		obj.writeObject(ob);
		
		file.close();
		obj.close();
		
		System.out.println("Serialized data is saved in student.ser");
	}
}