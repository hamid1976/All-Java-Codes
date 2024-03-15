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
class xyzimp implements XYZ{
	public void xyz(){
		System.out.println("I am xyz()");
	}
	public void x(){
		System.out.println("I am x()");
	}
	public void y(){
		System.out.println("I am y()");
	}
	public void z(){
		System.out.println("I am z()");
	}
}
class mult_interface_demo2{
      public static void main(String arg[]){
		 xyzimp ob=new xyzimp();
		 ob.xyz();
		 ob.x();
		 ob.y();
		 ob.z();		  
	  }
}