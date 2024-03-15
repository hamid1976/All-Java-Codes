class Swaping{
	public static void main(String arg[]){
		int data[]={33,110,65,20,3};
		int temp;
		for(int i=0; i<data.length; i++){
			if(data[1]>data[3]){
				temp=data[1];
				data[1]=data[3];
				data[3]=temp;
			}
			
		}
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}
	}
}