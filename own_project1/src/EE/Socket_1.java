package EE;

import java.io.IOException;

//протокол UDP
//OSI
//get post put delete
//

import java.net.*;
import java.util.Scanner;

public class Socket_1{
	public static void main(String[] args) throws UnknownHostException, IOException{
		String NICNAME = "Yevhenii said: ";
		//Socket sender = new Socket("77.47.202.38", 8181);
		//Socket sender = new Socket("192.168.1.101", 8181);
		//Socket sender = new 
		Socket sender = new Socket("localhost", 8181);
		
		Scanner scn = new Scanner(System.in);
		while(true){
		System.out.print("Enter the message: \n");
		
		String s = scn.nextLine();
			
			for(byte b :NICNAME.getBytes()){
				sender.getOutputStream().write(b);
			}
			for(byte b : s.getBytes()){
				sender.getOutputStream().write(b);
			}
			for(byte b : "\n".getBytes()){
				sender.getOutputStream().write(b);
			}
		
			
		
		}
		
		
		
		
		
		//scn.close();
		
		//sender.close();
	}
	
}
