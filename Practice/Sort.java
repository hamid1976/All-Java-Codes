class Sort{
	public static void main(String arg[]){
		String name[]={"Ali","Zahid","Asif","Khadim","Babar","Farhan","Ahmed"};
		String temp=" ";
		
		for(int j=0; j<name.length;j++){
			for(int i=0; i<name.length-1;i++){
				int code=name[i].compareTo(name[i+1]);
				System.out.println(code);
				if(code>0){
					temp=name[i];
					name[i]=name[i+1];
					name[i+1]=temp;
				}
			}
		}
		for(int k=0; k<name.length; k++){
			System.out.println(name[k]);
		}
	}
}