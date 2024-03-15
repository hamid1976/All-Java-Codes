class highest{
	public static void main(String arg[]){
		int data[]={90,10,20,220,30,40,60};
		int temp;
		for(int i=1; i<data.length; i++){
			if(data[i-1]>data[i]){
				temp=data[i-1];
				data[i-1]=data[i];
				data[i]=temp;
			}
		}
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
	}
}