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
			DataInputStream buf = new DataInputStream(client.getInputStream());//�û��˵�����
			boolean flag = true ;
			
			while (flag) {
				System.out.println(client + "\n�ȴ��ͻ��˷�����Ϣ......" );
				String msgs = buf.readUTF();//��������
				
				System.out.println("��������Ϊ>>>>>>"+msgs);
				
				String [] txt = msgs.split(":");
				String formId = txt[0]; //�����ߵ�id
				//�����ߴ���ڼ�����ȥ
				
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
