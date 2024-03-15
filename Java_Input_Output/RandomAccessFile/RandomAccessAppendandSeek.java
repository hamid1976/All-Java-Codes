import java.io.*;
public class RandomAccessAppendandSeek{
public static void main(String[] args) throws IOException{
   RandomAccessFile file = new RandomAccessFile("a2.txt", "rw");
   
// Clear the file to destroy the old data if exists.
   file.setLength(0); // Empty file.
   
// Write new integer values to the file. 
   for(int i = 0; i <= 10; i++)
   {
	 file.writeInt(i);
   }
// Print the current length of the file. 
   // System.out.println("Current length of file: " +file.length());
   
// Get the first number from the file.
// Bring the file pointer to the beginning.
   file.seek(1);
   System.out.println("First number: " +file.readInt());
   
   
// Get the second number from the file.
   System.out.println("Second number: " +file.readInt());
   
     System.out.println("Third number: " +file.readInt());
// Retrieve the number at 9th position.
// Move the file pointer to 9th position.
   // file.seek(9 * 4);
   // System.out.println("Ninth number: " +file.readInt());
   
// Modify the tenth number.
   // file.writeInt(222);
   // file.seek(10 * 4); // Moving pointer to 10th position.
   // System.out.println("Tenth number: " +file.readInt());

// Append a new number at the end of the file.
   // file.seek(file.length());
   // file.writeInt(333);
// Print the new length of the file.
   // System.out.println("New length of file: " +file.length());

// Retrieve the new number. Move the file pointer to new number.
   // file.seek(11 * 4);
   // System.out.println("New number: "+file.readInt());
 }
}