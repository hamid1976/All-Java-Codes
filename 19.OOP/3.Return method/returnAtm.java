import java.util.*;
class programm{
int likeAtm(int Rupees ){
 Rupees=Rupees;
return Rupees;
}
int Hesco(int unit){
unit = unit;
return unit;
}
}
class returnAtm{
	public static void main(String arg []){
		Scanner obs =new Scanner(System.in);
		programm obp=new programm();	
		
			int rupees = obp.likeAtm(obs.nextInt());
			
			int _5000 = rupees/5000;
			int rupe= rupees%5000;
			System.out.println("5000 :"+_5000);
			
		
		int un =obp.Hesco(obs.nextInt());
		if(un>=1&&un<=100){
		System.out.println(un+" * 2 = "+un*2);
		}
		if(un>=101 && un<=200){
			System.out.println("100 * 2 = 200 ");
			System.out.println(un-100+"  * 4 = "+(un-100)*4);
			System.out.println("charges will be "+((un-100)*4+200));
		}

	}
}