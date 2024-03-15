import java.io.*;
class PipedInputAndOutputStream1{
	public static void main(String arg[])throws IOException{
		PipedInputStream pInput=new PipedInputStream();
		PipedOutputStream pOutput=new PipedOutputStream();
		
		pInput.connect(pOutput);//pOutput.connect(pInput);
		
		class Producer extends Thread{
			public void run(){
				for(int i=32; i<64; i++){
					try{
						pOutput.write(i);
						Thread.sleep(500);
					}catch(Exception e){
					e.printStackTrace();}
				}
			}
		}
		class Consumer extends Thread{
			public void run(){
				for(int i=65; i<91; i++){
					try{
						System.out.println((char)pInput.read());
						Thread.sleep(1000);
					}catch(Exception e){e.printStackTrace();}
				}
			}
		}
		Producer p=new Producer();
		Consumer c=new Consumer();
		p.start();
		c.start();
	}
}