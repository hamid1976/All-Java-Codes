class student{
int rupees;
static void Atm(){
}
student(int a){
    rupees=a;
       System.out.println("Rupees:"+rupees);	
	   int fivethousand=rupees/5000;
	   rupees=rupees%5000;
	   
	   int thousand=rupees/1000;
	   rupees=rupees%1000;
	   
	   int fivehundread=rupees/500;
       rupees=rupees%500;
	   
	   int hundread=rupees/100;
	   rupees=rupees%100;
	   
	   int fifty=rupees/50;
	   rupees=rupees%50;
	   
	   int twenty=rupees/20;
	   rupees=rupees%20;
	   
	   int ten=rupees/10;
	   rupees=rupees%10;
	   
	   int five=rupees/5;
	   rupees=rupees%5;
	   
	   
	   int two=rupees/2;
	   rupees=rupees%2;
	   
	   int one=rupees/1;
	   rupees=rupees%1;
		
			System.out.println("five thousand:"+(fivethousand));
			System.out.println("thousand:"+(thousand));
			System.out.println("five hundread:"+(fivehundread));
			System.out.println("hundread:"+(hundread));
			System.out.println("fifty:"+(fifty));
			System.out.println("twenty:"+(twenty));
			System.out.println("ten:"+(ten));
			System.out.println("five:"+(five));
			System.out.println("two:"+(two));
			System.out.println("one:"+(one));
       }
	void display(){
				System.out.println(rupees);
    }

}
class StaticMethod_Atm{
	public static void main(String arg[]){
		student ob=new student(8888);
	}
}