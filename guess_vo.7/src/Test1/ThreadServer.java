package Test1;

import java.net.*;
import java.io.*;

public class ThreadServer extends Thread {
	private Socket client = null;

	public void setSocket(Socket client) {
		this.client = client;
	}

	public void run() {
		PrintStream out = null;
		try {
			out = new PrintStream(client.getOutputStream());//��ÿͻ��˵��������Ϣ
			//System.out.println("out--->"+out.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �ͻ��������
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean temp = true;
		
		 // Ҫһֱ���տͻ��˵�����
		while (temp) {
			String str = null;
			try {
				str = buf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // ��������
			if ("bye".equals(str)) {
				temp = false; // ���ٽ���
			} else {// �߳�����
				str = str.replace("��", " ").replace(" ��", "!").replace(" ��", "!");
				out.println("Server>>��" + str); // �������ͻؿͻ���
			}
		}
		//�ر�
		out.close();
		try {
			buf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
};