package GUI_oop2;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class User {
	
	int score = 0;//分数
	String name = "匿名";//名称
	private String password;
	//用户出拳
	public int punches(Game ui,JButton btnObject){
		
		int perFist = 0;
		if(btnObject ==ui.jlbl){//剪刀
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
