class Rectangle1{
	int feet;
	int inch;
	int x;
	int y;

	Rectangle1(int a,int b,int c,int d){
		feet=a;
		inch=b;
		x=c;
		y=d;
     }
	 void add(){
		 System.out.println(feet+inch+x+y);
	 }
	 void add(Rectangle1 ob){
		 System.out.println(feet+ob.feet);
		 System.out.println(inch+ob.inch);
		 System.out.println(x+ob.x);
		 System.out.println(y+ob.y);
	 }
	 void add(Rectangle1 ob1,Rectangle1 ob2){
		 System.out.println(feet+ob1.feet+ob2.feet);
		 System.out.println(inch+ob1.inch+ob2.inch);
		 System.out.println(x+ob1.x+ob2.x);
		 System.out.println(y+ob1.y+ob2.y);
	 }
	 void sub(){
		 System.out.println(feet-inch-x-y);
	 }
	 void sub(Rectangle1 ob){
		 System.out.println(feet-ob.feet);
		 System.out.println(inch-ob.inch);
		 System.out.println(x-ob.x);
		 System.out.println(y-ob.y);

	 }
	 void sub(Rectangle1 ob1,Rectangle1 ob2){
		 System.out.println(feet-ob1.feet-ob2.feet);
		 System.out.println(inch-ob1.inch-ob2.inch);
		 System.out.println(x-ob1.x-ob2.x);
		 System.out.println(y-ob1.y-ob2.y);
	 }
	 void mul(){
		 System.out.println(feet*inch*x*y);
	 }
	 void mul(Rectangle1 ob){
		 System.out.println(feet*ob.feet);
		 System.out.println(inch*ob.inch);
		 System.out.println(x*ob.x);
		 System.out.println(y*ob.y);
	 }
	 void mul(Rectangle1 ob1,Rectangle1 ob2){
		 System.out.println(feet*ob1.feet*ob2.feet);
		 System.out.println(inch*ob1.inch*ob2.inch);
		 System.out.println(x*ob1.x*ob2.x);
		 System.out.println(y*ob1.y*ob2.y);
	 }
	 void div(){
		 System.out.println(feet/inch/x/y);
	 }
	 void div(Rectangle1 ob){
		 System.out.println(feet/ob.feet);
		 System.out.println(inch/ob.inch);
		 System.out.println(x/ob.x);
		 System.out.println(y/ob.y);

	 }
	 void div(Rectangle1 ob1,Rectangle1 ob2){
		 System.out.println(feet/ob1.feet/ob2.feet);
		 System.out.println(inch/ob1.inch/ob2.inch);
		 System.out.println(x/ob1.x/ob2.x);
		 System.out.println(y/ob1.y/ob2.y);
	 }
	 void rem(){
	     System.out.println(feet%inch%x%y);
	 }
	 void rem(Rectangle1 ob){
		 System.out.println(feet%ob.feet);
		 System.out.println(inch%ob.inch);
		 System.out.println(x%ob.x);
		 System.out.println(y%ob.y);
     }
	 void rem(Rectangle1 ob1,Rectangle1 ob2){
		 System.out.println(feet%ob1.feet%ob2.feet);
		 System.out.println(inch%ob1.inch%ob2.inch);
		 System.out.println(x%ob1.x%ob2.x);
		 System.out.println(y%ob1.y%ob2.y);
	 }
}//end class Rectangle1
class Redbox2{
	public static void main(String[] args){
		Rectangle1 ob1=new Rectangle1(10,5,20,10);
		Rectangle1 ob2=new Rectangle1(100,50,10,5);
		Rectangle1 ob3=new Rectangle1(1000,500,5,10);
		System.out.println("========Addition==========");
		ob1.add();
		ob2.add();
		ob3.add();
		
		ob1.add(ob2);
		ob2.add(ob2);
		ob3.add(ob1);
		ob3.add(ob3);
		
		ob3.add(ob1,ob2);
		ob1.add(ob1,ob1);
		ob2.add(ob2,ob2);
		ob3.add(ob3,ob3);
	
		System.out.println("========Subtraction==========");
		ob1.sub();
		ob2.sub();
		ob3.sub();
		
		ob1.sub(ob2);
		ob2.sub(ob2);
		ob3.sub(ob1);
		ob3.sub(ob3);
		
		ob3.sub(ob1,ob2);
		ob1.sub(ob1,ob1);
		ob2.sub(ob2,ob2);
		ob3.sub(ob3,ob3);
	 
        System.out.println("========Multiplication==========");
		ob1.mul();
		ob2.mul();
		ob3.mul();
		
		ob1.mul(ob2);
		ob2.mul(ob2);
		ob3.mul(ob1);
		ob3.mul(ob3);
		
		ob3.mul(ob1,ob2);
		ob1.mul(ob1,ob1);
		ob2.mul(ob2,ob2);
		ob3.mul(ob3,ob3);
			
		System.out.println("========Division==========");
		ob1.div();
		ob2.div();
		ob3.div();
		
		ob1.div(ob2);
		ob2.div(ob2);
		ob3.div(ob1);
		ob3.div(ob3);
		
		ob3.div(ob1,ob2);
		ob1.div(ob1,ob1);
		ob2.div(ob2,ob2);
		ob3.div(ob3,ob3);
	     
		System.out.println("========Remainder==========");
		ob1.rem();
		ob2.rem();
		ob3.rem();
		
		ob1.rem(ob2);
		ob2.rem(ob2);
		ob3.rem(ob1);
		ob3.rem(ob3);
		
		ob3.rem(ob1,ob2);
		ob1.rem(ob1,ob1);
		ob2.rem(ob2,ob2);
		ob3.rem(ob3,ob3);
   }
}