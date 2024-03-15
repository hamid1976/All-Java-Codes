class Rectangle{
   int x,y,width,height;
   void set(int a,int b,int c,int d){
		 x=a;
		 y=b;
		 width=c;
		 height=d;
   }
   void display(){
		 System.out.println("x="+x);
		 System.out.println("y="+y);
		 System.out.println("width="+width);
		 System.out.println("Height="+height);
   }
   void add(){
		 System.out.println("x+y="+(x+y));
		 System.out.println("Widht+Height="+(width+height));
   }
}
class Test2{
	 public static void main(String arg[]){
	 Rectangle ob=new Rectangle();
	 Rectangle ob1=new Rectangle();
	 
	 ob.set(10,20,30,40);
	 ob1.set(100,200,300,400);
	 
	 ob.display();
	 ob1.display();
	 
	 ob.add();
	 ob1.add();
	 }
	 }