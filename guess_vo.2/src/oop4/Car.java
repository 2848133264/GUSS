package oop4;

public class Car implements Runner {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("����ʼ����");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����������ʻ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("����ͣ��");

	}
	
	//�Լ������ж���ķ���
	public void fillFuel() {
		System.out.println("��������");
	}
	public void crack() {
		System.out.println("���ӳ�����");
	}
	
	//����
	public static void main(String[] args) {
		
		Car car =new Car();
		
		car.fillFuel();//��������
		car.start();//���ӿ�ʼ����
		car.run();//������ʻ
		car.stop();//����ͣ��
		car.crack();//���ӳ�����
		
	}
}
