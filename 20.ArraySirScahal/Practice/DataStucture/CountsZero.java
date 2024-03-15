class CountsZero{
	public static void main(String arg[]){
	
	int data[]={32,0,67,0,34,0,115,44,100,65};
	int count=0;
	int i;
	for(i=0; i<data.length-1; i++){
		if(data[i]==0){
			count++;
		}
	}
		System.out.println(count+" Elemets of zero");
		
  }
}