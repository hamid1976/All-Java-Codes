class Box{
	
	int x;
	int y;
	int width;
	int height;
		   
	Box(int a,int b,int c,int d){
	x=a ;
	y =b ;
	width=c;
	height=d;
	   }
	void Add(){
	System.out.println(x);	
	}
	void Add(Box obj1){
	System.out.println("\n"+(x+obj1.x));
	System.out.println(""+(y+obj1.x));
	}
	void Add(Box obj1,Box obj2){
	System.out.println("\n"+(y+obj2.y));
	System.out.println(""+(x+obj2.x));
	}
	void Add(Box obj1,Box obj2,Box obj3){
	System.out.println("\n"+(x+obj2.y+obj3.width));
	System.out.println(""+(y+obj2.x+obj2.width));
	System.out.println(""+(width+obj1.y+obj1.width));
	}
	void Add(Box obj1,Box obj2,Box obj3,Box obj4){
	System.out.println("\n"+(x+obj2.y+obj3.width+obj4.y));
	System.out.println(""+(width+obj2.x+y+obj4.x));
	System.out.println(""+(height+obj2.height+obj3.height+obj4.height));
	}
	void Add(Box obj1,Box obj2,Box obj3,Box obj4,Box obj5){
	System.out.println("\n"+(y+obj2.y+obj3.width+obj4.y+obj5.height));
	System.out.println(""+(width+obj2.x+y+obj4.x+height));
	System.out.println(""+(height+obj2.height+obj3.height+obj4.height+width));
	}
	void sub(){
	System.out.println("\n\n"+(y));
	System.out.println(x);
	}
	void sub(Box obj1){
	System.out.println("\n"+(x-obj1.y));
	System.out.println(obj1.x-y);
	}
	void sub(Box obj1,Box obj2){
	System.out.println("\n"+(obj1.x-y));
	System.out.println(obj1.x-x);
	System.out.println(y-obj2.y);
	}
	void sub(Box obj1,Box obj2,Box obj3){
	System.out.println("\n"+(x-obj1.y-obj3.y));
	System.out.println(obj1.x-obj2.x-width);
	System.out.println(obj3.y-y-obj3.width);
	}
	void sub(Box obj1,Box obj2,Box obj3,Box obj4){
	System.out.println("\n"+(obj1.x-obj1.y-obj3.y-height));
	System.out.println(obj1.x-obj2.x-width-obj4.x);
	System.out.println(obj1.height-obj2.x-height-obj4.y);
	}
	void sub(Box obj1,Box obj2,Box obj3,Box obj4,Box obj5){
	System.out.println("\n"+(obj1.x-obj1.y-obj3.y-height-obj5.x));
	System.out.println(obj1.x-obj2.x-width-obj4.x-obj5.width);
	System.out.println(obj1.height-obj2.x-height-obj4.y-obj5.height);
	}	
	void mult(){
	System.out.println("\n\n"+(y));
	System.out.println(x);
	}
	void mult(Box obj1){
	System.out.println("\n"+(x*obj1.y));
	System.out.println(obj1.x*y);
	}
	void mult(Box obj1,Box obj2){
	System.out.println("\n"+(obj1.x*obj1.x));
	System.out.println(obj2.y*obj1.y);
	System.out.println(obj2.x*obj2.y);
	}
	void mult(Box obj1,Box obj2,Box obj3){
	System.out.println("\n"+(obj1.x*obj1.y*obj3.y));
	System.out.println(obj1.x*obj2.x*obj3.width);
	System.out.println(obj3.y*obj3.y*obj3.width);
	}
	void mult(Box obj1,Box obj2,Box obj3,Box obj4){
	System.out.println("\n"+(obj1.x*obj1.y*obj3.y*y));
	System.out.println(x*obj2.x*obj3.width*obj4.x);
	System.out.println(height*obj2.height*width*y);
	}
	void mult(Box obj1,Box obj2,Box obj3,Box obj4,Box obj5){
	System.out.println("\n"+(obj1.x*obj1.y*y*obj4.height*obj5.width));
	System.out.println(x*obj2.x*obj3.width*obj4.x*y);
	System.out.println(height*obj2.height*obj3.height*obj4.x*y);
	}
	void mult(Box obj1,Box obj2,Box obj3,Box obj4,Box obj5,Box obj6){
	System.out.println("\n\n"+(x*y*y*height*width*x));
	System.out.println(x*y*width*x*y*x);
	System.out.println(height*height*height*x*y*width);
	}
}	
class Retbox5{
	public static void main(String arg[]){
	 Box ob1 =new Box(24,4,2,3);		
	 Box ob2 =new Box(32,8,7,6);
        System.out.println("\n\nObject one ");
		ob1.Add();
		ob1.Add(ob1);
		ob1.Add(ob1,ob2);
		ob1.Add(ob1,ob2,ob2);
		ob1.Add(ob1,ob2,ob2,ob1);
		ob1.Add(ob1,ob2,ob2,ob1,ob2);
		System.out.println("\n\nObject tow ");
		ob2.Add();
		ob2.Add(ob2);
		ob2.Add(ob2,ob2);
		ob2.Add(ob2,ob1,ob2);
		ob2.Add(ob2,ob1,ob1,ob2);
		ob2.Add(ob1,ob1,ob1,ob2,ob2);
	    System.out.println("\n\nObject one ");
     	ob1.sub();
		ob1.sub(ob1);
		ob1.sub(ob1,ob2);
		ob1.sub(ob1,ob2,ob1);
		ob1.sub(ob1,ob2,ob1,ob2);
		ob1.sub(ob1,ob2,ob1,ob2,ob1);
		System.out.println("\n\nObject tow ");
		ob2.sub();
		ob2.sub(ob1);
		ob2.sub(ob1,ob2);
		ob2.sub(ob1,ob2,ob1);
		ob2.sub(ob1,ob2,ob1,ob2);
		ob2.sub(ob1,ob2,ob1,ob2,ob1);
		System.out.println("\n\nObject one ");
		ob1.mult();
		ob1.mult(ob1);
		ob1.mult(ob1,ob2);
		ob1.mult(ob1,ob2,ob2);
		ob1.mult(ob1,ob2,ob2,ob1);
		ob1.mult(ob1,ob2,ob2,ob1,ob2);
		System.out.println("\n\nObject tow ");
		ob2.mult();
		ob2.mult(ob1);
		ob2.mult(ob2,ob1);
		ob2.mult(ob2,ob1,ob2);
		ob2.mult(ob1,ob2,ob1,ob1);
		ob2.mult(ob2,ob2,ob2,ob1,ob2);	
	}

}