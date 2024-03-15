class StringArraySmallNameAtLast{
	public static void main(String[] args){
		String std[]={"Ali","Wali","Hyder","Zahid","Kamran","Yasir","Hamid"};
		
		System.out.println("Before");
		for(int k=0;k<std.length;k++){
			System.out.println("["+k+"] = "+std[k]);
		}
		
		String temp="";
		int comp;
		
		for(int i=0;i<std.length-1;i++){
			comp=std[i].compareTo(std[i+1]);
			if(comp<0){
				temp=std[i];
				std[i]=std[i+1];
				std[i+1]=temp;
			}
		}
		
		System.out.println("After");
		for(int j=0;j<std.length;j++){
			System.out.println("["+j+"] = "+std[j]);
		}
	
	}
}