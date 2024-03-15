class Demo extends Thread{
	int loop;
	int sleep;
	
	Demo(String name,int loop,int sleep){
		super(name);
		this.loop=loop;
		this.sleep=sleep;
		
		start();
	}
	public void run(){
		for(int i=1; i<=loop; i++){
			try{
				sleep(sleep);
			}catch(Exception e){}
			System.out.println(getName()+" Thread: "+i);
		}
		System.out.println(getName()+" Thread Finished");
	}//end run
}
class TestThread{
	public static void main(String arg[]){
		Demo t1=new Demo("A",5,500);
		Demo t2=new Demo("B",10,1000);
		Demo t3=new Demo("C",15,1500);
		try{
			System.out.println(t1.getName()+" Thread : "+t1.isAlive());
			System.out.println(t2.getName()+" Thread : "+t2.isAlive());
			System.out.println(t3.getName()+" Thread : "+t3.isAlive());
			
			System.out.println("Main Thread Blocked until " +t1.getName()+" Thread Finished/Dead");
			t1.join();//current Thread Blocked
			
			
			System.out.println(t1.getName()+" Thread : "+t1.isAlive());
			System.out.println(t2.getName()+" Thread : "+t2.isAlive());
			System.out.println(t3.getName()+" Thread : "+t3.isAlive());
			
			System.out.println("Main Thread Blocked until "+t2.getName()+" Thread Blocked");
			t2.join();//current Thread Blocked
			
			
			
			System.out.println(t1.getName()+" Thread : "+t1.isAlive());
			System.out.println(t2.getName()+" Thread : "+t2.isAlive());
			System.out.println(t3.getName()+" Thread : "+t3.isAlive());
			
			System.out.println("Main Thread Blocked until "+t3.getName()+" Thread Dead");
			t3.join();//current Thread Blocked
		}catch(Exception e){
			e.printStackTrace();
		}	
		
		System.out.println(t1.getName()+" Thread : "+t1.isAlive());
		System.out.println(t2.getName()+" Thread : "+t2.isAlive());
		System.out.println(t3.getName()+" Thread : "+t3.isAlive());
		
		System.out.println("Main Thread Finished");
		
	}
}