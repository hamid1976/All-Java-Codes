import java.io.*;
class PipedInputAndOutputStream2{
	public static void main(String arg[])throws IOException, InterruptedException{
		PipedInputStream pInput=new PipedInputStream();
		PipedOutputStream pOutput=new PipedOutputStream();
		
		pInput.connect(pOutput);//pOutput.connect(pInput);
		
		/*Thread for writing data to pipe*/
		Thread pipeWriter=new Thread(new Runnable() {
			public void run(){
				for(int i=32; i<64; i++){
					try{
						pOutput.write(i);
						Thread.sleep(500);
					}catch(Exception e){
					e.printStackTrace();}
				}
			}
		});
		/*Thread for Reading data from pipe*/
		Thread pipeReader=new Thread(new Runnable() {
			public void run(){
				for(int i=65; i<91; i++){
					try{
						System.out.println((char)pInput.read());
						Thread.sleep(1000);
					}catch(Exception e){e.printStackTrace();}
				}
			}
		});
		
		pipeWriter.start();
		pipeReader.start();
		
		pipeWriter.join();
		pipeReader.join();
	}
}