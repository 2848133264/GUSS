package task_6_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import GUI_oop.Rank;

/**
 * 
 * 使用IO知识完成数据查找任务。
 * 
需求场景：
	有一组员工名单,有一组考勤数据
       从产生的考勤数据中找出未出勤的员工名单

     数据自己编造

 * @author Administrator
 *
 */

public class task {
 //测试主程序。
	public static void main(String[] args) throws IOException {
		showmsg showmsg = new showmsg();
	}
}
//直接用文本文件的形式数据的设置。

//名字，考情标记 ，1 为考情成功的人， 0 为未考情的人。
//记录直接在控制台输出

class showmsg {
	
	public showmsg() throws IOException {
		// TODO Auto-generated constructor stub
		String  data = IOutil.Rankread();
		String [] strings = data.split("\n");		
		List<person> list = new ArrayList<person>();		
		for (int i = 0; i < strings.length; i++) {		
			String[] strings1 = strings[i].split("-");				
			person per = new person(strings1[0], strings1[1]);	
			list.add(per);
		}
		String data2 = "";//考情数据
		String data3 ="";//未考情
		for (person person : list) {
			if(person.getAttendance().trim().equals("1")){
				data2 += person.getName()+"\n";
			}else{
				data3 += person.getName()+"\n";
			}			     
		}		
		System.out.println("考情名单：\n"+data2);
		System.out.println("未考情名单：\n"+data3);
						
	}	
}




