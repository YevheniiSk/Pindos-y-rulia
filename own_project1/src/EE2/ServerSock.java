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
		// ��� ������� ��� ��� �� ��� ����� ������ � �������, � ����� ���� � ��� ���������???? � ����������� ��� ������ ���������
		while(true){
			if (serv.isBound()){ //���� ����������� � ������� ������ �������
				createclient();	
			}
		}	
		
	}
	public static void createclient(){
		ClientThread th = new ClientThread();
		th.start();
	}
}
