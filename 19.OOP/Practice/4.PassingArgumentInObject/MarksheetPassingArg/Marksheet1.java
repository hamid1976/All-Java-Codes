class Marksheet{
int java,english,php,python,science,p,obtain,Total;
  void set(int a ,int b,int c,int d,int e){
	  java=a;
	  english=b;
	  php=c;
	  python=d;
	  science=e;
  }
  void display(){
	  System.out.println("Java="+java);
	  System.out.println("English="+english);
	  System.out.println("PHP="+php);
	  System.out.println("Python="+python);
	  System.out.println("Science="+science);
  }
  void obtain(){
	   obtain=java+english+php+python+science;
	  //int Total =500;
	  System.out.println("Obtain="+obtain);
  }
  void total(){
	  Total=500;
	   System.out.println("Total="+Total);
  }
  void percentage(){
	  p=obtain*100/Total;
	  System.out.println("Percentage="+p);
  }
  void grade(){
  if(p>=90 && p<=100){
		  System.out.println("A1 Grade");
	 }
	  else if(p>=80 && p<=90){
		  System.out.println("Aa Grade");
	  }
		 else if(p>=70 && p<=80){
			  System.out.println("B Grade");
		  }
			else  if(p>=60 && p<=70){
				  System.out.println("C Grade");
			  }
				else  if(p>=50 && p<=60){
					  System.out.println("D Grade");
				  }
					else  if(p<=50){
						  System.out.println("Fail");
					  }  
     }     
}  
class Marksheet1{
	public static void main(String arg[]){
		Marksheet ob =new Marksheet();
		ob.set(50,60,70,80,90);
		ob.display();
		ob.total();
		ob.obtain();
		ob.percentage();
		ob.grade();
		System.out.println("========================================");
		Marksheet ob1=new Marksheet();
		ob1.set(70,65,82,45,95);
		ob1.display();
		ob1.total();
		ob1.obtain();
		ob1.percentage();
		ob1.grade();
	}
}
		
		