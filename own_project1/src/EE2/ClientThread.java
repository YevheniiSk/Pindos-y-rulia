package EE2;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientThread extends Thread {
	List<Socket> sockedlist = new ArrayList<>(3);
	public void run(){
		Socket soc = null;
			try {
				soc = ServerSock.serv.accept();
				sockedlist.add(soc);
	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		while(true){ 
			try {
				ClientThread.ShowInpStream(soc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	public static synchronized void ShowInpStream(Socket soc) throws IOException{
		int av = soc.getInputStream().available(); 
		  
		  for(int i = 0; i < av; i++){ 
		   System.out.print((char) soc.getInputStream().read());//очікуємо на дані 
		  }
	}
	
	
}
