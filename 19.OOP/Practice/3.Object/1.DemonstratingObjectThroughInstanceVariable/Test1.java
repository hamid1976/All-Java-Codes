class Test{
   int feet;
   int inch;
   // void add(int a,int b){
   // feet=a;
   // inch=b;
   // }
   // void show(){
   // System.out.println("Feet="+feet);
   // System.out.println("Inch="+inch);
   // }
}
   class Test1{
	   public static void main(String arg[]){
		   Test ob =new Test();
		   Test ob1 =new Test();
		   Test ob2 =new Test();
		   ob.feet=10;
		   ob1.feet=100;
		   ob2.feet=1000;
		   ob.inch=10;
		   ob1.inch=100;
		   ob2.inch=1000;
		   System.out.println(ob.feet+ob1.feet+ob2.feet+ob.inch+ob1.inch+ob2.inch);
		   // ob.show();
		   // ob1.show();
		   // ob2.show();   
	   }
   }