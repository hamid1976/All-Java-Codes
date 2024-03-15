class School{
	String name;
	String fname;
	int age;
	void set(String a,String b,int c){
		name=a;
		fname=b;
		age=c;
	}
	void show(){
		System.out.println("Name="+name);
		System.out.println("FatherName="+fname);
		System.out.println("Age="+age);
	}
}
class TestObject{
	public static void main(String arg[]){
		School std1=new School();
		School std2=new School();
		School std3=new School();
		
		std1.name ="Noorulhuda";
		std1.fname="Noorullah";
		std1.age  =30;
		
		std2.name ="Hamidullah";
		std2.fname="Noorullah";
		std2.age  =21;
		
		std3.name ="Abdulhaq";
		std3.fname="Noorullah";
		std3.age  =22;
		
		std1.show();
		std2.show();
		std3.show();
		
	}
}
		