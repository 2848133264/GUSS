package GUI_oop;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class User {
	
	int score = 0;//����
	String name = "����";//����
	
	//�û���ȭ
	public int punches(Game ui,JButton btnObject){
		
		int perFist = 0;
		if(btnObject ==ui.jlbl){//����
			ImageIcon perImg =new ImageIcon("img/j.png");
			ui.preqlbl.setIcon(perImg);
			perFist = 1;
		}
		if(btnObject == ui.qlbl){
			ImageIcon perImg =new ImageIcon("img/q.png");
			ui.preqlbl.setIcon(perImg);
			perFist = 2;
		}
		if(btnObject == ui.blbl){
			ImageIcon perImg =new ImageIcon("img/b.png");
			ui.preqlbl.setIcon(perImg);
			perFist = 3;
		}
		return perFist;
	}
	

}
