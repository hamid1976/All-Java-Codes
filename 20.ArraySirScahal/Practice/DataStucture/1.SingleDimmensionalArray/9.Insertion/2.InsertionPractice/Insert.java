class Insert{
	public static void main(String arg[]){
		int data[]={90,60,20,30,40};
		int item=500;
		int loc=3;
		int c=0;
		for(int i=0; i<data.length; i++){
			if(i==data.length){
				if(i==loc){
					System.out.println("data["+i+"]="+item);
				}
			}
			if(i==loc){
				System.out.println("data["+i+"]="+item);
				c++;
			}
			if(i==data.length-1){
				
			}else
				System.out.println("data["+c+"]="+data[i]);
			c++;
		}
	}
}