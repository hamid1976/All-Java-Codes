class BubbleSortInAsce{
	public static void main(String arg[]){
		int data[]={3,4,5,7,8,6,2,10,1,9};
		int out=0;
		int inn=0;
		for(int j=1; j<data.length; j++){
			out++;
			for(int i=0; i<data.length-j; i++){
				inn++;
				if(data[i]>data[i+1]){
					data[i]=data[i]+data[i+1];
					data[i+1]=data[i]-data[i+1];
					data[i]=data[i]-data[i+1];
				}
			}
		}
		System.out.println("Outer="+out+"\nInner="+inn+"\n");
		for(int k=0; k<data.length; k++){
			System.out.println("["+k+"]="+data[k]);
		}
	}
}