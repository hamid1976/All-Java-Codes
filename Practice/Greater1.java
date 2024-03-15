class Greater1{
	public static void main(String arg[]){
		int data[]={90,330,10,220,30,100};
		int temp;
		int ham=data.length;
		for(int i=0; i<data.length; i++){
			if(data[i]>ham){
				 temp=ham;
				 ham=data[i];
				 data[i]=temp;	
			}
		}
		for(int k=0; k<data.length; k++){
			System.out.println(data[k]);
		}
	}
}