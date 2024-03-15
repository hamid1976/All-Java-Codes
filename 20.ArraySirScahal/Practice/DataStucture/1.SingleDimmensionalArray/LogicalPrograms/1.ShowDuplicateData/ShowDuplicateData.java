class ShowDuplicateData{
	public static void main(String arg[]){
		int data[]={1,2,3,3,4,3,7,5,6,7,7,8,9};
		
		for(int i=0; i<=data.length; i++){
			for(int j=i+1; j<data.length; j++){
				if(data[i]==data[j]){
					System.out.println(data[j]);
					break;
			    }	
			}
		}
	}
}