class Boo{
	synchronized void First(Foo f){
		System.out.println("inside First() of Boo");
		try{
			Thread.sleep(500);
		}catch(Exception e){}
		f.Last();
	}
	synchronized void Last(){
		System.out.println("Last() of Boo");
	}
}

class Foo{
	synchronized void First(Boo b){
		System.out.println("inside First() of Foo");
		try{
			Thread.sleep(500);
		}catch(Exception e){}
		b.Last();
	}
	synchronized void Last(){
		System.out.println("Last() of Foo");
	}
}
class Producer extends Thread{
	Boo b;
	Foo f;
	Producer(Boo b, Foo f){
		this.b=b;
		this.f=f;
	}
	public void run(){
		b.First(f);
	}
}

class Consumer extends Thread{
	Boo b;
	Foo f;
	Consumer(Boo b, Foo f){
		this.b=b;
		this.f=f;
	}
	public void run(){
		f.First(b);
	}
}
class DeadLock{
	public static void main(String arg[]){
		Boo b=new Boo();
		Foo f=new Foo();
		Producer p=new Producer(b,f);
		Consumer c=new Consumer(b,f);
		p.start();
		c.start();
	}
}