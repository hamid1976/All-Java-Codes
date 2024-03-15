class School{
String name;
String fname;
int  age;
}
class Student{
	public static void main(String arg[]){
		School std1=new School();
        School std2=new School();
		School std3=new School();
		
		std1.name="Hamid";
		std1.fname="Noorullah";
		std1.age=21;
		
		std2.name="Name = Mubashir";
		std2.fname="Fname= hamid";
		std2.age=37;
		
		std3.name="Name = Uzair";
		std3.fname="Fname= Ahsan";
		std3.age=32;
		
		System.out.println("Name:"+std1.name);
		System.out.println("Fname:"+std1.fname);
		System.out.println("Age="+std1.age);
		
		System.out.println(std2.name);
		System.out.println(std2.fname);
		System.out.println(std2.age);
		
		System.out.println(std3.name);
		System.out.println(std3.fname);
		System.out.println(std3.age);
	}
}