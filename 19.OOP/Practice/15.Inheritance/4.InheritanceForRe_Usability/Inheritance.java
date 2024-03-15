class PhysicsAndTech{
	void computerTech(){
		System.out.println("3 years of computerTech");
	}
	void electronics(){
		System.out.println("3 years of Electronics");
	}
	void telecom(){
		System.out.println("3 years of Telecom");
	}
	void lab(){
		System.out.println("3 years of Lab");
	}
}
class IIT extends PhysicsAndTech{
	void IT(){
		System.out.println("4 years of IT");
	}
	void electronics(){//overriding from super class PhysicsAndTech
		System.out.println("4 years of Electronics");
	}
	void telecom(){
		System.out.println("4 years of Telecom");
	}
}
class IICT extends IIT{
	void softeng(){
		System.out.println("4 years of SoftEng");
	}
	void electronics(){//overriding from super class PhysicsAndTech
		System.out.println("5 years of Electronics");
	}
	void telecom(){
		System.out.println("5 years of Telecom");
	}
}
class Inheritance{
	public static void main(String arg[]){
		IICT ob=new IICT();
		ob.softeng();
		ob.telecom();
		ob.electronics();
		ob.IT();
		ob.lab();
		ob.computerTech();
	}
}