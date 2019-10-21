package guess_v7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.HashMap;

public class ServerThread extends Thread {
	
	private Socket client = null;
	private HashMap<String, Socket> hashMap;
	
	public void setSocket(Socket client){
		this.client = client;
	}
	public void setHashMap(HashMap<String, Socket> hashMap) {
		this.hashMap = hashMap;
	}
	
	public void run(){
		
		try{
			
			DataOutputStream out = null;
			DataInputStream buf = new DataInputStream(client.getInputStream());//用户端的输入
			boolean flag = true ;
			
			while (flag) {
				System.out.println(client + "\n等待客户端发送消息......" );
				String msgs = buf.readUTF();//接受内容
				
				System.out.println("接受内容为>>>>>>"+msgs);
				
				String [] txt = msgs.split(":");
				String formId = txt[0]; //发送者的id
				//参与者存放在集合里去
				
				hashMap.put(formId, client);
				for(String key:hashMap.keySet()){
					if (!formId.equals(key)) {
						Socket socket =hashMap.get(key);
						out = new DataOutputStream(socket.getOutputStream());
						out.writeUTF(msgs);
					}
				}
			}
			out.close();
			buf.close();
			client.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("serverThread error");
		}
				
	}
}
