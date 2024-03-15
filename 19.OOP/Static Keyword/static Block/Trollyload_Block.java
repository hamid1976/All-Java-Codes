class Trollyload_Block{
    static{
		 System.out.println("\nTrollyload");
	     }
		 Trollyload_Block(){
		 int Trollyload=2;
		 int Total=Trollyload*800;
		 int Driver=Trollyload*150;
		 int Tax=Trollyload*80;
		 int Diesel=Trollyload*200;
		 int Profit=Total-(Driver+Diesel+Tax);
		 
		 System.out.println("\nTotal:"+Total);
		 System.out.println("\nTotal:"+Total);
		 System.out.println("Driver:"+Driver);
		 System.out.println("Tax:"+Tax);
		 System.out.println("Diesel:"+Diesel);
		 System.out.println("Profit:"+Profit);
		 
		
	}

	public static void main(String arg[]){
		Trollyload_Block ob=new Trollyload_Block();
	}
}