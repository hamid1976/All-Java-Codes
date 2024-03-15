interface Usindh{
    void admission();//by default all methods are public abstract
    void examination();//by default all methods are public abstract
    void IT();//by default all methods are public abstract
    void BBA();//by default all methods are public abstract
    void MBA();//by default all methods are public abstract
}
class MIT implements Usindh{
	public void admission(){
		System.out.println("admission");
	}
	public void examination(){
		System.out.println("Examination");
	}
	public void IT(){
		System.out.println("4 year IT of MIT");
	}
	public void BBA(){
		System.out.println("4 year BBA of MIT");
	}
	public void MBA(){
		System.out.println("2 year MBA of MIT");
	}
}
class IMSA implements Usindh{
	public void admission(){
		System.out.println("admission");
	}
	public void examination(){
		System.out.println("Examination");
	}
	public void IT(){
		System.out.println("4 year IT of IMSA");
	}
	 public void BBA(){
		System.out.println("4 year BBA of IMSA");
	}
	public void MBA(){
		 System.out.println("2 year MBA of IMSA");
	 }
}
class CMS implements Usindh{
	public void admission(){
		System.out.println("admission");
	}
	public void examination(){
		System.out.println("Examination");
	}
	 public void IT(){
		 System.out.println("4 year IT of CMS");
	 }
	 public void BBA(){
		 System.out.println("4 year BBA of CMS");
	 }
	public void MBA(){
		 System.out.println("2 year MBA of CMS");
	 }
}
class Display{
	 static public void show(Usindh ob){
	   ob.admission();
       ob.examination();
       ob.IT();
	   ob.BBA();
	   ob.MBA();
    }
}
class Generalization_abs_Sindh{
	public static void main(String arg[]){
		 MIT  m = new MIT();
		 IMSA i = new IMSA();
		 CMS  c = new CMS();
		 
		 Display.show(m);
		 System.out.println("======================");
		 Display.show(i);
		 System.out.println("======================");
		 Display.show(c);
	}
}
		 
