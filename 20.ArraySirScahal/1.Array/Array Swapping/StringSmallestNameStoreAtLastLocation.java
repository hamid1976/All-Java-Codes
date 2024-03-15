class StringSmallestNameStoreAtLastLocation{
	public static void main(String[] args){
		String std[]={"Ali","Wali","Hyder","Zahid","Kamran","Yasir","Hamid"};
		
		System.out.println("Before");
		for(int i=0;i<std.length;i++){
			System.out.println("["+i+"] = "+std[i]);
		}
		
		for(int j=0;j<std.length-1;j++){
			if(std[j].compareTo(std[j+1])<0){
				String temp=std[j];
				std[j]=std[j+1];
				std[j+1]=temp;
			}//end swaping
		}//end swaping loop
		
		System.out.println("\n\nAfter Swaping");
		for(int k=0;k<std.length;k++){
			System.out.println("["+k+"] ="+std[k]);
		}
	}
}