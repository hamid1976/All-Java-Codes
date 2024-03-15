class student{
	static void Trollyload(int Trollyload){
		 System.out.println("Trollyload:"+Trollyload);
		 int Total=Trollyload*800;
		 int Driver=Trollyload*150;
		 int Tax=Trollyload*80;
		 int Diesel=Trollyload*200;
		 int Profit=Total-(Driver+Diesel+Tax);
		 
		 System.out.println("Total:"+Total);
		 System.out.println("Driver:"+Driver);
		  System.out.println("Tax:"+Tax);
		 System.out.println("Diesel:"+Diesel);
		 System.out.println("Profit:"+Profit);
		 
		 }
	}
class Static_Method_Trollyload_1{
		public static void main(String arg[]){
			student.Trollyload(2);
		}
	}