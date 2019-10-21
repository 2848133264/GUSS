package oop5;

public class Test12 {
	public static void main(String[] args) {
		try {
			doStuff(-1);
			doStuff(100);
		} catch (Exception e) {
			System.out.println("程序到这里结束");
		}
	}

	@SuppressWarnings("finally")
	public static int doStuff(int _p) throws Exception {
		try {
			if (_p < 0) {
				throw new Exception("数据格式错误");
			} else {
				return _p;
			}
		} catch (Exception e) {
         	throw e;
			//e.printStackTrace();
	}
         	finally {
		//return -1;// 你的错，不能有返回
//		}
	}
   }
}