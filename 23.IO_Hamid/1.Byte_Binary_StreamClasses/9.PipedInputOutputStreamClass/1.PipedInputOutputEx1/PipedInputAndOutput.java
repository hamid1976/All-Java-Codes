import java.io.*;
class PipedInputAndOutput{
	public static void main(String arg[])throws Exception{
		PipedInputStream  in=new PipedInputStream();
		PipedOutputStream out=new PipedOutputStream();
		
		//in.connect(out);
		out.connect(in);
		
		class Producer extends Thread{
			public void run(){
				for(int i=65; i<91; i++){
					try{
						out.write(i);
						Thread.sleep(500);
					}catch(Exception e){e.printStackTrace();}
				}
			}
		}//end Producer
		
		class Consumer extends Thread{
			public void run(){
				for(int i=65; i<91; i++){
					try{
						System.out.print((char)in.read());
					
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