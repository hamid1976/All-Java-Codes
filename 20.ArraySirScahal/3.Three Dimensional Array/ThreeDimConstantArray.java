import java.util.*;
class ThreeDimConstantArray{

	public static void main(String arg[]){
	String table[][][]={{{"ALi","imran","Memon","10"},{"Hyder","irfan","Soomro","20"},{"Jibran","bilawal","Joyo","25"}},{{"Ali","imran","Memon","10"},{"Hyder","irfan","Soomro","20"},{"Jibran","bilawal","Joyo","25"}}};
		
		
		for(int i=0; i<table.length; i++){
			for(int j=0; j<table.length+1; j++){
			//	for(int k=0; k<table.length+2; k++){
			
					//  System.out.print(table[i][j][k] + " ");
					  	System.out.println("Name:"+table[i][j][0]);
			System.out.println("FName:"+table[i][j][1]);
			System.out.println("Surname:"+table[i][j][2]);
			System.out.println("Roll No:"+table[i][j][3]);
			System.out.println("---------------------------");
              
				}
                System.out.println();
            }
            System.out.println();
       
		}
	}

		