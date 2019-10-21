package GUI_oop;

import java.awt.Font;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Rankuser extends JFrame {

	private static final long serialVersionUID = 1L;
	// 面板的数据方式显示
	JTextArea result;
	public Rankuser(String data) throws IOException {

		this.setTitle("用户排行榜");
		this.setSize(550, 520);
		this.setLocationRelativeTo(null);
		result = new JTextArea();
		result.setLocation(100, 50);
		// 读取数据方式
		String str = "<<<<<<<<<  排行榜 >>>>>>>>>>>>\n";
		List<Rank> list = new ArrayList<Rank>();
		// 强转成Rank类型的数据
		String[] strings = data.split("-");
		for (int i = 0; i < strings.length; i++) {
			String[] strings1 = strings[i].split("%*%");
			Rank tt = new Rank(strings1[0], strings1[1], Integer.parseInt(strings1[2]));
			list.add(tt);
		}
		// 降序排序
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j).getScore() < list.get(j + 1).getScore()) {
					Rank temp;
					temp = list.get(j);// 交换位置
					// 如果前者相对后者小，则变换位置，设置它的位置
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
        int num = 0;//用于表示这个排名的
		for (Rank i : list) {
			str += "第"+(++num)+"名："+ i.getTime() + "%" + i.getUsername() + "%" + i.getScore() + "\n";
		}
		result.setText(str);
		result.setFont(new Font("微软雅黑", Font.BOLD, 16));
		this.add(result);
		this.dispose();
		this.setVisible(true);
	}
}













	// public Rankuser1(String data) {
	// this.setTitle("用户排行榜");
	// this.setSize(550,520);
	// this.setLocationRelativeTo(null);
	// result =new JTextArea();
	// result.setLocation(100, 50);
	// //读取数据方式
	// String str = "<<<<<<<<< 排行榜 >>>>>>>>>>>>\n" ;
	// String [] strings =data.split("-");
	// for(int i =0;i<strings.length;i++){
	// str +=strings[i]+"\n";
	// }
	// result.setText(str);
	//
	// //输出一下
	// this.add(result);
	// this.dispose();
	// this.setVisible(true);
	//
	// }
	// public static void main(String[] args) throws IOException {
	// Rankuser ss = new Rankuser();
	// //ss.showmsg("2019/06/04 10:31%aaa%1-2019/06/04 10:33%阿发%5-");
	// }


