class Box{
	int width;
	int height;
	int depth;
	
	 Box(int a,int b,int c){
		width=a;
		height=b;
		depth=c;
		//System.out.println("Volume is="+vol);
	}
}
class CompareObject{
	public static void main(String arg[]){
		Box ob=new Box(10,20,30);
		Box ob1=new Box(10,20,30);
		String 
		// ob.width=10;
		// ob.height=20;
		// ob.depth=15;
		
		// ob1.width=10;
		// ob1.height=20;
		// ob1.depth=15;
		
		// ob.volume();
		// ob1.volume();
		boolean b1=ob==ob1;
		
		System.out.println("ob "+ob);
		System.out.println("ob1 "+ob1);
		System.out.println(b1);
	}
}