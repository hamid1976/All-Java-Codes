class Box{
	int width;
	int height;
	int depth;
	
	void volume(){
		int vol=width*height*depth;
		System.out.println("Volume is="+vol);
	}
}
class BoxDemo{
	public static void main(String arg[]){
		Box ob=new Box();
		Box ob1=new Box();
		
		ob.width=10;
		ob.height=20;
		ob.depth=15;
		
		ob1.width=9;
		ob1.height=3;
		ob1.depth=6;
		
		ob.volume();
		ob1.volume();
		
	}
}