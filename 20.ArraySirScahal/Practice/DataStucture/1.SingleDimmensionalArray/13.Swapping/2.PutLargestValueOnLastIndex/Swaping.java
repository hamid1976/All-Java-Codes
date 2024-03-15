class Swaping{
	public static void main(String arg[]){
	int data[]={40,100,20,400,15,78,200,34};
	int temp;
		System.out.println("Array Before Swaping");
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
		//for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length-1;j++){
				if(data[j]>data[j+1]){
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
				
			}
		//}

		System.out.println("Array After Swaping");
		for(int i=0; i<data.length; i++){
			// if(i==data.length-1){
				// if(data[0]>data[i]){
					// temp=data[0];
					// data[0]=data[i];
					// data[i]=temp;
					//System.out.println("["+i+"]="+data[i]);
				// }
			// }
			System.out.println("["+i+"]="+data[i]);
		}
		
	}
}