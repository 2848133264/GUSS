package task;


//����һ������ö��,Ӧ�ó��󷽷�,�����Ӧ���ڵ���Ϣ
enum reason1{
	spring,
	summer,
	autumn,
	winter	
}
//������
abstract class print_reason{
	
	abstract void spring(reason1 s);
	abstract void summer(reason1 s);
	abstract void autumn(reason1 s);
	abstract void winter(reason1 s);
	
}
public class task04 extends print_reason{

	@Override
	void spring(reason1 s) {
		// TODO Auto-generated method stub
	
		System.out.println(s.spring+" ����"+","+"�������̽��ϰ�");
	}

	@Override
	void summer(reason1 s) {
		// TODO Auto-generated method stub
		System.out.println(s.summer+" ����"+","+"ӳ�պɻ�������");
	}

	@Override
	void autumn(reason1 s) {
		// TODO Auto-generated method stub
		System.out.println(s.autumn+" ����"+","+"��ˮ������һɫ");
	}

	@Override
	void winter(reason1 s) {
		// TODO Auto-generated method stub
		System.out.println(s.winter+" ����"+","+"��������ǧ��ѩ");
	}
	public static void main(String[] args) {
		
		task04 t = new task04();
		t.spring(reason1.spring);
		t.summer(reason1.summer);
		t.autumn(reason1.autumn);
		t.winter(reason1.winter);
	}

}
