import java.io.*;
class PipedInputAndOutputStream3{
	public static void main(String arg[])throws Exception{
		try{
			PipedInputStream pInput=new PipedInputStream();
			PipedOutputStream pOutput=new PipedOutputStream();
		
			pInput.connect(pOutput);
		
			Producer p=new Producer(pOutput);
			Consumer c=new Consumer(pInput );
		
			p.start();
			c.start();
		}catch(Exception e){e.printStackTrace();}
	}
}
    class Consumer extends Thread{
	    PipedInputStream pInput=new PipedInputStream();
	       	Consumer(PipedInputStream pInput){
	            this.pInput=pInput;
			}
		public void run(){
			for(int i=65; i<91; i++){
				try{
					System.out.print((char)pInput.read());
					}catch(Exception e){e.printStackTrace();}
			}
		}
	}
    class Producer extends Thread{
		PipedOutputStream pOutput=new PipedOutputStream();
			Producer(PipedOutputStream pOutput){
				this.pOutput=pOutput;
			}
		public void run(){
			for(int i=65; i<91; i++){
				try{
				    pOutput.write(i);
					Thread.sleep(1000);
			        }catch(Exception e){e.printStackTrace();}
		    }
	    }
	}
		
