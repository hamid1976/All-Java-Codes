class BubbleSortStringInDescending{
	public static void main(String[] args){
		String data[]={"100","59","230","1999","120000","5","7"};
		String temp="";
		int out=0;
		int inn=0;
		System.out.println("Before Sorting");
		for(int j=0; j<data.length;j++){
			System.out.println("["+j+"] = "+data[j]);
		}
		for(int k=0;k<data.length-1;k++){
			out++;
			for(int i=0; i<data.length-1;i++){
				inn++;
				int a=Integer.parseInt(data[i]);
				int b=Integer.parseInt(data[i+1]);
				
				if(a<b){
					temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
				}
			}
		}
		System.out.println("\nOuter Loop="+out+"\nInner Loop="+inn+"\n");
		System.out.println("After Sorting");
		for(int j=0; j<data.length;j++){
			System.out.println("["+j+"] = "+data[j]);
		}
	}
}