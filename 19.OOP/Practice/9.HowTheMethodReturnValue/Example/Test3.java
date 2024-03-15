class Marksheet{
	int Obtained(int a,int b,int c,int d,int e){
		int obtain=a+b+c+d+e;
		return obtain;
	}
	int Total(int num){
		int Total=num;
		return Total;
	}
	int per(int obtain,int Total){
		int per=obtain*100/Total;
		return per;
	}
	String grade(int per){
			if(per >=90 && per<=100 ){
					return "A1 ";
			}else
				if(per >=80 && per<90){
					return "A ";
				}
			else
				if(per >=70 && per<80){
					return "B ";	
				}
			else
				if(per >=60 && per<70){
				return "C ";	
				}
			else
				if(per >=50 && per<60){
				return "D ";	
				}
			else
				if(per<50){
				return "You are Fail";	
				}
			return "";
				
	}//end grade
}
class Test3{
	public static void main(String arg[]){
		Marksheet ob=new Marksheet();
		int obt=ob.Obtained(60,80,75,90,67);
		int Tot=ob.Total(500);
		int per=ob.per(obt,Tot);
		String Grade=ob.grade(per);
		System.out.println("Total="+Tot);
		System.out.println("Obtain Marks="+obt);
		System.out.println("Percentage="+per);
		System.out.println("Your Grade is="+Grade);
	}
}