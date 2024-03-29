class Box{
	private int width ,height,depth;
	Box(Box ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Box(int w,int h,int d){
		width=w;
		height=h;
		depth=d;
	}
	Box(){
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(int len){
		width=height=depth=len;
	}
	int volume(){
		return width*height*depth;
	}
}
class BoxWeight extends Box{
	int weight;
	BoxWeight(BoxWeight ob){
		super(ob);
		weight=ob.weight;
	}
	BoxWeight(int w,int h,int d,int m){
		super(w,h,d);
		weight=m;
	}
	BoxWeight(){
		super();
		weight=-1;
	}
	BoxWeight(int len,int m){
		super(len);
		weight=m;
	}
}
class DemoSuper{
	public static void main(String arg[]){
		BoxWeight mybox1 =new BoxWeight(10,20,15,34);
		BoxWeight mybox2 =new BoxWeight(2,3,4,0);
		BoxWeight mybox3 =new BoxWeight();
		BoxWeight mycube =new BoxWeight(3,2);
		BoxWeight myclone=new BoxWeight(mybox1);
		
		int vol;
		
		vol=mybox1.volume();
		System.out.println("Volume of mybox1 is "+vol);
		System.out.println("Volume of mybox1 is "+mybox1.weight);
		System.out.println();
		
		vol=mybox2.volume();
		System.out.println("Volume of mybox1 is "+vol);
		System.out.println("Volume of mybox1 is "+mybox2.weight);
		System.out.println();
		
		vol=mybox3.volume();
		System.out.println("Volume of mybox1 is "+vol);
		System.out.println("Volume of mybox1 is "+mybox3.weight);
		System.out.println();
		
		vol=mycube.volume();
		System.out.println("Volume of mybox1 is "+vol);
		System.out.println("Volume of mybox1 is "+mycube.weight);
		System.out.println();
		
		
		vol=myclone.volume();
		System.out.println("Volume of mybox1 is "+vol);
		System.out.println("Volume of mybox1 is "+myclone.weight);
		System.out.println();
		
	}
}