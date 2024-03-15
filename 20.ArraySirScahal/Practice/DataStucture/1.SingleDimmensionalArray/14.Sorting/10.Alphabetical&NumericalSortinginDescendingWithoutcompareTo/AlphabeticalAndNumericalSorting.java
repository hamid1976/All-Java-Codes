class AlphabeticalAndNumericalSorting{
	public static void main(String arg[]){
		String data[]={"100","59","230","1999","120000","5","7"};
		String temp="";
		for(int i=0; i<data.length; i++){
			for(int j=0;j<data.length-1; j++){
				int a=Integer.parseInt(data[j]);
				int b=Integer.parseInt(data[j+1]);
				if(a<b){
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		for(int k=0;k<data.length; k++){
			System.out.println(data[k]);
		}
	}
}