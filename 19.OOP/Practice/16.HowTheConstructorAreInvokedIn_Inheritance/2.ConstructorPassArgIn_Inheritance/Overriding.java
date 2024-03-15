class Physics{
	void computerTech(){
		System.out.println("I am 3 Year ComputerTech");
	}
	void lab(){
		System.out.println("I am 3 Year LAB");
	}
	void electronics(){
		System.out.println("I am 3 Year Electronics");
	}
	void telecom(){
		System.out.println("I am 3 Year Telecom");
	}
}
class IIT extends Physics{
	void it(){
		System.out.println("I am 3 Year IT");
	}
	void electronics(){
		super.electronics();
		System.out.println("I am 4 Year Electronics");
	}
	void telecom(){
		super.telecom();
		System.out.println("I am 4 Year Telecom");
	}
}
class IICT extends IIT{
	void softTech(){
		System.out.println("I am 4 Year SoftwearTechnology");
	}
}
class Overriding{
	public static void main(String arg[]){
		IICT ob=new IICT();
		ob.softTech();
		ob.it();
		ob.telecom();
		ob.electronics();
		ob.lab();
		ob.computerTech();
	}
}