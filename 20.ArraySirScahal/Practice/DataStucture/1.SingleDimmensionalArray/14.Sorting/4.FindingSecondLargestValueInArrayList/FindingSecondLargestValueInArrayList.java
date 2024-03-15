class FindingSecondLargestValueInArrayList{
	public static void main(String arg[]){
	int data[]={40,30,20,15,78,56,34};
	int temp;
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length;j++){
				if(data[j]>data[i]){
					temp=data[j];
					data[j]=data[i];
					data[i]=temp;
				}
			}
		}
		for(int i=0; i<data.length; i++){
			if(i==data.length-2)
			System.out.println(data[i]);
		}
	}
}