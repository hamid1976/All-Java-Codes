class Box{
	int feet;
	int inch;
	Box(){
		feet=0;
		inch=0;
	}
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("inch="+inch);
	}
}
class Display{
	static Box add(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	static Box add(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet;
		ob.inch=ob1.inch+ob2.inch;
		return ob;
	}
	static Box add(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet+ob3.feet;
		ob.inch=ob1.inch+ob2.inch+ob3.inch;
		return ob;
	}
	static Box add(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet+ob3.feet+ob4.feet;
		ob.inch=ob1.inch+ob2.inch+ob3.inch+ob4.inch;
		return ob;
	}
	static Box add(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet+ob3.feet+ob4.feet+ob5.feet;
		ob.inch=ob1.inch+ob2.inch+ob3.inch+ob4.inch+ob5.inch;
		return ob;
	}//end add overoading
	static Box sub(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	static Box sub(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet;
		ob.inch=ob1.inch-ob2.inch;
		return ob;
	}
	static Box sub(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet-ob3.feet;
		ob.inch=ob1.inch-ob2.inch-ob3.inch;
		return ob;
	}
	static Box sub(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet-ob3.feet-ob4.feet;
		ob.inch=ob1.inch-ob2.inch-ob3.inch-ob4.inch;
		return ob;
	}
	static Box sub(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet-ob2.feet-ob3.feet-ob4.feet-ob5.feet;
		ob.inch=ob1.inch-ob2.inch-ob3.inch-ob4.inch-ob5.inch;
		return ob;
	}//end sub overoading
	static Box mul(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	static Box mul(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet;
		ob.inch=ob1.inch*ob2.inch;
		return ob;
	}
	static Box mul(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet*ob3.feet;
		ob.inch=ob1.inch*ob2.inch*ob3.inch;
		return ob;
	}
	static Box mul(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet*ob3.feet*ob4.feet;
		ob.inch=ob1.inch*ob2.inch*ob3.inch*ob4.inch;
		return ob;
	}
	static Box mul(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet*ob2.feet*ob3.feet*ob4.feet*ob5.feet;
		ob.inch=ob1.inch*ob2.inch*ob3.inch*ob4.inch*ob5.inch;
		return ob;
	}//end mul overoading
	static Box div(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	static Box div(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet;
		ob.inch=ob1.inch/ob2.inch;
		return ob;
	}
	static Box div(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet/ob3.feet;
		ob.inch=ob1.inch/ob2.inch/ob3.inch;
		return ob;
	}
	static Box div(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet/ob3.feet/ob4.feet;
		ob.inch=ob1.inch/ob2.inch/ob3.inch/ob4.inch;
		return ob;
	}
	static Box div(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet/ob2.feet/ob3.feet/ob4.feet/ob5.feet;
		ob.inch=ob1.inch/ob2.inch/ob3.inch/ob4.inch/ob5.inch;
		return ob;
	}//end div overoading
	static Box rem(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	static Box rem(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet;
		ob.inch=ob1.inch%ob2.inch;
		return ob;
	}
	static Box rem(Box ob1,Box ob2,Box ob3){
		Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet%ob3.feet;
		ob.inch=ob1.inch%ob2.inch%ob3.inch;
		return ob;
	}
	static Box rem(Box ob1,Box ob2,Box ob3,Box ob4){
		Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet%ob3.feet%ob4.feet;
		ob.inch=ob1.inch%ob2.inch%ob3.inch%ob4.inch;
		return ob;
	}
	static Box rem(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		Box ob=new Box();
		ob.feet=ob1.feet%ob2.feet%ob3.feet%ob4.feet%ob5.feet;
		ob.inch=ob1.inch%ob2.inch%ob3.inch%ob4.inch%ob5.inch;
		return ob;
	}//end add overoading
}
class ReturnObjectOverloadingBox{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		// Box ob3=new Box(150,100,50);
		// Box ob4=new Box(2000,1500,1000,500);
		// Box ob5=new Box(2500,2000,1500,1000,500);
		System.out.println("========Addition===========");
		Box  ob6=Display.add(ob1);
		Box  ob7=Display.add(ob1,ob2);
		Box  ob8=Display.add(ob1,ob2,ob1);
		Box  ob9=Display.add(ob1,ob2,ob2,ob1);
		Box ob10=Display.add(ob1,ob2,ob1,ob2,ob1);
		ob6.show();
		ob7.show();
		ob8.show();
		ob9.show();
		ob10.show();
		System.out.println("========Subtraction===========");
		Box  ob11=Display.sub(ob1);
		Box  ob12=Display.sub(ob1,ob2);
		Box  ob13=Display.sub(ob1,ob2,ob1);
		Box  ob14=Display.sub(ob1,ob2,ob2,ob1);
		Box  ob15=Display.sub(ob1,ob2,ob1,ob2,ob1);
		ob11.show();
		ob12.show();
		ob13.show();
		ob14.show();
		ob15.show();
		System.out.println("========Multiplication===========");
		Box  ob16=Display.mul(ob1);
		Box  ob17=Display.mul(ob1,ob2);
		Box  ob18=Display.mul(ob1,ob2,ob1);
		Box  ob19=Display.mul(ob1,ob2,ob2,ob1);
		Box  ob20=Display.mul(ob1,ob2,ob1,ob2,ob1);
		ob16.show();
		ob17.show();
		ob18.show();
		ob19.show();
		ob20.show();
		System.out.println("========Division===========");
		Box  ob21=Display.div(ob1);
		Box  ob22=Display.div(ob1,ob2);
		Box  ob23=Display.div(ob1,ob2,ob1);
		Box  ob24=Display.div(ob1,ob2,ob2,ob1);
		Box  ob25=Display.div(ob1,ob2,ob1,ob2,ob1);
		ob21.show();
		ob22.show();
		ob23.show();
		ob24.show();
		ob25.show();
		System.out.println("========Remainder===========");
		Box  ob26=Display.rem(ob1);
		Box  ob27=Display.rem(ob1,ob2);
		Box  ob28=Display.rem(ob1,ob2,ob1);
		Box  ob29=Display.rem(ob1,ob2,ob2,ob1);
		Box  ob30=Display.rem(ob1,ob2,ob1,ob2,ob1);
		ob26.show();
		ob27.show();
		ob28.show();
		ob29.show();
		ob30.show();
	}
}
		