package task;

public class Test15 extends Throw {
	/* throws ���ʽ */
	void myThow() {
		try {
			myThow_1(7, 0);
		} catch (ArithmeticException e) {
			System.out.println("���������쳣��");
		}
		throw new InternalError("dafadfa");
		//throw new RuntimeException("����ʱ�쳣");
		
	}

	public static void main(String[] args) {
		new Test15().myThow();
	}
}

class Throw {
	void myThow() throws ArithmeticException, InterruptedException {
		myThow_1(3, 6);
	}

	int myThow_1(int x, int y) throws ArithmeticException {
		return x / y;
	}
}