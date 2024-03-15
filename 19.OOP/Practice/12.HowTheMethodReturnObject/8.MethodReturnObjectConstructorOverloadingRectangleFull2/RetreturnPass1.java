class Box{
	int x;
	int y;
	int width;
	int height;
	Box(){}
	Box(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void show(){
		System.out.println("x      "+x);
		System.out.println("y      "+y );
		System.out.println("width  "+width );
		System.out.println("height "+height );
    }
	Box add(Box obj1){
		Box temp = new Box();
		temp.x=x+obj1.x;
		temp.y=y+obj1.y;
		temp.width=width+obj1.width;
		temp.height=height+obj1.height;
	    return temp;
    }
	Box add(Box obj1,Box obj2){
		Box temp = new Box();
		temp.x=x+obj1.x+obj2.x;
		temp.y=y+obj1.y+obj2.y;
		temp.width=width+obj1.width+obj2.width;
		temp.height=height+obj1.height+obj2.height;
		return temp;
	}
	Box add(Box obj1,Box obj2,Box obj3){
		Box temp = new Box();
		temp.x=x+obj1.x+obj2.x+obj3.x;
		temp.y=y+obj1.y+obj2.y+obj3.y;
		temp.width=width+obj1.width+obj2.width+obj3.width;
		temp.height=height+obj1.height+obj2.height+obj3.height;
		return temp;
	}
	Box add(Box obj1,Box obj2,Box obj3,Box obj4){
		Box temp = new Box();
		temp.x=x+obj1.x+obj2.x+obj3.x+obj4.x;
		temp.y=y+obj1.y+obj2.y+obj3.y+obj4.y;
		temp.width=width+obj1.width+obj2.width+obj3.width+obj4.width;
		temp.height=height+obj1.height+obj2.height+obj3.height+obj4.height;
		return temp;
	}
    Box sub(Box obj1){
		Box temp = new Box();
		temp.x=x-obj1.x;
		temp.y=y-obj1.y;
		temp.width=width-obj1.width;
		temp.height=height-obj1.height;
		return temp;
	}
	Box sub(Box obj1,Box obj2){
		Box temp = new Box();
		temp.x=x-obj1.x-obj2.x;
		temp.y=y-obj1.y-obj2.y;
		temp.width=width-obj1.width-obj2.width;
		temp.height=height-obj1.height-obj2.height;
		return temp;
	}
	Box sub(Box obj1,Box obj2,Box obj3){
		Box temp = new Box();
		temp.x=x-obj1.x-obj2.x-obj3.x;
		temp.y=y-obj1.y-obj2.y-obj3.y;
		temp.width=width-obj1.width-obj2.width-obj3.width;
		temp.height=height-obj1.height-obj2.height-obj3.height;
		return temp;
	}
	Box sub(Box obj1,Box obj2,Box obj3,Box obj4){
		Box temp = new Box();
		temp.x=x-obj1.x-obj2.x-obj3.x-obj4.x;
		temp.y=y-obj1.y-obj2.y-obj3.y-obj4.y;
		temp.width=width-obj1.width-obj2.width-obj3.width-obj4.width;
		temp.height=height-obj1.height-obj2.height-obj3.height-obj4.height;
		return temp;
	}
    Box mult(Box obj1){
		Box temp = new Box();
		temp.x=x*obj1.x;
		temp.y=y*obj1.y;
		temp.width=width*obj1.width;
		temp.height=height*obj1.height;
		return temp;
	}
	Box mult(Box obj1,Box obj2){
		Box temp = new Box();
		temp.x=x*obj1.x*obj2.x;
		temp.y=y*obj1.y*obj2.y;
		temp.width=width*obj1.width*obj2.width;
		temp.height=height*obj1.height*obj2.height;
		return temp;
	}
	Box mult(Box obj1,Box obj2,Box obj3){
		Box temp = new Box();
		temp.x=x*obj1.x*obj2.x*obj3.x;
		temp.y=y*obj1.y*obj2.y*obj3.y;
		temp.width=width*obj1.width*obj2.width*obj3.width;
		temp.height=height*obj1.height*obj2.height*obj3.height;
		return temp;
	}
	Box mult(Box obj1,Box obj2,Box obj3,Box obj4){
		Box temp = new Box();
		temp.x=x*obj1.x*obj2.x*obj3.x*obj4.x;
		temp.y=y*obj1.y*obj2.y*obj3.y*obj4.y;
		temp.width=width*obj1.width*obj2.width*obj3.width*obj4.width;
		temp.height=height*obj1.height*obj2.height*obj3.height*obj4.height;
		return temp;
	}
    Box divi(Box obj1){
		Box temp = new Box();
		temp.x=x/obj1.x;
		temp.y=y/obj1.y;
		temp.width=width/obj1.width;
		temp.height=height/obj1.height;
		return temp;
	}
	Box divi(Box obj1,Box obj2){
		Box temp = new Box();
		temp.x=x/obj1.x/obj2.x;
		temp.y=y/obj1.y/obj2.y;
		temp.width=width/obj1.width/obj2.width;
		temp.height=height/obj1.height/obj2.height;
		return temp;
	}
	Box divi(Box obj1,Box obj2,Box obj3){
		Box temp = new Box();
		temp.x=x/obj1.x/obj2.x/obj3.x;
		temp.y=y/obj1.y/obj2.y/obj3.y;
		temp.width=width/obj1.width/obj2.width/obj3.width;
		temp.height=height/obj1.height/obj2.height/obj3.height;
		return temp;
	}
	Box divi(Box obj1,Box obj2,Box obj3,Box obj4){
		Box temp = new Box();
		temp.x=x/obj1.x/obj2.x/obj3.x/obj4.x;
		temp.y=y/obj1.y/obj2.y/obj3.y/obj4.y;
		temp.width=width/obj1.width/obj2.width/obj3.width/obj4.width;
		temp.height=height/obj1.height/obj2.height/obj3.height/obj4.height;
		return temp;
	}
	Box rem(Box obj1){
		Box temp = new Box();
		temp.x=x%obj1.x;
		temp.y=y%obj1.y;
		temp.width=width%obj1.width;
		temp.height=height%obj1.height;
		return temp;
	}
	Box rem(Box obj1,Box obj2){
		Box temp = new Box();
		temp.x=x%obj1.x%obj2.x;
		temp.y=y%obj1.y%obj2.y;
		temp.width=width%obj1.width%obj2.width;
		temp.height=height%obj1.height%obj2.height;
		return temp;
	}
	Box rem(Box obj1,Box obj2,Box obj3){
		Box temp = new Box();
		temp.x=x%obj1.x%obj2.x%obj3.x;
		temp.y=y%obj1.y%obj2.y%obj3.y;
		temp.width=width%obj1.width%obj2.width%obj3.width;
		temp.height=height%obj1.height%obj2.height%obj3.height;
		return temp;
	}
	Box rem(Box obj1,Box obj2,Box obj3,Box obj4){
		Box temp = new Box();
		temp.x=x%obj1.x%obj2.x%obj3.x&obj4.x;
		temp.y=y%obj1.y%obj2.y%obj3.y%obj4.y;
		temp.width=width%obj1.width%obj2.width%obj3.width%obj4.width;
		temp.height=height%obj1.height%obj2.height%obj3.height%obj4.height;
		return temp;
	}
}//End Class Box Constructor
class RetreturnPass1{
   public static void main(String arg []){
		Box ob1=new Box(100,50,20,10);
		Box ob2=new Box(6,5,4,3);

		System.out.println("\n\nAddition");
		Box ab1= ob1.add(ob1);
		ab1.show();

		System.out.println("\n\n");
		Box ab2= ob1.add(ob1,ob2);
		ab2.show();

		System.out.println("\n\n");
		Box ab3= ob1.add(ob2,ob1,ob2);
		ab3.show();

		System.out.println("\n\n");
		Box ab4= ob1.add(ob2,ob1,ob2,ob2);
		ab4.show();

		System.out.println("\n\nSUBTRACTION");
		Box ac1= ob1.sub(ob1);
		ac1.show();

		System.out.println("\n\n");
		Box ac2= ob1.sub(ob1,ob2);
		ac2.show();

		System.out.println("\n\n");
		Box ac3= ob1.sub(ob2,ob1,ob2);
		ac3.show();

		System.out.println("\n\n");
		Box ac4= ob1.sub(ob2,ob1,ob2,ob1);
		ac4.show();

		System.out.println("\n\nMultiplication");
		Box ad1= ob1.mult(ob1);
		ad1.show();

		System.out.println("\n\n");
		Box ad2= ob1.mult(ob1,ob2);
		ad2.show();

		System.out.println("\n\n");
		Box ad3= ob1.mult(ob2,ob1,ob2);
		ad3.show();

		System.out.println("\n\n");
		Box ad4= ob1.mult(ob2,ob1,ob2,ob1);
		ad4.show();

		System.out.println("\n\nDivision");
		Box ae1= ob1.divi(ob1);
		ae1.show();

		System.out.println("\n\n");
		Box ae2= ob1.divi(ob1,ob2);
		ae2.show();
		
		System.out.println("\n\n");
		Box ae3= ob1.divi(ob2,ob1,ob2);
		ae3.show();

		System.out.println("\n\n");
		Box ae4= ob1.divi(ob2,ob1,ob2,ob2);
		ae4.show();

		System.out.println("\n\nRemmender");
		Box af1= ob1.rem(ob1);
		af1.show();

		System.out.println("\n\n");
		Box af2= ob1.rem(ob1,ob2);
		af2.show();

		System.out.println("\n\n");
		Box af3= ob1.rem(ob2,ob1,ob2);
		af3.show();

		System.out.println("\n\n");
		Box af4= ob1.rem(ob2,ob1,ob2,ob2);
		af4.show();

   }
 }