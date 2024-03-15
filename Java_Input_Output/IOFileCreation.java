import java.io.*;
class IOFileCreation{
	public static void main(String arg[]){
		
	File f=new File("createFile.txt");
	
	try{
		if(f.createNewFile()){
			
			System.out.println("file created"+ f.getAbsolutePath());
			}else{
				System.out.println("File Already eists");
			}
	   }catch(Exception e){
		e.printStackTrace();
	   }
	
	}
}