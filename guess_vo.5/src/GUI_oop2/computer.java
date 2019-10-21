package GUI_oop2;

import javax.swing.ImageIcon;

public class computer {
	String name="电脑";
	int score = 0;
	//随机数
	
//	产生随机数（1~3）
//	产生1：显示“电脑出拳: 剪刀”
//	产生2：显示”电脑出拳: 石头”
//	产生3：显示“电脑出拳: 布”
	
	//电脑出拳
	public int  punches(Game ui){	
		int compfist= (int)(Math.random()*10)%3 +1;
		if (compfist == 1) {// 剪刀
			ui.comqlbl.setIcon(new ImageIcon("img/j.png"));			
		}
		if (compfist == 2) {// 石头
			ui.comqlbl.setIcon(new ImageIcon("img/q.png"));			
		}
		if (compfist == 3) {// 布
			ui.comqlbl.setIcon(new ImageIcon("img/b.png"));			
		}
		return compfist;
	}
}
