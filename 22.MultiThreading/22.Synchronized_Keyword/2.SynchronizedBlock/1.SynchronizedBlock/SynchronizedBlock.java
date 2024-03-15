class Account{
	 int amount =500;
	 synchronized void increment(){
		       Thread t=Thread.currentThread();
		       String name=t.getName();
		       System.out.println(name+" inside increment Method");
		       System.out.println("Amount : "+amount+" Threadc : "+name);
	      try{	
		       amount+=1500;
		       Thread.sleep(500);
		       System.out.println("Amount : "+amount+" Thread : "+name);
	   
		       amount+=1000;
		       Thread.sleep(1000);
		       System.out.println("Amount : "+amount+" Thread : "+name);
	           }catch(Exception e){}
	}
	synchronized void decrement(){ 
		       Thread t=Thread.currentThread();
		       String name=t.getName();
		       System.out.println(name+" inside decrement Method");
		       System.out.println("Amount : "+amount+" Thread : "+name);
	      try{
		       amount-=1500;
		       Thread.sleep(500);
		       System.out.println("Amount : "+amount+" Thread :"+name);
	
	
		       amount-=1000;
		       Thread.sleep(1000);
		       System.out.println("Amount : "+amount+" Thread: "+name);
	           }catch(Exception e){}
    }
}
 class Producer extends Thread{
	 Account acc;
	 Producer(Account acc){
		 this.acc=acc;
	 }
	 public void run(){
		 synchronized(acc){
		try{
			System.out.println("Producer inside Synchronized"); 
			sleep(5000);
			System.out.println("Producer still inside Synchronized");
			sleep(5000);
			System.out.println("Now Producer call increment");
			acc.increment();
			System.out.println("increment end in Producer");
			Thread.sleep(5000);
			System.out.println("Producer Synchronized Block End");
		}catch(Exception e){}
	 
	    }
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
 
 class SynchronizedBlock{
	 public static void main(String arg[]){
		 Account acc=new Account();		
		 Producer p=new Producer(acc);
		 Consumer c=new Consumer(acc);
		 p.setName("Producer");
		 c.setName("Consumer");
		 p.start();
		 c.start();
	 }
 }
	