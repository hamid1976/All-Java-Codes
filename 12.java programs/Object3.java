import java.util.*;

class Object3{
	
	public static void main(String arg[]){
		
		Rectaugle r1=new Rectaugle();
		Rectaugle r2=new Rectaugle();
		
		r1.x=10;
		r1.y=20;
		r1.width=30;
		r1.height=40;
		
		r2.x=100;
		r2.y=200;
		r2.width=300;
		r2.height=400;
		
		System.out.println(r1.x+r2.x);
		System.out.println(r1.y+r2.y);
		
		System.out.println(r1.width+r2.width);
		System.out.println(r1.height+r2.height);
		
		
		
		
		
		
		
	}
	
}

class Rectaugle{
	
	int x;
	int y;
	int width;
	int height;
	
}
