package oop4;

public class Bird implements Runner {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("׼�����");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("ͣ������Ϣ");
	}

	void fly(){
		System.out.println("����С�� �һ��");
	}
	//����
	
	public static void main(String[] args) {
		Bird b =new Bird();
		
		b.start();
		b.run();
		b.fly();
		b.stop();
		
	}
}
