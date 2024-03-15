abstract class Usindh{
	void admission(){
		System.out.println("admission");
	}
	void examination(){
		System.out.println("Examination");
	}
	abstract void IT();
	abstract void BBA();
	abstract void MBA();
}
class MIT extends Usindh{
	void IT(){
		System.out.println("4 year IT of MIT");
	}
	void BBA(){
		System.out.println("4 year BBA of MIT");
	}
	void MBA(){
		System.out.println("2 year MBA of MIT");
	}
}
class IMSA extends Usindh{
	void IT(){
		System.out.println("4 year IT of IMSA");
	}
	 void BBA(){
		System.out.println("4 year BBA of IMSA");
	}
	void MBA(){
		 System.out.println("2 year MBA of IMSA");
	 }
}
class CMS extends Usindh{
	 void IT(){
		 System.out.println("4 year IT of CMS");
	 }
	 void BBA(){
		 System.out.println("4 year BBA of CMS");
	 }
	void MBA(){
		 System.out.println("2 year MBA of CMS");
	 }
	 void examination(){
		 super.examination();
	 }
}
class Display{
	 static void show(Usindh ob){
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
		 
