class Outer{
	int outer=10;	
		Inner ob=new Inner();
		
	
	class Inner{
		void display(){
			System.out.println("Outer Display="+outer);
		}		
	}
}
class Way2{
	public static void main(String arg[]){
		Outer out=new Outer();
		out.ob.display();
	}
}