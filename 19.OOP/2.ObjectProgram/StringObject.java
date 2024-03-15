class School{
	String name;
	String subject;
	String rollno;
	
	
	void set(String a,String b,String c){
		name=a;
		subject=b;
		rollno=c;
	
	}
	void display(){
	    System.out.println("Name="+name);
		System.out.println("Subject="+subject);
		System.out.println("Rollno="+rollno);
		
	}
}

class StringObject{
	public static void main(String arg[]){
		School ob1=new School();
		School ob2=new School();
		
		ob1.set("HAMID","JAVA","2K20/IT/44");
		ob2 .set("UZAIR","JAVA","2K20/ITE/141");
		
	    ob1.display();
		ob2.display();
		
     }
}