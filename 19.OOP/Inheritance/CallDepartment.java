class physicsAndTechnology{
void computerTech(){
    System.out.println("3 year computerTech");
	}
	
	void electronics(){
    System.out.println("3 year electronics");
	}
	
	void telecom(){
    System.out.println("3 year telecom");
	}
	void lab(){
    System.out.println(" Lab");
	}
}
class IIT extends physicsAndTechnology{
	void IT(){
		System.out.println("4 year IT");
	}
	void electronics(){
		super.electronics();
		System.out.println("4 year Electronics");
	}
	void telecom(){
		super.telecom();
		System.out.println("4 year Telecom");
	}
}
class IICT extends IIT{
	void software(){
		System.out.println("4 year software enginear");
	}
}
	
	class CallDepartment{
	public static void main(String arg[]){
	IICT ob= new IICT();
	ob.software();
	ob.telecom();
	ob.electronics();
	ob.computerTech();
	ob.lab();
	ob.IT();
	}
	}