package guess_v7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class GuessServer {
	
	//��������

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		ServerSocket server =null;
		HashMap<String, Socket> hm = new HashMap<>();//������е����
		
		//��������8080�˿ڵȴ��ͻ��˵ķ���
		server = new ServerSocket(8080);
		System.out.println("���������У��ȴ��ͻ�������...");
		boolean flag = true;
		
		while(flag){//���Խ��ܶ���û�����		
			Socket client = server.accept();
			hm.put(client.getPort()+"", client);
			ServerThread ts = new ServerThread(); //�߳�����
			ts.setSocket(client);
			ts.setHashMap(hm);
			ts.start();//�����߳�
		}
		server.close();
	}
}
