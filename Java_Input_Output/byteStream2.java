import java.io.*;
class byteStream2{
	public static void main(String args [])throws Exception{
		try{
			
			  FileOutputStream f= new FileOutputStream("Hamid.txt");
			  DataOutputStream file= new DataOutputStream(f);
			  DataInputStream key=new DataInputStream(System.in);
			  f.flush();
              do{
				 System.out.print("Enter Employee Salary:");
				 int salary=key.readInt();
				 
				 if(salary<=806160909){break;}
				 
				 file.writeInt(salary);
				}while(true);
			          System.out.println("Good Bye");
			    f.close();
          }catch(Exception e){
              e.printStackTrace();		
		  }	
     }
}