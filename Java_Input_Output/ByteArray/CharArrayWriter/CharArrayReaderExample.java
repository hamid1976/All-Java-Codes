import java.io.*;  
class CharArrayReaderExample{  
  public static void main(String[] ag) throws Exception {  
    char[] ch = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };  
    CharArrayReader reader = new CharArrayReader(ch);  
    int o = 0;  
    // Read until the end of a file  
    while ((i = reader.read()) != -1) {  
      char ch = (char) k;  
      System.out.print(ch + " : ");  
      System.out.println(k);  
	  
    }  
  }  
}  