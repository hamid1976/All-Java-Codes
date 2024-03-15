class A implements Runnable{
	public void run(){
		for(int i=1; i<=5; i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){}
			System.out.println("Thread A="+i);
		}
		System.out.println("Thread A Finished");
	}
}
class B implements Runnable{
	public void run(){
		for(int i=1; i<=10; i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println("Thread B="+i);
		}
		System.out.println("Thread B Finished");
	}
}
class C implements Runnable{
	public void run(){
		for(int i=1; i<=15; i++){
			try{
				Thread.sleep(1500);
			}catch(Exception e){}
			System.out.println("Thread C="+i);
		}
		System.out.println("Thread C Finished");
	}
}
class RunnableDemo{
	public static void main(String arg[]){
		A a=new A();
		B b=new B();
		C c=new C();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=1; i<=20; i++){
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
			System.out.println("Thread Main="+i);
		}
		System.out.println("Main Thread Finished");
	}
}