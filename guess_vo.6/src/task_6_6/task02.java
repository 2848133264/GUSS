package task_6_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

//使用IO+多线程 知识完成数据查找任务。
//需求场景：
//	有N组员工名单,有N组考勤数据
//       从产生的考勤数据中找出未出勤的员工名单
//
//数据自己编造
//使用多线程完成对应的查找任务

public class task02 {

	public static void main(String[] args) throws IOException {

		Mythread m = new Mythread();

		new Thread(m, "线程1：").start();
		new Thread(m, "线程2：").start();


	}
}

class Mythread implements Runnable {

	// 共享同一份数据。
	String data = "";
	List<person> list = new ArrayList<person>();

	String data2 = "";// 考情数据
	String data3 = "";// 未考情

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
		// 查找同一份数据

		while (true) {
			synchronized (Mythread.class) {
				if (num > 0) {
					if (list.get(list.size() - num).getAttendance().trim().equals("1")) {

						System.out.println(
								Thread.currentThread().getName() + ":" + list.get(list.size() - num).getName() + "已考勤");

					} else {
						System.out.println(
								Thread.currentThread().getName() + ":" + list.get(list.size() - num).getName() + "未考勤");
					}
					num--;

				} else {
					break;
				}
			}
		}
	}

}