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
			out = new PrintStream(client.getOutputStream());//获得客户端的输出流信息
			//System.out.println("out--->"+out.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 客户端输出流
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean temp = true;
		
		 // 要一直接收客户端的请求
		while (temp) {
			String str = null;
			try {
				str = buf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 接收内容
			if ("bye".equals(str)) {
				temp = false; // 不再接收
			} else {// 线程子类
				str = str.replace("吗", " ").replace(" ？", "!").replace(" ？", "!");
				out.println("Server>>：" + str); // 将内容送回客户端
			}
		}
		//关闭
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