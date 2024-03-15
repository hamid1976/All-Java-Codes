interface A{
    void a();
}
interface B{
    void b();
}
interface C{
    void c();
}
class ABC implements A,B,C{
    public void a(){
         System.out.println("I am  a()");
    }
	public void b(){
         System.out.println("I am  b()");
    }
	public void c(){
         System.out.println("I am  c()");
    }
}
class Interface_Multiple_inheritance{
 public static void main(String arg[]){
	 ABC ob=new ABC();
	 ob.a();
	 ob.b();
	 ob.c();
 }
 
 }