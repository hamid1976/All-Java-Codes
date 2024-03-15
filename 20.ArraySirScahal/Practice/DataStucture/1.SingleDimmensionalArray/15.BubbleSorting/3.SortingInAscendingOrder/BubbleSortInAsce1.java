class BubbleSortInAsce1{
	public static void main(String arg[]){
		int data[]={1000,909,734,535,153,1324,865,454,365,813,463,263,767,222,758,422,853,553,116,43,56,13,0,23,21,4,93,33,54,3};
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