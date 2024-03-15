class Duplicate{
	public static void main(String arg[]){
		int data[]={1,1,1,2,2,3,4,4,4,5,6,7,7,7,8,8,9};
		//int max[]={};
		int min=0;
		int i,j;
		for(i=0; i<data.length;i++){
			for(j=i+1; j<data.length;j++){		
					 if(data[i]==data[j]){
						//int  min=0;
							 min++;
							 System.out.println("min"+min);
						 if(min>=1){
							if(data[j]==data[min]){
							// for(min=1; min<data.length; min++){
								 // if(data[i]!=data[j]){
								
										// System.out.println(data[i]);
										
								// }
										System.out.println(data[j]);
							}
								// if(min==1){
								// }
								// if(min==2){
										// System.out.println(data[j]);
								// }
								// if(min==3){
										// System.out.println(data[j]);
								// }
								// if(min==4){
										// System.out.println(data[j]);
								// }
								// if(min==5){
										 // System.out.println(data[j]);
								// }
								// if(min==6){
										 // System.out.println(data[j]);
								// }
								// if(min==7){
										// System.out.println(data[j]);
								// }
							}else{
								break;
							}
						 }
						//break;
					 }
		
			}
				
		
		//System.out.println(min);
		
		
		
		
	}
}