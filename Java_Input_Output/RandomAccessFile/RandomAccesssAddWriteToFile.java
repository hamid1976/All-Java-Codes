//package javaProgram;
import java.io.*;
public class RandomAccesssAddWriteToFile{
public static void main(String[] args) throws IOException{
   RandomAccessFile file = new RandomAccessFile("a3.txt", "rw");
   
   file.seek(file.length()); // Moving file pointer to the end. 
   file.writeBytes("\nFaizan"); // Appending Dhanbad.
   file.close();
   System.out.println("Successfullly written...");
 }
}