package guess_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.RuleBasedCollator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guess extends JFrame implements ActionListener{

	private static final long serialVersionUID = 5610708921603297306L;
	
	private JLabel  preqlbl;//用户出拳
	private JLabel comqlbl;//电脑出拳
	private int perfist = 0;
	private int compfist = 0;
	private JButton jlbl, qlbl,blbl;//剪刀,石头，布
	private JLabel tiplbl;//结果显示。
	public guess() {
		// TODO Auto-generated constructor stub
		//基本的设置
		this.setTitle("猜拳游戏");
		this.setSize(550, 500);
		//布局设置为空，绝对布局
		this.setLayout(null);
		//添加图标		
		String filepath = "img/icon.jpg";
		ImageIcon icon = new ImageIcon(filepath);
		this.setIconImage(icon.getImage());
		//添加人物图片。
		String filepath1 = "img/m1.png";
		ImageIcon iconl = new ImageIcon(filepath1);
		JLabel imLabel = new JLabel();
		imLabel.setIcon(iconl);
		imLabel.setBounds(27, 40, 85, 80);
		this.add(imLabel);
		//添加拳头图片
		String filepath2 = "img/q.png";
		ImageIcon iconl1 = new ImageIcon(filepath2);
		 preqlbl = new JLabel();
		 preqlbl.setIcon(iconl1);
		 preqlbl.setBounds(125,46,50,50);
		this.add(preqlbl);
		//VS图片
		String filepath3 = "img/vs1.png";
		ImageIcon iconl3 = new ImageIcon(filepath3);
		JLabel imLabel3 = new JLabel();
		imLabel3.setIcon(iconl3);
		imLabel3.setBounds(230,45,70,45);
		this.add(imLabel3);
		//布添加
		String filepath4 = "img/b.png";
		ImageIcon iconl4 = new ImageIcon(filepath4);
		 comqlbl = new JLabel();
		 comqlbl.setIcon(iconl4);
		 comqlbl.setBounds(350,46,50,50);
		this.add(comqlbl);
		//对手添加
		String filepath5 = "img/m2.png";
		ImageIcon iconl5 = new ImageIcon(filepath5);
		JLabel imLabel5 = new JLabel();
		imLabel5.setIcon(iconl5);
		imLabel5.setBounds(420,40,85,80);
		this.add(imLabel5);
		//剪刀
		String filepath6 = "img/j.png";
		ImageIcon iconl6 = new ImageIcon(filepath6);
		 jlbl = new JButton();
		 jlbl.setIcon(iconl6);
		 jlbl.setBounds(40,150,50,50);
		this.add(jlbl);
		//小弟
		String filepath7 = "img/z.png";
		ImageIcon iconl7 = new ImageIcon(filepath7);
		tiplbl = new JLabel();
		tiplbl.setIcon(iconl7);
		tiplbl.setBounds(160,130,230,125);
		this.add(tiplbl);	
		//布
		String filepath8 = "img/b.png";
		ImageIcon iconl8 = new ImageIcon(filepath8);
		 blbl = new JButton();
		 blbl.setIcon(iconl8);
		 blbl.setBounds(40,260,50,50);
		this.add(blbl);
		//vs
		String filepath10 = "img/vs.png";
		ImageIcon iconl10 = new ImageIcon(filepath10);
		JLabel imLabel10 = new JLabel();
		imLabel10.setIcon(iconl10);
		imLabel10.setBounds(125,255,330,190);
		this.add(imLabel10);		
		//拳头
		String filepath9 = "img/q.png";
		ImageIcon iconl9 = new ImageIcon(filepath9);
		qlbl = new JButton();
		qlbl.setIcon(iconl9);
		qlbl.setBounds(40,370,50,50);
		this.add(qlbl);
		
		//监听
		registerListenner();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);	
		this.setVisible(true);
	}
	private void registerListenner(){
		jlbl.addActionListener(this);
		qlbl.addActionListener(this);
		blbl.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new guess();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		//用户出拳
		if(btn == jlbl){
			perfist = 1;
			preqlbl.setIcon(new ImageIcon("img/j.png"));
		}
		if(btn == qlbl){
			perfist = 2;
			preqlbl.setIcon(new ImageIcon("img/q.png"));
		}
		if(btn == blbl){
			perfist = 3;
			preqlbl.setIcon(new ImageIcon("img/b.png"));
		}
		//电脑出拳
		compfist = (int) ((Math.random()*10)%3+1);
		//如果随机数为 1，则出剪刀 ，2 为石头， 3布 。
		if(compfist == 1){//剪刀
			comqlbl.setIcon(new ImageIcon("img/j.png"));
		}
		if(compfist == 2){//石头
			comqlbl.setIcon(new ImageIcon("img/q.png"));
		}
		if (compfist == 3) {//布
			comqlbl.setIcon(new ImageIcon("img/b.png"));
		}
		
		//显示结果
		showresult(perfist,compfist);
		
		
	}
	 void showresult(int perfist, int compfist) {
		// TODO Auto-generated method stub
		if(perfist == compfist){//平局
			tiplbl.setIcon(new ImageIcon("img/z.png"));
			this.add(tiplbl);
			// 1剪刀，  2石头，  3 布
		}else if((perfist == 1&& compfist == 3)||
				(perfist == 2 && compfist == 1)||
				(perfist == 3 && compfist == 2)){
			//表示的用户赢了
			tiplbl.setIcon(new ImageIcon("img/h.png"));
		}else{
			//表示的是电脑赢了，你输了。
			tiplbl.setIcon(new ImageIcon("img/w.png"));
		}
	}
	
}
