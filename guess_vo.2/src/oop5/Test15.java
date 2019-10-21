package oop5;

import java.io.IOException;

public class Test15 {
	public static void main(String[] args) {
		try {
			DBBase base = new MySQLDB();
		} 
		catch (IOException e) { // 异常处理
			System.err.println("DFSAFADF");} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class DBBase {// 父类
	// 父类抛出IOException
	public DBBase() throws IOException {
		throw new IOException();
	}
}

class MySQLDB extends DBBase {// 子类
	// 子类抛出Exception异常
	public MySQLDB() throws Exception {
	}
}