class loop{
int num;
void set (int n){
 num=n;
 }
 void even(){
	 System.out.println("\tEven ");
	 for(int i=1; i<=num; i++){
		 if(i%2==0)
			 System.out.println(i);
	 }
 }
 
 void odd(){
	 System.out.println("\tOdd ");
	 for(int i=1; i<=num; i++){
		 if(i%2==1)
			 System.out.println(i);
	 }
	 
 }
 
 void fact(){
	 System.out.println("\tfraction ");
int fac=1;
  for(int i=1; i<=num; i++){
	  
	  
  fac = i*fac;
  System.out.println(fac);	  
 
  }   
 
 }
 
 void prime(){
	 System.out.println("\tprime ");
	 int count;
        
	for(int j=2;j<=num;j++){
	count=0;
	for(int i=1;i<=j;i++){
	   if(j%i==0)
	        count++;        
	   
	}
	if(count==2)
	       System.out.println(j);     
	}
	 
 }
}
 class objminiLoop{
	 public static void main(String arg []){
		 loop ob1=new loop();
		 loop ob2=new loop();
		 loop ob3=new loop();
		 
		 ob1.set(10);
		 ob2.set(3);
		 ob3.set(5);
		 
		 ob1.even();
		 ob1.odd();
		 ob1.fact();
		 ob1.prime();
		 
		 ob2.even();
		 ob2.odd();
		 ob2.fact();
		 ob2.prime();
		 
		 ob3.even();
		 ob3.odd();
		 ob3.fact();
		 ob3.prime();
	 }
 }