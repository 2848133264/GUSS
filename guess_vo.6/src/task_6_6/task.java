package task_6_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import GUI_oop.Rank;

/**
 * 
 * ʹ��IO֪ʶ������ݲ�������
 * 
���󳡾���
	��һ��Ա������,��һ�鿼������
       �Ӳ����Ŀ����������ҳ�δ���ڵ�Ա������

     �����Լ�����

 * @author Administrator
 *
 */

public class task {
 //����������
	public static void main(String[] args) throws IOException {
		showmsg showmsg = new showmsg();
	}
}
//ֱ�����ı��ļ�����ʽ���ݵ����á�

//���֣������� ��1 Ϊ����ɹ����ˣ� 0 Ϊδ������ˡ�
//��¼ֱ���ڿ���̨���

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
		String data2 = "";//��������
		String data3 ="";//δ����
		for (person person : list) {
			if(person.getAttendance().trim().equals("1")){
				data2 += person.getName()+"\n";
			}else{
				data3 += person.getName()+"\n";
			}			     
		}		
		System.out.println("����������\n"+data2);
		System.out.println("δ����������\n"+data3);
						
	}	
}




