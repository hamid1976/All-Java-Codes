class Marksheet{
	int java,cpp, python,vb,php;
    float obt, p;
	
	void set(int a,int  b,int c,int d,int e){
		java=a;
		cpp=b;
		python=c;
		vb=d;
	    php=e;
	}
	void obtain(){
	  obt=(java+cpp+python+vb+php);
	  System.out.println("Obtain="+obt);
	}
	void per(){
		p=obt*100/500;
		System.out.println("Percentage="+p);
	}
	void grade(){
	if(p>=80 && p<=100)
		System.out.println("Your Grade =A");
    else if(p>=60 && p<=80)
		System.out.println("Your Grade =B");
    else if(p>=40  && p<=60)
	    System.out.println("Your Grade =C");
    else if(p>=0 && p<40)
		System.out.println("Your Grade =Fail");
	else 
		System.out.println("Invalid marks entered");
	}
	void show(){
		 System.out.println("Java ="+java);
		System.out.println("C++   ="+cpp);
		System.out.println("Python="+python);
		System.out.println("VB    ="+vb);
		System.out.println("PHP   ="+php);
		}
}
class testmark{
	public static void main(String arg[]){
		Marksheet ob1=new Marksheet();
		Marksheet ob2=new Marksheet();
		
		ob1.set(90,50,60,88,70);
		ob2.set(95,90,93,95,88);
		
		ob1.show();
	    ob1.obtain();
		ob1.per();
		ob1.grade();
		
		ob2.show();
		ob2.obtain();
		ob2.per();
		ob2.grade();
     }
}