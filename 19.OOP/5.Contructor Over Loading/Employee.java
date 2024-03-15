class Employee{
	int id ;
	String name;
	static String company ;
	
	static void change(){
		company = "SRT";
	}
	static void change2(){
		company = "SR";
	}
	Employee(int i,String n){
		id=i;
		name=n;
	}	
	void display(){
		System.out.println(id+" "+name+" "+company);
	}
	
	public static void main(String arg[]){
		//Employee.change();
		Employee.change2();
		Employee e1 = new Employee(11,"uazaie");
		Employee e2 = new Employee(11,"alex");
		e1.display();
		e2.display();
	}
}