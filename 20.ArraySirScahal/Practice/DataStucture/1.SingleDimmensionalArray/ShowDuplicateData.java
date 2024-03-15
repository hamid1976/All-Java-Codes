class ShowDuplicateData{
	public static void main(String arg[]){
		int data[]={1,2,1,2,3,4,3,4,5,6,5,4};
		String max="";
		//int min=0;
		int array[]={};
		for(int i=0; i<data.length;i++){
			for(int j=0; j<data.length;j++){
				 if(i!=j&&i<j){
					  if(data[i]==data[j]){
						//System.out.println(data[j]);
						array=data[j];
					 break;
					 }
					 //i++;
				 }
			}	
		}
		//int min=Integer.parseInt(max);
		//System.out.print(min);
		//int array[]=new int [min];
		//System.out.print(array.length);
		for(int i=0; i<array.length-1;i++){
			for(int j=0; j<array.length;j++){
				 if(i!=j&&i<j){
						if(data[i]==data[j]){
							System.out.println(data[j]);
						}
				}
			}
		}
		//System.out.println(min);
		/*output
		
			2
			3
			5
			7
			10
			*/
	}
}


// class DuplicateData{
			// int data[]={1,2,1,2,3,4,3,4,5,6,5,4};
			// int max=0;
			// int min=0;
			
			
				// for(int i=0; i<data.length;i++){
					// for(int j=0; j<data.length;j++){
						// if(i!=j&&i<j){
							// int duplicate(){
								// if(data[i]==data[j]){
									//sSystem.out.println(data[j]);
									// max=data.length;
									// break;	
								// }
								// return max;
							// }
						// }
					// }
						
				// }
						
				// /*output
			
				// 2
				// 3
				// 5
				// 7
				// 10
				// */
	// }
// class ShowDuplicateData{
	// public static void main(String arg[]){
		// DuplicateData ob=new DuplicateData();

        // int a=ob.duplicate();
			// System.out.println(a);
	// }
// }
		
