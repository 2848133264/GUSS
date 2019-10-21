package GUI_oop;

import java.awt.Font;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Rankuser extends JFrame {

	private static final long serialVersionUID = 1L;
	// �������ݷ�ʽ��ʾ
	JTextArea result;
	public Rankuser(String data) throws IOException {

		this.setTitle("�û����а�");
		this.setSize(550, 520);
		this.setLocationRelativeTo(null);
		result = new JTextArea();
		result.setLocation(100, 50);
		// ��ȡ���ݷ�ʽ
		String str = "<<<<<<<<<  ���а� >>>>>>>>>>>>\n";
		List<Rank> list = new ArrayList<Rank>();
		// ǿת��Rank���͵�����
		String[] strings = data.split("-");
		for (int i = 0; i < strings.length; i++) {
			String[] strings1 = strings[i].split("%*%");
			Rank tt = new Rank(strings1[0], strings1[1], Integer.parseInt(strings1[2]));
			list.add(tt);
		}
		// ��������
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j).getScore() < list.get(j + 1).getScore()) {
					Rank temp;
					temp = list.get(j);// ����λ��
					// ���ǰ����Ժ���С����任λ�ã���������λ��
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
        int num = 0;//���ڱ�ʾ���������
		for (Rank i : list) {
			str += "��"+(++num)+"����"+ i.getTime() + "%" + i.getUsername() + "%" + i.getScore() + "\n";
		}
		result.setText(str);
		result.setFont(new Font("΢���ź�", Font.BOLD, 16));
		this.add(result);
		this.dispose();
		this.setVisible(true);
	}
}













	// public Rankuser1(String data) {
	// this.setTitle("�û����а�");
	// this.setSize(550,520);
	// this.setLocationRelativeTo(null);
	// result =new JTextArea();
	// result.setLocation(100, 50);
	// //��ȡ���ݷ�ʽ
	// String str = "<<<<<<<<< ���а� >>>>>>>>>>>>\n" ;
	// String [] strings =data.split("-");
	// for(int i =0;i<strings.length;i++){
	// str +=strings[i]+"\n";
	// }
	// result.setText(str);
	//
	// //���һ��
	// this.add(result);
	// this.dispose();
	// this.setVisible(true);
	//
	// }
	// public static void main(String[] args) throws IOException {
	// Rankuser ss = new Rankuser();
	// //ss.showmsg("2019/06/04 10:31%aaa%1-2019/06/04 10:33%����%5-");
	// }


