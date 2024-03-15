class program{
	int add(int a,int b){
		int result=a+b;
		return result;
	}
	int sqr(int num){
		int result=num*num;
		return result;
	}
	int cube(int num){
		int result=num*num*num;
		return result;
	}
}
class Test{
	public static void main(String arg[]){
		program ob=new program();
		int add=ob.add(10,20);
		int sqr=ob.sqr(5);
		int cube=ob.cube(3);
		System.out.println("Addition="+add);
		System.out.println("Square="+sqr);
		System.out.println("Cube="+cube);
		
	}
}