package Test;

import java.net.*;
import java.io.*;

public class TCPClient {
	public static void main(String artsg[]) throws Exception {
		
		Socket client = null; // ����Socket����
		
		// ָ�����ӵ������Ͷ˿�
		client = new Socket("localhost", 8888);
		
		BufferedReader buf = null;// buf����,������Ϣ
		
		// ȡ�÷������˵�������
		buf = new BufferedReader(
				new InputStreamReader(
						client.getInputStream())
				);
		
		String str = buf.readLine(); // ��ȡ��Ϣ
		System.out.println("��������������ݣ�" + str);
		

		String string ="�յ�";//������Ϣ�ķ���
		
		
		
		
		client.close(); // �ر�Socket
		buf.close(); // �ر�������
	}
};