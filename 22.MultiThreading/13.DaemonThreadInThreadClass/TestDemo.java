class Demo extends Thread{
	Demo(String name){
		super(name);
	}
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println(getName()+" : "+i);
			try{
				sleep(500);
			}catch(Exception e){}
		}
		System.out.println(getName()+" Finished....");
	}
}
class TestDemo{
	public static void main(String arg[]){
		Demo t1=new Demo("A Thread");
		Demo t2=new Demo("B Thread");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread Waiting for one Second");
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		System.out.println("Main Thread End");
	}
}