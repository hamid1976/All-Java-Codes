  class student{
	  int rollno;
	  String name;
	  static String college;
	  student(int r,String n){
	  rollno = r;
      name = n;
	  }
	  void display(){
		  System.out.println(rollno+"  "+name+"  "+college);
	  }	
}
class TestStaticVariable{
    public static void main(String arg[]){
	  student s1=new student(111,"Hamid");
	  student s2=new student(222,"Uzair");
	  student.college="ITC";
	  s1.display();
	  s2.display();
	
    }
}