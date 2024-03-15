class claculate{
	int v1;
	int v2;
	 void set(int a,int b){
		 v1=a;
		 v2=b;
	 }
	void add(){
		System.out.println("Addition "+(v1+v2));
	}
	void sub(){
		System.out.println("Subtraction "+(v1-v2));
	}
	void mult(){
		System.out.println("Multiplication "+(v1*v2));
	}
	void divi(){
		System.out.println("Division "+(v1/v2)+"\n\n");
	}
	 
	}
class objCalculator{
	public static void main(String arg []){
		 
		claculate ob1=new claculate();
        claculate ob2=new claculate();		
		claculate ob3=new claculate();
		
		ob1.set(12,5);
		ob2.set(63,7);
		ob3.set(65,5);
		
		ob1.add();
		ob1.sub();
		ob1.mult();
		ob1.divi();
		
		ob2.add();
		ob2.sub();
		ob2.mult();
		ob2.divi();
		
		ob3.add();
		ob3.sub();
		ob3.mult();
		ob3.divi();
	}
}