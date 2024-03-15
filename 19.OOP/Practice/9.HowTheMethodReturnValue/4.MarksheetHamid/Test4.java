import java.util.*;
class Test4{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		Marks ob1=new Marks();
		
		System.out.println("Enter Java Marks");
		int a=ob.nextInt();
		
		System.out.println("Enter English Marks");
		int b=ob.nextInt();
		
		System.out.println("Enter Science Marks");
		int c=ob.nextInt();
		
		System.out.println("Enter PHP Marks");
		int d=ob.nextInt();
		
		System.out.println("Enter Python Marks");
		int e=ob.nextInt();
		ob1.set(a,b,c,d,e);
		int obtain=a+b+c+d+e;
        int Tot=ob1.Total(500);
		int perc=obtain*100/Tot;
		int per=ob1.per(perc);
		String Grade=ob1.grade(per);
		System.out.println("Total="+Tot);
		System.out.println("Obtain="+obtain);
		System.out.println("Percentage="+per);
		System.out.println("Your Grade is="+Grade);
	}
}
class Marks{
	int java;
	int english;
	int science;
	int php;
	int python;
	int set(int a,int b,int c,int d,int e){
		java=a;
		english=b;
		science=c;
		php=d;
		python=e;
		return c;
	}
	int Total(int Tot){
		return Tot;
	}
	int obtain(int obtain){
		return obtain;
	}
	int per(int perc){
		return perc;
	}
	String grade(int per){
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
	}
}