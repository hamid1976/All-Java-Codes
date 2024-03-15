class LargestAndSmallestName{
	public static void main(String arg[]){
			String name[]={"d","e","b","z","c","q","r","w"};
			String temp="";
			int greater=0;
			int loc=0;
			int num=0;
			for(int i=0; i<name.length;i++){
				num=name[0].compareTo(name[i]);
					if(num<greater){
						greater=num;
						loc=i;	
					}
			}
			System.out.println("Largest Name is "+name[loc]+" & its location is "+loc+);
			greater=0;
			loc=0;
			for(int i=0; i<name.length;i++){
				num=name[0].compareTo(name[i]);
					if(num>greater){
						greater=num;
						loc=i;	
					}
			}
			System.out.println("Smallest Value is "+name[loc]+" on "+loc+" location");
	}
}