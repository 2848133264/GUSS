package GUI_oop2;

import javax.swing.ImageIcon;

public class computer {
	String name="����";
	int score = 0;
	//�����
	
//	�����������1~3��
//	����1����ʾ�����Գ�ȭ: ������
//	����2����ʾ�����Գ�ȭ: ʯͷ��
//	����3����ʾ�����Գ�ȭ: ����
	
	//���Գ�ȭ
	public int  punches(Game ui){	
		int compfist= (int)(Math.random()*10)%3 +1;
		if (compfist == 1) {// ����
			ui.comqlbl.setIcon(new ImageIcon("img/j.png"));			
		}
		if (compfist == 2) {// ʯͷ
			ui.comqlbl.setIcon(new ImageIcon("img/q.png"));			
		}
		if (compfist == 3) {// ��
			ui.comqlbl.setIcon(new ImageIcon("img/b.png"));			
		}
		return compfist;
	}
}
