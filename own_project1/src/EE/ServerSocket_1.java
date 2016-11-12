package EE;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;

public class ServerSocket_1{
	
	public static void main(String[] args) throws IOException, InterruptedException{
		ServerSocket SS = new ServerSocket(8181);  // аргумент - номер порта
		
		Socket Client = SS.accept();// очікуємо підключення
		
		while(true){
			if(Client.getInputStream().available() > 0){
				
				System.out.print((char) Client.getInputStream().read());
				int av = Client.getInputStream().available();
				
				for(int i = 0; i < av; i++){
					System.out.print((char) Client.getInputStream().read());//очікуємо на дані
				}
				
			}
			else{
				//Thread.currentThread().join(0);
			}
			
			
		}
			
			
		
		
		
		//Client.close();
		//SS.close();
	}
	
	
}
