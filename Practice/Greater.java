class Greater{
	public static void main(String arg[]){
		int data[]={90,330,10,220,30,100};
		int temp;
		for(int i=1; i<data.length; i++){
			if(data[i-1]>data[i]){
				 temp=data[i-1];
				 data[i-1]=data[i];
				 data[i]=temp;	
			}
		}
		for(int k=0; k<data.length; k++){
			System.out.println(data[k]);
		}
	}
}