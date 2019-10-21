package guess_v7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class GuessServer {
	
	//服务器端

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		ServerSocket server =null;
		HashMap<String, Socket> hm = new HashMap<>();//存放所有的玩家
		
		//服务器在8080端口等待客户端的访问
		server = new ServerSocket(8080);
		System.out.println("服务器运行，等待客户端连接...");
		boolean flag = true;
		
		while(flag){//可以接受多个用户请求		
			Socket client = server.accept();
			hm.put(client.getPort()+"", client);
			ServerThread ts = new ServerThread(); //线程子类
			ts.setSocket(client);
			ts.setHashMap(hm);
			ts.start();//开启线程
		}
		server.close();
	}
}
