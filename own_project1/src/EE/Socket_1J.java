package EE;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Socket_1J {
	public static void main(String[] Args) throws UnknownHostException, IOException{
		Socket soc = new Socket("77.47.202.38",8181);
		String s = "Karl! \n";
		for(byte b: s.getBytes() ){
		soc.getOutputStream().write(b);
		}
		for(byte b: s.getBytes() ){
			soc.getOutputStream().write(b);
			}
		for(byte b: s.getBytes() ){
			soc.getOutputStream().write(b);
			}
		soc.close();

	}
}
