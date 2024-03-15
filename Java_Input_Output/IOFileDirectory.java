import java.io.*;
class IOFileDirectory{
	public static void main(String arg[]){
		
		File directory1=new File("mastercoding");
		directory1.mkdir();//this will create directory1 or you would say a folder
		
		System.out.print("Created"+directory1.getAbsolutePath());
		
		if(directory1.isDirectory()){
			System.out.println("directory of:"+directory1.getName());
			
		    String[] files=directory1.list();
			for(int i=0; i<files.length; i++){
			     File f=new File(directory1    +"/"+    files[i]);
				 
				 if(f.isDirectory()){
					 System.out.println(files[i]  + " is a directory");
			     }else{
					 System.out.println(files[i] +" is a file");
			     }
			}
			
			
		}else{
				System.out.println("Not a Directory");
			}
	}
}