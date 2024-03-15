class Marksheet{
	int obtain(int a,int b,int c,int d,int e){
		int obtain=a+b+c+d+e;
		return obtain;
	}
	int total(){
		int total=500;
		System.out.println("Total=");
		return total;
	}
	int per(int obtain){
		int per=obtain*100/500;
		return per;
	}
	
}
class MethodReturn{
	public static void main(String arg[]){
	    Marksheet ob=new Marksheet();
		int ob1=ob.obtain(50,60,70,80,90);
		System.out.println("Obtain="+ob1);
		int ob2=ob.total();
		System.out.println(ob2);
		int ob3=ob.per(ob1);
		System.out.println("Percentage="+ob3);
	}
}