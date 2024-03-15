import java.util.*;
class ReturnMarksheetEx2{
	public static void main(String arg[]){
		Marksheet ob1=new Marksheet();
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter Java Marks:");
		int a=ob.nextInt();
		System.out.println("Enter English Marks:");
		int b=ob.nextInt();
		System.out.println("Enter Science Marks:");
		int c=ob.nextInt();
		System.out.println("Enter php Marks:");
		int d=ob.nextInt();
		System.out.println("Enter Python Marks:");
		int e=ob.nextInt();
		
		int obtain=a+b+c+d+e;
		int percentage=obtain*100/500;
		
		int set=ob1.set(a,b,c,d,e,obtain,percentage);
		int obt=ob1.obtain();
		int per=ob1.per();
		String grad=ob1.grade();
		
		System.out.println("Obtain:"+obt);
		System.out.println("Percentage:"+per);
		System.out.println("Grade : "+grad);

	}
}	
class Marksheet{
	int java;
	int english;
	int science;
	int php;
	int python;
	int obt;
	int per;
	int set(int a,int b,int c,int d,int e,int f,int g){
      java=a;
      english=b;
      science=c;
      php=d;
      python=e;
      obt=f;
      per=g;
      return d;
	}
	int obtain(){
		//bot=s1+s2+s3+s4+s5;
		return obt;
	}
	int per(){
		//pr=bot*100/500;
		return per;
	}
	String grade(){
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