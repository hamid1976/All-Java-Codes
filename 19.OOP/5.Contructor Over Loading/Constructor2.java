import java.util.*;

class Constructor2{
	
	public static void main(String arg[]){
		
		Rectaugle ob1=new Rectaugle(10,5);
		Rectaugle ob2=new Rectaugle(10,5,2);
		Rectaugle ob3=new Rectaugle(10 ,5,2,1);
		
		ob1.Show();
		ob2.Show();
		ob3.Show();
		
		
		
	}
}

class Rectaugle{
	
	int x;
	int y;
	int width;
	int height;
	
	Rectaugle(int a, int b){
		
		 x=a;
		 y=b;
		 System.out.println("======");
	}
	
	Rectaugle(int a,int b, int c){
		
		 x=a;
		 y=b;
		 width=c;
		  System.out.println("======");
		
		
	}
	
	Rectaugle(int a,int b, int c,int d){
		
		 x=a;
		 y=b;
		 width=c;
		 height=d;
		   System.out.println();
		 

		
	}
	
	void Show(){
		System.out.println(x+y+width+height);
		// System.out.println(y+"\n");
		// System.out.println(width);
		// System.out.println(height);
	}
	
}


















