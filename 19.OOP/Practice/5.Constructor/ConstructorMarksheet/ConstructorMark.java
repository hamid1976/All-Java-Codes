class Marksheet{
	private int java,english,science,php,python ,p,total,Obtain;
	Marksheet(int a,int b,int c,int d,int e){
		java=a;
		english=b;
		science=c;
		php=d;
		python=e;
	}
	void set(int a, int b ,int c,int d,int e){
		java=a;
		english=b;
		science=c;
		php=d;
		python=e;
	}
	void show(){
		obtain();
		percentage();
		grade();
	}
	void obtain(){
		Obtain=java+english+science+php+python;
		total=500;
		System.out.println("Total="+total);
		System.out.println("Obtain="+Obtain);
	}
	void percentage(){
		p=Obtain*100/total;
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
class ConstructorMark{
	public static void main(String arg[]){
		Marksheet ob=new Marksheet(50,60,70,80,90);
		ob.show();
		ob.set(55,77,88,92,57);
		ob.show();
	}
}