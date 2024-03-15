class LargeValueOnTop{
	public static void main(String arg[]){
		String data[]={"Ali","Wali","Hyder","Zahid","Kamran","Yasir","Hamid"};
		String temp="";
		System.out.println("Before");
		for(int j=0;j<data.length;j++){
			System.out.println("["+j+"] = "+data[j]);
		}
		System.out.println("After");
		for(int i=0;i<data.length;i++){
			int code=data[0].compareTo(data[i]);
			if(code<0){
				temp=data[i];
				data[i]=data[0];
				data[0]=temp;
			}
		}
		for(int k=0; k<data.length; k++){
			System.out.println("["+k+"] = "+data[k]);
		}
	}
}