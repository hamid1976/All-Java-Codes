class Demo extends Thread{
	public void run(){
		try{
			for(; ;){
				System.out.println("Begining=");
				Thread.sleep(50);
			}
		}catch(InterruptedException e){
			System.out.println("It is interrrupted");
		}
		System.out.println("Thread Finished");
	}
}
class TestInterrupted{
	public static void main(String arg[]){
		Demo t=new Demo();
		t.start();
		try{
			Thread.sleep(2000);
			t.interrupt();
			System.out.println("Main Thread End");
			System.out.println(t.isInterrupted());
			System.out.println(t.interrupted());
		}catch(Exception e){}
	}
}