class Marksheet{
	static int java,english,science,php,python,total,obtain,per;
	// Marksheet(int a,int b,int c,int d,int e){
		// java=a;
		// english=b;
		// science=c;
		// php=d;
		// python=e;
	// }
	void obtain(){
		total=500;
		obtain =java+english+science+php+python;
		System.out.println("Total Marks="+total);
		System.out.println("Obtain Marks="+obtain);
	}
	void percentage(){
		per=obtain*100/total;
		System.out.println("Percentage="+per);
	}
	void grade(){
		if(per>=90 && per<100)
			System.out.println("A1 Grade");
		else 
			if(per>=80 && per<90)
				System.out.println("A Grade");
		    else 
				if(per>=70 && per<80)
					System.out.println("B Grade");
				else 
					if(per>=60 && per<70)
						System.out.println("C Grade");
					else 
						if(per>=50 && per<60)
							System.out.println("D Grade");
						else 
							if(per<50)
								System.out.println("You are Fail");
	}
}
class StaticVariable{
	public static void main(String arg[]){
		Marksheet ob1=new Marksheet();
        Marksheet ob2=new Marksheet();
		Marksheet.java=50;
		Marksheet.english=60;
		Marksheet.science=70;
		Marksheet.php=85;
		Marksheet.python=75;
        System.out.println("Java Marks="+Marksheet.java);
		System.out.println("English Marks="+Marksheet.english);
		System.out.println("Science Marks="+Marksheet.science);
		System.out.println("PHP Marks="+Marksheet.php);
		System.out.println("Python Marks"+Marksheet.python+"\n");
        ob1.obtain();
		ob1.percentage();
        ob1.grade();
		
        System.out.println("=========Student two========");	
		ob1.java=80;
		ob1.english=90;
		ob1.science=70;
		ob1.php=85;
		ob1.python=55;
        System.out.println("Java Marks="+ob1.java);
		System.out.println("English Marks="+ob1.english);
		System.out.println("Science Marks="+ob1.science);
		System.out.println("PHP Marks="+ob1.php);
		System.out.println("Python Marks"+ob1.python+"\n");
	    ob1.obtain();
		ob1.percentage();
        ob1.grade();
		
		System.out.println("=========Student three========");	
		ob2.java=90;
		ob2.english=90;
		ob2.science=80;
		ob2.php=85;
		ob2.python=75;
        System.out.println("Java Marks="+ob2.java);
		System.out.println("English Marks="+ob2.english);
		System.out.println("Science Marks="+ob2.science);
		System.out.println("PHP Marks="+ob2.php);
		System.out.println("Python Marks"+ob2.python+"\n");
		
	    ob2.obtain();
		ob2.percentage();
        ob2.grade();
		
		
	}
}