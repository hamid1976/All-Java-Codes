class Box{
	int feet;
	int inch;
	Box(){}
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	Box add(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	Box add(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet;
		ob.inch=ob1.inch+ob2.inch;
		return ob;
	}
	Box add(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet+ob3.feet;
		ob.inch=ob1.inch+ob2.inch+ob3.inch;
		return ob;
	}
	Box add(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet+ob3.feet+ob4.feet;
		ob.inch=ob1.inch+ob2.inch+ob3.inch+ob4.inch;
		return ob;
	}
	Box add(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet+ob3.feet+ob4.feet+ob5.feet;
		ob.inch=ob1.inch+ob2.inch+ob3.inch+ob4.inch+ob5.inch;
		return ob;
	}
	Box sub(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	Box sub(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet;
		ob.inch=ob1.inch-ob2.inch;
		return ob;
	}
	Box sub(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet-ob3.feet;
		ob.inch=ob1.inch-ob2.inch-ob3.inch;
		return ob;
	}
	Box sub(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet-ob3.feet-ob4.feet;
		ob.inch=ob1.inch-ob2.inch-ob3.inch-ob4.inch;
		return ob;
	}
	Box sub(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet-ob3.feet-ob4.feet-ob5.feet;
		ob.inch=ob1.inch-ob2.inch-ob3.inch-ob4.inch-ob5.inch;
		return ob;
	}
	Box mul(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	Box mul(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet;
		ob.inch=ob1.inch*ob2.inch;
		return ob;
	}
	Box mul(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet*ob3.feet;
		ob.inch=ob1.inch*ob2.inch*ob3.inch;
		return ob;
	}
	Box mul(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet*ob3.feet*ob4.feet;
		ob.inch=ob1.inch*ob2.inch*ob3.inch*ob4.inch;
		return ob;
	}
	Box mul(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet*ob3.feet*ob4.feet*ob5.feet;
		ob.inch=ob1.inch*ob2.inch*ob3.inch*ob4.inch*ob5.inch;
		return ob;
	}
	Box div(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	Box div(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet;
		ob.inch=ob1.inch/ob2.inch;
		return ob;
	}
	Box div(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet/ob3.feet;
		ob.inch=ob1.inch/ob2.inch/ob3.inch;
		return ob;
	}
	Box div(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet/ob3.feet/ob4.feet;
		ob.inch=ob1.inch/ob2.inch/ob3.inch/ob4.inch;
		return ob;
	}
	Box div(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet/ob3.feet/ob4.feet/ob5.feet;
		ob.inch=ob1.inch/ob2.inch/ob3.inch/ob4.inch/ob5.inch;
		return ob;
	}
	Box rem(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	Box rem(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet;
		ob.inch=ob1.inch%ob2.inch;
		return ob;
	}
	Box rem(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet%ob3.feet;
		ob.inch=ob1.inch%ob2.inch%ob3.inch;
		return ob;
	}
	Box rem(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet%ob3.feet%ob4.feet;
		ob.inch=ob1.inch%ob2.inch%ob3.inch%ob4.inch;
		return ob;
	}
	Box rem(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
        Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet%ob3.feet%ob4.feet%ob5.feet;
		ob.inch=ob1.inch%ob2.inch%ob3.inch%ob4.inch%ob5.inch;
		return ob;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
}
class Testing{
	public static void main(String arg[]){
	Box ob1=new Box(10,5);
	Box ob2=new Box(100,50);
	Box ob3=new Box(1000,500);
	
	System.out.println("=========Addition=======");
	Box ob4=ob1.add(ob2);
	Box ob5=ob1.add(ob1,ob2);
    Box ob6=ob1.add(ob1,ob2,ob3);
	Box ob7=ob1.add(ob2,ob3,ob3,ob3);
    Box ob8=ob1.add(ob1,ob2,ob3,ob1,ob2);
	ob4.show();
	System.out.println("=========================");
	ob5.show();
	System.out.println("=========================");
	ob6.show();
	System.out.println("=========================");
	ob7.show();
	System.out.println("=========================");
	ob8.show();
	System.out.println("=========Subtraction=======");
	Box ob24=ob1.sub(ob2);
	Box ob25=ob1.sub(ob1,ob2);
    Box ob26=ob1.sub(ob1,ob2,ob3);
	Box ob27=ob1.sub(ob2,ob3,ob3,ob3);
    Box ob28=ob1.sub(ob1,ob2,ob3,ob1,ob2);
	ob24.show();
	System.out.println("=========================");
	ob25.show();
	System.out.println("=========================");
	ob26.show();
	System.out.println("=========================");
	ob27.show();
	System.out.println("=========================");
	ob28.show();
	
	System.out.println("=========Multiplication=======");
	Box  ob9=ob1.mul(ob2);
	Box ob10=ob1.mul(ob1,ob2);
    Box ob11=ob1.mul(ob1,ob2,ob3);
	Box ob12=ob1.mul(ob2,ob3,ob3,ob3);
    Box ob13=ob1.mul(ob1,ob2,ob3,ob1,ob2);
	ob9.show();
	System.out.println("=========================");
	ob10.show();
	System.out.println("=========================");
	ob11.show();
	System.out.println("=========================");
	ob12.show();
	System.out.println("=========================");
	ob13.show();
	
	System.out.println("=========Division=======");
	Box ob14=ob1.div(ob2);
	Box ob15=ob1.div(ob1,ob2);
    Box ob16=ob1.div(ob1,ob2,ob3);
	Box ob17=ob1.div(ob2,ob3,ob3,ob3);
    Box ob18=ob1.div(ob1,ob2,ob3,ob1,ob2);
	ob14.show();
	System.out.println("=========================");
	ob15.show();
	System.out.println("=========================");
	ob16.show();
	System.out.println("=========================");
	ob17.show();
	System.out.println("=========================");
	ob18.show();
	
	System.out.println("=========Remainder=======");
	Box ob19=ob1.rem(ob2);
	Box ob20=ob1.rem(ob1,ob2);
    Box ob21=ob1.rem(ob1,ob2,ob3);
	Box ob22=ob1.rem(ob2,ob3,ob3,ob3);
    Box ob23=ob1.rem(ob1,ob2,ob3,ob1,ob2);
	ob19.show();
	System.out.println("=========================");
	ob20.show();
	System.out.println("=========================");
	ob21.show();
	System.out.println("=========================");
	ob22.show();
	System.out.println("=========================");
	ob23.show();
	
}
}