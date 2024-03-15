class Account{
	int amount=500;
	
	synchronized void increment(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Amount : "+amount+" Thread : "+name);
		System.out.println("Inside increment Method");
		
		amount+=1500;
		try{
			Thread.sleep(500);
		}catch(Exception e){}
		System.out.println("Amount : "+amount+" Thread : "+name);
		
		amount+=1000;
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		System.out.println("Amount : "+amount+" Thread : "+name);
		
	}
	synchronized void decrement(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Amount : "+amount+" Thread : "+name);
		System.out.println("Inside Decrement Method");
		
		amount-=1500;
		try{
			Thread.sleep(500);
		}catch(Exception e){}
		System.out.println("Amount : "+amount+" Thread : "+name);
		
		amount-=1000;
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		System.out.println("Amount : "+amount+" Thread : "+name);
		
	}
}
class Producer extends Thread{
	Account acc;
	Producer(Account acc){
		this.acc=acc;
	}
	public void run(){
		acc.increment();
	}
}
class Consumer extends Thread{
	Account acc;
	Consumer(Account acc){
		this.acc=acc;
	}
	public void run(){
		acc.decrement();
	}
}
class TestSynch{
	public static void main(String arg[]){
		Account acc=new Account();
		Producer p=new Producer(acc);
		Consumer c=new Consumer(acc);
		p.start();
		c.start();
	}
}