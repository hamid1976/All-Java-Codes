class Dele1{
	public static void main(String arg[]){
		int data[]={90,60,20,30,40};
		//int item=500;
		int loc=3;
		int c=0;
		for(int i=0; i<data.length; i++){
			if(i==data.length-1){
				if(i==loc){
					data[i]=0;
					System.out.println("data["+i+"]="+data[i]);
					break;
				}else{
					
					System.out.println("data["+c+"]="+data[i]);
					data[i]=0;
					System.out.println("data["+i+"]="+data[i]);
					break;
				}
			}
			if(i==loc){
				c++;
				c--;
		    }else{
				System.out.println("data["+c+"]="+data[i]);
				c++;
			}
		}
	}
}