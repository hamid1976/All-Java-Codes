class student{
    int Trollyload=1;
	static void Trollyload(){
	    }
		student(int a){
     
       	 Trollyload=a;
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
		 void display(){
		      System.out.println(Trollyload);
		}
	}
	class Static_Method_Trollyload{
		public static void main(String arg[]){
			student ob=new student(1);
		}
	}
	