interface X{
	void x();
}
interface Y{
	void y();
}
interface Z{
	void z();
}
interface XYZ extends X,Y,Z{
	void xyz();
}
class XYZIMP implements XYZ{
	public void x(){
		System.out.println("I am x()" );
	} 
	public void y(){
		System.out.println("I am y()" );
	} 
	public void z(){
		System.out.println("I am z()" );
	} 
	public void xyz(){ 
	System.out.println("I am xyz()" );
	}
}	
class Test{
	public static void main(String arg[]){
		XYZIMP ob=new XYZIMP();
		ob.x();
		ob.y();
		ob.z();
		ob.xyz();
	}
}