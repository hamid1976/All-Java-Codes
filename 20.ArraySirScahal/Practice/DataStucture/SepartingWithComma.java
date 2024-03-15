class SepartingWithComma{
	public static void main(String arg[]){
	
	int data[]={32,0,67,0,34,0,115,44,100,65};
	int i;
	for(i=0; i<data.length; i++){
		if(i>0){
			System.out.print(" , ");
		}
		System.out.print(data[i]);
	}
		
  }
}