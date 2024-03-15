class Bracket{
	//public static int counter;
	
	 synchronized void generate(){
			for(int i=1; i<=10; i++){
				if(i<=5){
					System.out.print("[");
				}else{
					System.out.print("]");
				}
			}
				System.out.println();
	}
	
}
class SynchronizedBrackets{
	public static void main(String arg[]){
		Bracket ob=new Bracket();
		
		new Thread(new Runnable(){
			public void run(){
				for(int i=1; i<=5; i++){
					ob.generate();
				}
				//System.out.print("Hamid");
				
			}
		}).start();
		
		
	
		new Thread(new Runnable(){
			public void run(){
				for(int i=1; i<=5; i++){
					ob.generate();
				}
				//System.out.print("Ahsan");
			}
		}).start();
		
	}
}