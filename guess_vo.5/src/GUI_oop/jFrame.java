package GUI_oop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import GUI_oop.IOutil;

public class jFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label, aa,aa1;
	private JButton leave, continueGame;
	private JLabel lastsore ;
	
	public jFrame(String result) {
		this.setTitle("Gameover");
		this.setLayout(null);
		this.setSize(320, 220);
		this.setLocationRelativeTo(null);// 居中显示的效果放在这个窗体设置的后面 就行

		aa = new JLabel("比赛结果：");
		aa.setBounds(60, 20, 100, 40);
		aa.setForeground(Color.red);
		this.add(aa);
		aa1 = new JLabel("上  次");
		aa1.setBounds(60, 46, 100, 40);
		aa1.setForeground(Color.red);
		this.add(aa1);
		//上次的成绩
		lastsore =new JLabel();
		lastsore.setBounds(100, 46, 100, 40);
		
		lastsore.setText(IOutil.readData());//读取数据
		
		lastsore.setForeground(Color.red);
		this.add(lastsore);
		
		label = new JLabel();
		label.setBounds(60, 50, 260, 100);
		label.setText(result);
		label.setForeground(Color.red);
		this.add(label);
		// 在添加几个按钮，离开，继续
		leave = new JButton("离开");
		continueGame = new JButton("继续");
			
		continueGame.setBounds(30, 111, 60, 30);
		leave.setBounds(120, 111, 60, 30);
	
		this.add(leave);
		this.add(continueGame);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
			
	}
	public void lister1(Game game) {

		// 手动添加监听
		leave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				//List<Rank> list =new ArrayList<>();//用户保存信息的
					String time = IOutil.sdf.format(new Date().getTime());//格式化时间正确
				//System.out.println(time);
				//放入信息的操作
				//Rank rank =new Rank(time, "%"+game.user.name+"%", game.user.score);			
				String data = time + "%"+game.user.name + "%"+game.user.score+"-";			
				System.out.println(data);	
				
				try {
					String nn = IOutil.Rankread();//上次的数据							
					IOutil.RankscoreWriter(data+nn);
					//System.out.println(IOutil.Rankread());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				IOutil.writeData("用户成绩："+game.user.score+"分");
				
				System.exit(0);
			}
		});

		continueGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 如何实现返回上一层游戏界面中去能
				//但是当前的这个窗体还是会显示在界面上。
				game.setVisible(true);
			
			}
		});
		

		
	}


}
