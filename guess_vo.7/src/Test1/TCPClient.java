package Test1;

import java.net.*;
import java.io.*;

public class TCPClient {
	public static void main(String artsg[]) throws Exception {
		
		Socket client = null; // ��ʾ�� ����
		client = new Socket("localhost", 8080);//��ȡ����˵ĵ�ַ
		
		BufferedReader buf = null;
		
		PrintStream out = null; // ��������
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		out = new PrintStream(client.getOutputStream());
		boolean flag = true; // �����־λ
		while (flag) {
			System.out.println("������Ϣ��");
			String str = input.readLine(); // ����������Ϣ
			out.println(str);
			if ("bye".equals(str)) {
				flag = false;
			} else {
				String echo = buf.readLine();// ���ؽ��
				System.out.println(echo); // �����Ӧ��Ϣ
			}
		}
		buf.close();
		client.close();
	}
}