class lowest{
	public static void main(String arg[]){
		int data[]={90,10,20,5,220,30,40,60};
		int temp;
		for(int i=0; i<data.length;i++){
			if(data[i]<data[0]){
				temp=data[i];
				data[i]=data[0];
				data[0]=temp;
			}
		}
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
	}
}