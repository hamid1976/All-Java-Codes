class A extends Thread{
	public void run(){//override
			for(int i=1; i<=5; i++){
				try{
				//1000milisecond =1Second
				Thread.sleep(500);
				}catch(Exception e){}
				System.out.println("Thread A="+i);	
			}
			System.out.println("Thread A Finished");
	}
}
class B extends Thread{
	public void run(){
			for(int i=1; i<10; i++){
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
				System.out.println("Thread B="+i);
			}
			System.out.println("Thread B Finished");
	}
}
class C extends Thread{
	public void run(){
			for(int i=1; i<=5; i++){
				try{
						Thread.sleep(1500);
				}catch(Exception e){}
				System.out.println("Thread C="+i);
			}
			System.out.println("Thread C Finished");
	}
}
class ThreadDemo{
	public static void main(String arg[]){
		A t1=new A();
		B t2=new B();
		C t3=new C();
		
		t1.start();
		t2.start();
		t3.start();
			for(int i=1; i<=20; i++){
				try{
						Thread.sleep(2000);
				}catch(Exception e){}
					System.out.println("Main Thread ="+i);
			}
			System.out.println("Main Thread Finished");
	}
}