class BubbleSortStringWithCounter{
	public static void main(String[] args){
		String data[]={"100","59","230","1999","120000","5","7"};
		String temp="";
		int out=0;
		int counter=0;
		System.out.println("Before Sorting");
		for(int j=0; j<data.length;j++){
			System.out.println("["+j+"] = "+data[j]);
		}
		for(int k=0;k<data.length-1;k++){
			counter++;
			for(int i=0; i<data.length-1;i++){
				//inn++;
				int code=data[i].compareTo(data[i+1]);
				if(code>0){
					temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
				}
			out++;
			}
		}
		System.out.println("Counter="+counter+"\nInner counter="+out);
		System.out.println("After Sorting");
		for(int j=0; j<data.length;j++){
			System.out.println("["+j+"] = "+data[j]);
		}
	}
}