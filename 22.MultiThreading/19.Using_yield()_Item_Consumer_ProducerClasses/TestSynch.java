class Item{
	int num;
	
	void set(int n){
		this.num=n;
		System.out.println("SET: "+n);
	}
	int get(){
		System.out.println("GET: "+num);
		return num;
	}
}//end Item

class Consumer extends Thread{
	Item item;
	Consumer(Item item){
		this.item=item;
	}
	public void run(){
		while(true){
			item.get();
			yield();
		}
	}
}//end Consumer

class Producer extends Thread{
	Item item;
	Producer(Item item){
		this.item=item;
	}
	public void run(){
		int counter=0;
		while(true){
			item.set(++counter);
			yield();
		}
	}
}
class TestSynch{
	public static void main(String arg[]){
		Item item=new Item();
		
		Producer p=new Producer(item);
		Consumer c=new Consumer(item);
		
		p.start();
		c.start();
	}
}