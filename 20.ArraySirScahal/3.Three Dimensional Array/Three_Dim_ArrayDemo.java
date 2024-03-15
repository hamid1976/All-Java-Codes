class Three_Dim_ArrayDemo{
	public static void main(String arg []){
		int table[][][]=new int [2][3][4];
		table[0][0][0]=10;
		table[0][0][1]=20;
		table[0][0][2]=30;
		table[0][0][3]=40;
		
		table[0][1][0]=50;
		table[0][1][1]=60;
		table[0][1][2]=70;
		table[0][1][3]=80;
		
		table[0][2][0]=90;
		table[0][2][1]=100;
		table[0][2][2]=110;
		table[0][2][3]=120;
		
		table[1][0][0]=10;
		table[1][0][1]=20;
		table[1][0][2]=30;
		table[1][0][3]=40;
		
		table[1][1][0]=50;
		table[1][1][1]=60;
		table[1][1][2]=70;
		table[1][1][3]=80;
		
		table[1][2][0]=90;
		table[1][2][1]=100;
		table[1][2][2]=110;
		table[1][2][3]=120;
		for(int i=0; i<table.length; i++){
			for(int j=0; j<table.length+1; j++){
				for(int k=0; k<table.length+2; k++){
			
					  System.out.print(table[i][j][k] + " ");
              
				}
                System.out.println();
            }
            System.out.println();
       
		}
	}
}