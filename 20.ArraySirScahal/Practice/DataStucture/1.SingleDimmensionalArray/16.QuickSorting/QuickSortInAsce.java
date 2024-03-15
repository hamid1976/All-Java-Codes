class QuickSortInAsce{
	public static void main(String arg[]){
		int data[]={2,4,6,3,1,7,10,9,8,5};
		//int temp;
		int out=0;
		int inn=0;
		for(int j=0; j<data.length/2; j++){
			out++;
			for(int i=j; i<data.length-j-1; i++){
				inn++;
				if(data[i]>data[i+1]){
					int temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;	
				}
				if(data[data.length-i-1]<data[data.length-i-2]){
					int item=data[data.length-i-1];
					data[data.length-i-1]=data[data.length-i-2];
					data[data.length-i-2]=item;	
				}
			}
			//break;
		}
		System.out.println("Outer="+out+"\nInner="+inn+"\n");
		for(int k=0; k<data.length; k++){
			System.out.println("["+k+"]="+data[k]);
		}
	}
}