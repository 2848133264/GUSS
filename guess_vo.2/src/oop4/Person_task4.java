package oop4;

public class Person_task4 implements Runner {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("ֹͣ��");

	}
	public void dance(){
		System.out.println("�һ�������");
	}
	
	//����
	public static void main(String[] args) {
		Person_task4 per =new Person_task4();
		
		per.start();
		per.run();
		per.stop();
		
		per.dance();
		
	}

}
