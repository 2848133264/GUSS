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
		this.setLocationRelativeTo(null);// ������ʾ��Ч����������������õĺ��� ����

		aa = new JLabel("���������");
		aa.setBounds(60, 20, 100, 40);
		aa.setForeground(Color.red);
		this.add(aa);
		label = new JLabel();
		label.setBounds(60, 20, 260, 100);
		label.setText(result);
		label.setForeground(Color.red);
		this.add(label);
		// ����Ӽ�����ť���뿪������
		leave = new JButton("�뿪");
		continueGame = new JButton("����");
		continueGame.setBounds(60, 111, 60, 30);
		leave.setBounds(160, 111, 60, 30);
		this.add(leave);
		this.add(continueGame);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void lister1(JFrame jFrame1) {

		// �ֶ���Ӽ���
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
				// ���ʵ�ַ�����һ����Ϸ������ȥ��
				jFrame1.setVisible(true);
			}
		});
	}

}
