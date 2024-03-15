class Test{
	double per(int obtain){
		double p=(double)obtain*100/500;
		return p;
	}
	int obtain(int a,int b,int c,int d,int e){
		int obt=a+b+c+d+e;
		return obt;
	}//end obtain
	String grade(double per){
		if(per>=90 && per<=100)
			  return "A1 Grade";
		else if(per>=80 && per<=90)
			  return "A Grade";
		else if(per>=70 && per<=80)
			  return "B Grade";
		else  if(per>=60 && per<=70)
			  return "C Grade";
		else  if(per>=50 && per<=60)
			  return "D Grade";
		else  if(per<=50)
			  return "Fail";
		else
			  return"Invalid percentage";
    }//end grade
}
class MarksheetReturn{
	public static void main(String [] arg){
	Test ob=new Test();
	int a=ob.obtain(50,60,70,80,90);
	double b=ob.per(a);
	String c=ob.grade(b);
	System.out.println("Obain Marks "+a);
	System.out.println("Per is "+b);
	System.out.println("Grade is "+c);
	}
}
	