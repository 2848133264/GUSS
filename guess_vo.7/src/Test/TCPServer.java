package Test;

import java.net.*;
import java.io.*;

public class TCPServer {
	
	public static void main(String args[]) throws Exception {
		
		ServerSocket server = null;// ����ServerSocket����
		
		Socket client = null;// һ��Socket�����ʾһ���ͻ���
		
		PrintStream out = null;// ������ӡ��s����,����ͻ������
	
		// ��������8888�˿��ϵȴ��ͻ��˷���
		
		server = new ServerSocket(8888);
		
		System.out.println("����������,�ȴ��ͻ�������");
		
		client = server.accept(); // �����ٴ�����,�ȴ��ͻ�������
		
		String str = "hello world!!!�����Ƿ������Ϣ";// Ҫ��ͻ����������Ϣ
		
		// ʵ������ӡ������,�����Ϣ
		out = new PrintStream(client.getOutputStream());
	
		
		
		out.println(str); // �����Ϣ	
		out.close(); // �رմ�ӡ��
		client.close(); // �رտͻ�������
		server.close(); // �رշ���������
		
	}
};