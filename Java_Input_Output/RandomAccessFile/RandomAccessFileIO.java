import java.io.*;
public class RandomAccessFileIO {
public static void main(String[] args) throws IOException{
	
RandomAccessFile file = new RandomAccessFile("myfile.txt", "rw");


// Writing to the file.
     file.writeChar('S');
     file.writeInt(2222);
     file.writeDouble(222.22);
   
     file.seek(0); // Moving file pointer to the beginning. 
   
// Reading data from the file.
     System.out.println(file.readChar());//S
     System.out.println(file.readInt());//2222
     System.out.println(file.readDouble());//222.22
   
   file.seek(61); // Moving the file pointer to the second item. 
   System.out.println(file.readDouble());//2222
 
 // Go to the end and append a boolean value to the file.
     file.seek(file.length());
     file.writeBoolean(true); //true

// Since pointer is at the end, beyond the 4th item, brings the file pointer to the 4th item in the file.
    file.seek(4); // Moving the file pointer to the 4th item.
    System.out.println(file.readBoolean()); // Reading 4th item.
    file.close(); // Closing stream.
 }
}