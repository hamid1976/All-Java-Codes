class Test{
    int add(int a,int b){
		int result =a+b;
		return result;
	}
	int sqr(int a){
	  int result=a*a;
	  return result;
	  }
	  int cube(int n){
	  int result=n*n*n;
	  return result;
	  }
}
	  class ReturnMethodEx1{
		  public static void main(String arg[]){
			  Test ob =new Test();
			  int a=ob.add(10,5);
			  System.out.println("Addition="+a);
			  int b=ob.add(100,50);
			  System.out.println("Addition="+b);
			  int c=ob.sqr(6);
			  System.out.println("Square="+c);
			   
			  int d=ob.cube(3);
			  System.out.println("Cube="+d);
		  }
	  }
			  