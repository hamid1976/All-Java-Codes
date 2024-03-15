import java.io.*;
class TestPipedOutputStreamAndPipedInputStream{
	public static void main(String[] args)throws Exception {
		PipedOutputStream pout = new PipedOutputStream();	
		PipedInputStream pin = new PipedInputStream();
		pout.connect(pin);	
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0; i<30; i++){
					try{
						pout.write(i);
						Thread.sleep(1500);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0; i<30; i++){
					try{
						System.out.println(pin.read());
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}