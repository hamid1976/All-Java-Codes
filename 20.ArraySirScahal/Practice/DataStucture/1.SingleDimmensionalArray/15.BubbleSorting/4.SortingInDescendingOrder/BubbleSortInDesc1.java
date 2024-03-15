class BubbleSortInDesc1{
	public static void main(String arg[]){
		int data[]={1000,909,734,535,153,1324,865,454,365,813,
		463,263,767,222,758,422,853,553,116,43,56,13,0,23,21,
		4,93,33,54,3};
	    int counter;
		int temp;
		for(counter=0; counter<data.length;){
			for(int i=0; i<data.length-1; i++){
				if(data[i]<data[i+1]){
					temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
				}
			}
			counter++;
		}
		for(int k=0; k<data.length; k++){
			System.out.println("["+k+"]="+data[k]);
		}
	}
}