package Test1;

import java.net.*;
import java.io.*;

public class TCPServer {
	public static void main(String args[]) throws Exception {
		ServerSocket server = null; // ����ServerSocket����
		// ��������8888�˿��ϵȴ��ͻ��˷���
		server = new ServerSocket(8080);
		
		System.out.println("����������,�ȴ��ͻ�������");
		
		boolean flag = true;
		
		while (flag) { // ���������Խ��յ�����û�����
			
			// �����ٴ�����,�ȴ��ͻ�������
			Socket client = server.accept();
			
			ThreadServer ts = new ThreadServer(); // �߳�����
			
			ts.setSocket(client);// ����socket
			
			ts.start(); // �����߳�
		}
		server.close(); // �رշ���������
	}
};