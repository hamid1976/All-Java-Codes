import java.util.*;
class TwoDimensionalMatrix{  
		public static void main(String args[]){  
			Scanner ob = new Scanner(System.in);
			int matrix1[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120}};    
			int matrix2[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120}};    
			int matrix3[][]=new int[3][4];  //3 rows and 4 columns  
			char ch;
			do{
				System.out.print("1.Addition\n2.subtraction\n3.division\n4.remmender\n5.Multiplication\n6.traversing\nEnter sel ");
			int sel=ob.nextInt();
			switch(sel){
				case 1:
				for(int i=0;i<3;i++){    
							for(int j=0;j<4;j++){    
							matrix3[i][j]=matrix1[i][j]+matrix2[i][j];   
 
							}    
							

						}  break;
				case 2:
				for(int i=0;i<3;i++){    
							for(int j=0;j<4;j++){    
							matrix3[i][j]=matrix1[i][j]-matrix2[i][j];   
							}   
						}  break;
                case 3:
				for(int i=0;i<3;i++){    
							for(int j=0;j<4;j++){    
							matrix3[i][j]=matrix1[i][j]/matrix2[i][j];   
							}   
						}  break;	
                case 4:
				for(int i=0;i<3;i++){    
							for(int j=0;j<4;j++){    
							matrix3[i][j]=matrix1[i][j]%matrix2[i][j];   
							}   
						}  break;
						case 5:
                    for(int i=0;i<3;i++){    
                      for(int j=0;j<4;j++){        
							for(int k=0;k<3;k++){      
								matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];      
											}	
					    }
					  }	break;										
					case 6:
						for(int i=0;i<3;i++){    
							for(int j=0;j<4;j++){    
    
							System.out.print(matrix1[i][j]+" ");    
    
							}
							System.out.println();
						}    
						System.out.println("\n");
						for(int i=0;i<3;i++){    
							for(int j=0;j<4;j++){    
     
								System.out.print(matrix2[i][j]+" ");    
							} 
								System.out.println();

						} 
						System.out.println("\n");
						for(int i=0;i<3;i++){    
							for(int j=0;j<4;j++){    
							  System.out.print(matrix3[i][j]+" ");    
 
							}    
							System.out.println();

						}   
						break;
			}
			
             System.out.print("\ndo you again run program y/n  ");
             ch=ob.next().charAt(0);			 
			}
			while(ch=='y');
			
	}  
}
