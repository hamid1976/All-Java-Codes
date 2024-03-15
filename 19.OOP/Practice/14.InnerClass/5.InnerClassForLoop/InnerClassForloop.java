class Outer{
	int outer=100;
	void test(){
		for(int i=0; i<10; i++){
			class Inner{
				void display(){
					System.out.println("Outer="+outer);
				}
			}//end inner class
			Inner inner=new Inner();
			inner.display();
		}//end for loop
	}// end test 
}//end outer class
class InnerClassForloop{
	public static void main(String arg[]){
		Outer out=new Outer();
		out.test();
	}
}