class Demo implements Runnable{
	String name;
	Demo(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println(name+" : "+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
		System.out.println(name+" Finished....");
	}
}
class TestDemo{
	public static void main(String arg[]){
		Demo a=new Demo("A Thread");
		Demo b=new Demo("B Thread");
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
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