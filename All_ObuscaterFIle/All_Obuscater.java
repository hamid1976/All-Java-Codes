import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import javax.swing.*;
import java.nio.file.Files;
public class All_Obuscater{


	public static void main(String[] args)
		throws ClassNotFoundException, NoSuchMethodException
	{
    
       Class myClass = Class.forName("Calculator");
   
      try{	
        
          File  file=new File("E:\\JAVA_Programs_A_To_Z\\String_Class\\Obuscator_Example\\All_ObuscaterFIle\\Calculator.java");
          FileInputStream  fileInp=new FileInputStream("E:\\JAVA_Programs_A_To_Z\\String_Class\\Obuscator_Example\\All_ObuscaterFIle\\Calculator.java"); 
          DataInputStream  dataInp=new DataInputStream(fileInp);

        String  name = file.getName();
        String[] substrings = name.split(".java");
        String randomName=RandomNameScript.ramdomNameGenerate();  
     
        String changeName = "";

        File folder = new File("E:\\JAVA_Programs_A_To_Z\\String_Class\\Obuscator_Example\\All_ObuscaterFIle\\ClassRenameFolder");  
        if (folder.exists()==false) {
            folder.mkdir();         
         }
        
          PrintWriter pw = new PrintWriter(folder+"/"+randomName+".java");    
          
             int size=fileInp.available();
             byte data[]=new byte[size];
             dataInp.readFully(data,0,size);
             String fD=new String(data,0,data.length);
            String line="";
          
            if(fD.contains(substrings[0])){  
              changeName=fD.replace(substrings[0],randomName);
               fD = changeName;                      
           }
           
	    	Method[] method = myClass.getDeclaredMethods();
          for (int j=0; j<method.length; j++) {	
              randomName=RandomNameScript.ramdomNameGenerate();  
            	if(method[j].getName().equals("main"))continue;
            	changeName=fD.replace(method[j].getName(),randomName);            	
	       			fD = changeName; 	
          }

  
          Field[] field = myClass.getDeclaredFields();
         
           for (int j=0; j<field.length; j++) {
               randomName=RandomNameScript.ramdomNameGenerate()+j; 
               changeName=fD.replace(field[j].getName(),randomName);              
               fD = changeName;
             }
                                  
              pw.println(changeName);
               JOptionPane.showMessageDialog(null,"SucessFully Data Writer");
             pw.close();
         }catch(IOException e){System.out.println(e);}
        		
	}
}
