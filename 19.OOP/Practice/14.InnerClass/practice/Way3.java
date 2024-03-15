class Outer{
	int outer=100;
	void test(){
		for(int i=0;i<10; i++){
			class Inner{
				void display(){
					System.out.println("Dispaly Outer:"+outer);
					outer++;
				}
			}
			Inner ob=new Inner();
			ob.display();
		}
	}
}
class Way3{
	public static void main(String arg[]){
		Outer out=new Outer();
		out.test();
	}
}