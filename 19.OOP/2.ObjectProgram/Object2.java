import java.util.*;

class Object2{
	
	 public static void main(String arg[]){
		
		
		School std1=new School();
		School std2=new School();
	//	School std3=new School();
		
		std1.name="Ali";
		std1.surname="-----";
		std1.fathername="babar";
		std1.subject="oracle";
		std1.rollno="2k18-cse-1";
		std1.city="hyd";
		std1.email="-----";
		std1.adress="----";
		
		std2.name="Faizan Hussain";
		std2.surname="Joyo";
		std2.fathername="Ghullam Hussain";
		std2.subject="oracle";
		std2.rollno="2k18-cse-40";
		std2.city="------";
		std2.email="-----";
		std2.adress="----";
		
		
		System.out.println("\n1st Student  ");
		
		System.out.println("Name       : "+std1.name);
		System.out.println("Surname    : "+std1.surname);
		System.out.println("Father Name: "+std1.fathername);
		System.out.println("Subject    : "+std1.subject);
		System.out.println("Roll NO    : "+std1.rollno);
		System.out.println("City       : "+std1.city);
		System.out.println("Email       : "+std1.email);
		System.out.println("Adress       : "+std1.adress);
		
		System.out.println("\n2nd Student  ");
		
		System.out.println("Name       : "+std2.name);
		System.out.println("surname    : "+std2.surname);
		System.out.println("Father Name: "+std2.fathername);
		System.out.println("Subject    : "+std2.subject);
		System.out.println("Roll NO    : "+std2.rollno);
		System.out.println("City       : "+std2.city);
		System.out.println("Email       : "+std2.email);
		System.out.println("Adress       : "+std2.adress);
		
		
		
		
		
		
		
	}
}


class School{
	
	String name;
	String surname;
	String fathername;
	String subject;
	String rollno;
	String city;
	String email;
	String adress;
	
	
}