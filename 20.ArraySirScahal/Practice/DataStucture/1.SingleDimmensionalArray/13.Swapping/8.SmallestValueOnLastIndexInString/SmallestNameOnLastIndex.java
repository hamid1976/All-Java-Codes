class SmallestNameOnLastIndex{
	public static void main(String arg[]){
		String data[]={"Wali","Ali","Hyder","Zahid","Kamran","Yasir","Hamid"};
		String temp="";
		
		for(int i=1;i<data.length;i++){
			int code=data[i].compareTo(data[i-1]);
			if(code>0){
				temp=data[i];
				data[i]=data[i-1];
				data[i-1]=temp;
			}
		}
		for(int k=0; k<data.length; k++){
			System.out.println(data[k]);
		}
	}
}