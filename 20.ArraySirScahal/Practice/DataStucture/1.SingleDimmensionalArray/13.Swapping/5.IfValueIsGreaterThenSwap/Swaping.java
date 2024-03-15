class Swaping{
	public static void main(String arg[]){
		int data[]={33,110,65,20,3};
		int temp;
		for(int i=0; i<data.length; i++){
			if(data[0]>data[1]){
				temp=data[0];
				data[0]=data[1];
				data[1]=temp;
			}
			if(data[1]>data[2]){
				temp=data[1];
				data[1]=data[2];
				data[2]=temp;
			}
			if(data[2]>data[3]){
				temp=data[2];
				data[2]=data[3];
				data[3]=temp;
			}
			if(data[3]>data[4]){
				temp=data[3];
				data[3]=data[4];
				data[4]=temp;
			}
		}
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}
	}
}