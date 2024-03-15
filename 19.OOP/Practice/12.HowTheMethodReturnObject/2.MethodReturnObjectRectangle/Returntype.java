 class  Box{
	 int x;
	 int y;
	 int width;
	 int height;
	 Box(){}
 Box(int a, int b,int c,int d){
	 x=a;
	 y=b;
	 width=c;
	 height=d;
	 
 }
 void show(){
	 System.out.println("x     "+x);
	 System.out.println("y     "+y);
	 System.out.println("width     "+width);
	 System.out.println("height     "+height);
 }
 Box add(Box obj1){
	 Box temp=new Box();
	 temp.x=x+obj1.x;
	 temp.y=y+obj1.y;
	 temp.width=width+obj1.width;
	 temp.height=height+obj1.height;
	 return temp;
 }
 }
 
 class Returntype{
	 public static void main(String arg[]){
		 
		 Box ob1=new Box(100,50,20,10);
		 Box ob2=new Box(6,5,4,3);
		 Box ob3=ob1.add(ob1);
		 ob3.show();
		 Box ob4=ob1.add(ob2);
		 ob4.show();
	 }
 }