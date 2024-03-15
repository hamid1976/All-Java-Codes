interface Test{
	void a();
}
interface Hello{
	void a();
}
class ABC implements Test,Hello{
	public void a(){
		System.out.println("a() is the implementation of both Test & Hello interface");
	}
}
class Example{
	public static void main(String arg []){
		ABC ob=new ABC();
		ob.a();	
	}
}