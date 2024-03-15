class student{
	int rollno;
	String name;
	static String college="ITS";
	static void change(){
		college="BBDIT";
	}
	student(int r, String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(rollno+""+name+""+college);
	}
}
class Test_Static_Method{
   public static void main(String arg[]){
	   student s1=new student(111,"karan");
	   student s2=new student(222,"Aryan");
	   student s3=new student(333,"Hamid");
	   
	   s1.display();
	   s2.display();
	   s3.display();
   }
}