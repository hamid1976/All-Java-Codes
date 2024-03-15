class RemoveDuplicateData{
	public static void main(String arg[]){
		int data[]={1,2,1,2,3,4,3,4,5,6,5,4};
		int min=0;
		int k=0;
		for(int i=0; i<data.length;i++){
			for(int j=0; j<data.length;j++){
				 if(i!=j&&i<j){
					  if(data[j]==data[i]){
						System.out.println(data[j]);
						break;
					   }
					   
				 }
				
			}
				
		
		}
	}
}