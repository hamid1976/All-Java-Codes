class DiscName{
	public static void main(String arg[]){
			String name[]={"Hamid","Zubair","Sardar","Khadim","Babar","Farhan","Ahmed"};
			String temp="";
			for(int j=0; j<name.length; j++){
				for(int i=0; i<name.length-1; i++){
					int code=name[i].compareTo(name[i+1]);
					if(code<0){
						temp=name[i+1];
						name[i+1]=name[i];
						name[i]=temp;
					}
				}
			}
			for(int k=0; k<name.length; k++){
			System.out.println(name[k]);
		}
	}
}