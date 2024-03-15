import java.io.*;
import java.net.*;
class Networking{
	public static void main(String arg[]){
	try{
		//InetAddress addr=InetAddress.getByName("www.google.com");
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("Local Host:"+ip.getLocalHost());
		System.out.println("Ip Address:"+ip.getHostAddress());
	}catch(Exception e){
	System.out.println(e);}
	}
}