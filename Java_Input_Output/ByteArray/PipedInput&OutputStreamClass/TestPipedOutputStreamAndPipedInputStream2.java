import java.io.*;
class TestPipedOutputStreamAndPipedInputStream2{
	public static void main(String[] args)throws Exception {
		PipedOutputStream pout = new PipedOutputStream();	
		PipedInputStream pin = new PipedInputStream(pout);	
		
		Producer p = new Producer(pout);
		p.start();
		Consumer c = new Consumer(pin);
		c.start();
	}
}
class Producer extends Thread{
	PipedOutputStream pout = new PipedOutputStream();
	Producer(PipedOutputStream p){
		pout=p;
	}
	public void run(){
		try{
			for (int i=1; i<20; i++) {
				pout.write(i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Consumer extends Thread{
	PipedInputStream pin = new PipedInputStream();	
	Consumer(PipedInputStream pi){
		pin=pi;
	} 
	public void run(){
		try{
			for (int i=1; i<20; i++) {
				System.out.println("input: "+(char)pin.read());
				Thread.sleep(1500);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}
