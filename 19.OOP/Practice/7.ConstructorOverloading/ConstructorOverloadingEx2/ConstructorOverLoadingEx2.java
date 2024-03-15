class Box{
   int feet,inch;
   Box(){
	   feet=0;
	   inch=0;
	   System.out.println("I am No Argument");
   }
   Box(int len){
	   feet=inch=len;
	   System.out.println("I am Two Argument");
   }
   Box(int a,int b){
	   feet=a;
	   inch=b;
	   System.out.println("I am Three Argument");
   }
   void show(){
	   System.out.println("Feet="+feet);
	   System.out.println("Inch="+inch);
   }
}
class ConstructorOverLoadingEx2{
	public static void main(String arg[]){
		Box ob=new Box();
		Box ob1=new Box(10);
		Box ob2=new Box(10,20);
		
		ob.show();
		ob1.show();
		ob2.show();
	}
}