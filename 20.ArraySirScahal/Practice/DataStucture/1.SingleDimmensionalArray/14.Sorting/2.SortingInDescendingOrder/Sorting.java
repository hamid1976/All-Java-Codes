class Sorting{
	public static void main(String arg[]){
	int data[]={40,30,20,15,78,56,34};
	int temp;
		System.out.println("Array Before Swaping");
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length;j++){
				if(data[i]>data[j]){
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
					//System.out.println(data[i]);
				}
			}
		}
		System.out.println("Array After Swaping");
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
	}
}