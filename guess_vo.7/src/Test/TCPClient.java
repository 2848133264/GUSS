package Test;

import java.net.*;
import java.io.*;

public class TCPClient {
	public static void main(String artsg[]) throws Exception {
		
		Socket client = null; // 声明Socket对象
		
		// 指定连接的主机和端口
		client = new Socket("localhost", 8888);
		
		BufferedReader buf = null;// buf对象,接收信息
		
		// 取得服务器端的输入流
		buf = new BufferedReader(
				new InputStreamReader(
						client.getInputStream())
				);
		
		String str = buf.readLine(); // 读取信息
		System.out.println("服务器端输出内容：" + str);
		

		String string ="收到";//用作信息的返回
		
		
		
		
		client.close(); // 关闭Socket
		buf.close(); // 关闭输入流
	}
};