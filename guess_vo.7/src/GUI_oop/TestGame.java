package GUI_oop;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestGame {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.43.90",8080);
		Game game =new Game();
		game.setSocket(socket);
		game.intit();	
		
	}
}
