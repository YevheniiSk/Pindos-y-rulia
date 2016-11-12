package EE2;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class ServerSock {
	public static ServerSocket serv = null;
	static{
		try {
			serv = new ServerSocket(8181);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] Args){	
		// как сделать так что бы эта штука висела в онлайне, и ждала пока к ней обратятся???? и срабатывала при каждом обращении
		while(true){
			if (serv.isBound()){ //если подключение к серваку прошло успешно
				createclient();	
			}
		}	
		
	}
	public static void createclient(){
		ClientThread th = new ClientThread();
		th.start();
	}
}
