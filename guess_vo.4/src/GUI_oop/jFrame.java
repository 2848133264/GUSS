package GUI_oop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.AllPermission;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label, aa;
	private JButton leave, continueGame;

	public jFrame(String result) {
		this.setTitle("Gameover");
		this.setLayout(null);
		this.setSize(320, 220);
		this.setLocationRelativeTo(null);// 居中显示的效果放在这个窗体设置的后面 就行

		aa = new JLabel("比赛结果：");
		aa.setBounds(60, 20, 100, 40);
		aa.setForeground(Color.red);
		this.add(aa);
		label = new JLabel();
		label.setBounds(60, 20, 260, 100);
		label.setText(result);
		label.setForeground(Color.red);
		this.add(label);
		// 在添加几个按钮，离开，继续
		leave = new JButton("离开");
		continueGame = new JButton("继续");
		continueGame.setBounds(60, 111, 60, 30);
		leave.setBounds(160, 111, 60, 30);
		this.add(leave);
		this.add(continueGame);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void lister1(JFrame jFrame1) {

		// 手动添加监听
		leave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		continueGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 如何实现返回上一层游戏界面中去能
				jFrame1.setVisible(true);
			}
		});
	}

}
