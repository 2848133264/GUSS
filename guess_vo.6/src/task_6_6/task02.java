package task_6_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

//ʹ��IO+���߳� ֪ʶ������ݲ�������
//���󳡾���
//	��N��Ա������,��N�鿼������
//       �Ӳ����Ŀ����������ҳ�δ���ڵ�Ա������
//
//�����Լ�����
//ʹ�ö��߳���ɶ�Ӧ�Ĳ�������

public class task02 {

	public static void main(String[] args) throws IOException {

		Mythread m = new Mythread();

		new Thread(m, "�߳�1��").start();
		new Thread(m, "�߳�2��").start();


	}
}

class Mythread implements Runnable {

	// ����ͬһ�����ݡ�
	String data = "";
	List<person> list = new ArrayList<person>();

	String data2 = "";// ��������
	String data3 = "";// δ����

	int num;

	public Mythread() throws IOException {
		// TODO Auto-generated constructor stub
		this.data = IOutil.Rankread();
		String[] strings = data.split("\n");

		for (int i = 0; i < strings.length; i++) {
			String[] strings1 = strings[i].split("-");
			person per = new person(strings1[0], strings1[1]);
			list.add(per);
		}
		//mm = ;
		//System.out.println(list.size());
		num = list.size();
	}

	@Override
	public void run() {
		// ����ͬһ������

		while (true) {
			synchronized (Mythread.class) {
				if (num > 0) {
					if (list.get(list.size() - num).getAttendance().trim().equals("1")) {

						System.out.println(
								Thread.currentThread().getName() + ":" + list.get(list.size() - num).getName() + "�ѿ���");

					} else {
						System.out.println(
								Thread.currentThread().getName() + ":" + list.get(list.size() - num).getName() + "δ����");
					}
					num--;

				} else {
					break;
				}
			}
		}
	}

}