class DemoThread implements Runnable{
	int counter=0;
	
	public void run(){
		while(true){
			counter++;
		}
	} 
}
class TestThreadPriority{
	public static void main(String arg[]){
		DemoThread a=new DemoThread();
		DemoThread b=new DemoThread();
		DemoThread c=new DemoThread();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start(); t2.start(); t3.start();
		
		System.out.println("Main Thread Waiting for 2 Seconds...");
		try{
			Thread.sleep(2000);
		}catch(Exception e){}
		
		t1.stop();  t2.stop();  t3.stop();
		
		System.out.println(t1.getName()+" Thread : "+a.counter);
		System.out.println(t2.getName()+" Thread : "+b.counter);
		System.out.println(t3.getName()+" Thread : "+c.counter);
	}
}