class Search{
	public static void main(String arg[]){
		int data[]={90,60,20,30,40};
		boolean b=true;
		int loc=data[3];
		int l=0;
		for(int i=0; i<data.length; i++){
			if(loc==data[i]){
				loc=data[i];
				l=i;
				b=false;
				break;
			}
		}
		if(b==false){
			System.out.println(loc+" Found on "+l+" Location");
		}else{
			System.out.println(loc+" Not Found ");
		}
	}
}