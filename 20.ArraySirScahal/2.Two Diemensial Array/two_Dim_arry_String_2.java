class two_Dim_arry_String_2{
	public static void main(String arg []){
		String rec[][]={{"Ali","imran","memon"},{"Zyder","irfan","soomro"},{"jibran","bilawal","joyo"}};
		
        int i,code;
		for ( i = 0; i < rec.length-1; i++) {
            for (int j = 0; j < rec.length-1; j++) {
				 code=rec[j][1].compareTo(rec[j+1][1]);
                if (code > 0){
                  	String  temp[] = rec[j];
                    rec[j] = rec[j+1];
                    rec[j+1] = temp;
                }
			}
		}
		for(int rows =0; rows<rec.length; rows++){
		     for(int cols =0; cols<rec[rows].length; cols++){
			System.out.println(rec[rows][cols]);

			}
		System.out.println("---------------------------");
		}
	}
}