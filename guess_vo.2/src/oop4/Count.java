package oop4;

public class Count {

	/**
	 * ��ҵ��ϰ1
 	 ����֪��static���������ж�����ģ���ô�Ϳ���ʹ��static����ͳ��һ���ൽ�ײ����˶��ٸ�ʵ��������
	 * @param args
	 */
	
	static int countSum = 0;
	
	public Count(){
		++ countSum ;
		System.out.println("ʵ������ "+countSum+"  ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++){
			new Count();//���� 10 ����������
		}
	}

}
