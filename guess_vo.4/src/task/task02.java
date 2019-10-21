package task;

public class task02 {
/**
 * ��ҵ��ϰ2
	���һ������java�������� ִ�к�ʱ(����)  
	
	���ڴ�����(KB)�Ĺ�����,�ڷ���ִ�к��ܷ������û�������ʱ���ڴ����ĵ����
	
 	Ӧ�ô������ģʽʵ��.
 	
	������������Ӧ��,�۲�ִ�����
 */
 /**
  * ����ģʽ��    ִ�е�������Ƴɽӿ�
  * 		      ��ʵ��ʵ�ֽӿ�
  * 			������ͬ��ʵ�ֽӿڣ�����˽��ʵ���ӿڣ��������ķ�����
  */
	public static void main(String[] args) {
		//���в���
		@SuppressWarnings("unused")
		Function function = new real();
		proxy p = new proxy(function);
		//����������ɣ����в�������
		
		//task01
		String string = "";
		Runtime r =Runtime.getRuntime();//����
		long startTime = p.showTime();//��ʼʱ��		
		for(int i = 0;i<5000;i++){
			string+="c";
		}
		new task03();
		//���ʱ��
		System.out.println("���ĵ�ʱ�䣺"+(System.nanoTime() - startTime)+"  ns(���룩");
		//����ڴ�����
		System.out.println("�ڴ����ģ�"+p.showMemory(r)+"  byte(�ֽڣ�");
		
		
		//task02
		long sum = 0;
		Runtime r1 =Runtime.getRuntime();//����
		long startTime2  = p.showTime();//��ʼʱ��
		for(long i = 0;i< 10000000;i++){// һǧ��
			sum +=i;
		}
		//���ʱ��
		System.out.println("���ĵ�ʱ�䣺"+(System.nanoTime() - startTime2)+"  ns(���룩");
		//����ڴ�����
		System.out.println("�ڴ����ģ�"+p.showMemory(r1)+"  byte(�ֽڣ�");
	}
}



interface Function{
	//�ṩ����������ִ�к�ʱ��ʵ���ڴ������
	long showTime();
	long showMemory(Runtime r);
}

class real implements Function{

	@Override
	public long showTime() {
		// TODO Auto-generated method stub
		//Ҫ�п�ʼʱ�䣬�ͽ���ʱ�䣬���Ӧ�ò���д��ͬһ��������
		long  startTime = System.nanoTime();		
		return startTime;
	}

	@Override
	public long showMemory(Runtime r) {
		// TODO Auto-generated method stub
		//��ȡ�ⲿ��������ֵ���м���
		r = Runtime.getRuntime();
		//�ܵ��ڴ�
		long rmax = r.maxMemory();
		//�����ڴ�
		long rfree = r.freeMemory();
		//���ĵ��ڴ� = �ܵ��ڴ� - ���е��ڴ档
		long resumeMemory = rmax - rfree ;	
		//��resumeMemory ���س�ȥ
		return resumeMemory;
	}
	
}
// ������
class proxy implements Function{

	private Function function;
	
	public proxy(Function function){
		this.function  = function;
	}
	
	@Override
	public long showTime() {
		// TODO Auto-generated method stub		
		return this.function.showTime();
	}

	@Override
	public long showMemory(Runtime r) {
		// TODO Auto-generated method stub
		return this.function.showMemory(r);
	}
	
}



