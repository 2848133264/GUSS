package oop4;

public class Test {
	/**
	 * ��ҵ��ϰ2
	 * 
	 *ʵ��ʹ��staticΪ����,�����Զ�����������������
	 *������Test,�����Ķ�����������Ϊtest1��test2... ��������
	 */
	/**
1����ǰ��Ľ������֪��static���������ж�����ģ���ô�Ϳ���ʹ��static����ͳ��һ���ൽ�ײ����˶��ٸ�ʵ��������
2������ʹ��staticΪ��������Զ��������������˲���������������ơ�
	 * 
	 */
    private	static int count =0;
	private String namestring ;
	
	public Test() {
		// TODO Auto-generated constructor stub
		count++;
		this.namestring = "test-"+count;
	}
	public String getName() {
		
		return namestring;
	
	}
	public static void main(String[] args) {
		
		System.out.println(new Test().getName());
		System.out.println(new Test().getName());
		System.out.println(new Test().getName());
	}
}
