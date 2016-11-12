package EE;

import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//91.204.181.117
public class ServerSocket_1J {
	public static void main(String[] Args){
		ServerSocket serv = null;
		Socket soc = null;
		try {
			serv = new ServerSocket(8181);// аргумент - номер порта
			soc = serv.accept();// підключення
			while(true){ 
			  //System.out.print((char) soc.getInputStream().read());
			
			  int av = soc.getInputStream().available(); 
			  
			  for(int i = 0; i < av; i++){ 
			   System.out.print((char) soc.getInputStream().read());//очікуємо на дані 
			  }
			 //System.out.print("\n");    /31.43.132.107     58352
			 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				serv.close();
				soc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
