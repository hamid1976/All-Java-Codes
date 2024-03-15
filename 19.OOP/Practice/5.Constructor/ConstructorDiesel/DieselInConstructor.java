import java.util.*;
class BuyDisel{
    String location;
    String DiselType;
    int quantity;
    double literPrice;
    double discount;
	BuyDisel(String n, String d,int q,double lp,double dis){
		location=n;
		DiselType=d;
		quantity=q;
		literPrice=lp;
		discount=dis;
    }//end BuyDisel1
void getpurchased(){
    System.out.println("\nLocation    "+location);
    System.out.println("DiselType     "+DiselType);
    System.out.println("Quantity      "+quantity+ " liter");
    System.out.println("LiterPrice    "+literPrice);
    System.out.println("Total Price   "+literPrice*quantity);
    System.out.println("Discount      "+discount*quantity);
    System.out.println("Net amount    "+ (literPrice*quantity-discount*quantity));
    }
}

class DieselInConstructor{
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter quantity of Liter : ");
        int num=input.nextInt();
        BuyDisel ob=new BuyDisel("  karachi","Disel",num,130.0,13.0);
        ob.getpurchased();
    }
}