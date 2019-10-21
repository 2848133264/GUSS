package GUI_oop2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.AllPermission;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import GUI_oop.IOutil;

public class jFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label, aa;
	private JButton leave, continueGame;
	private JLabel lastsore ;
	public jFrame(String result) {
		this.setTitle("Gameover");
		this.setLayout(null);
		this.setSize(320, 220);
		this.setLocationRelativeTo(null);// ������ʾ��Ч����������������õĺ��� ����

		aa = new JLabel("���������");
		aa.setBounds(60, 20, 100, 40);
		aa.setForeground(Color.red);
		this.add(aa);
		//�ϴεĳɼ�
		lastsore =new JLabel();
		lastsore.setBounds(60, 5, 200, 100);
		lastsore.setText(IOutil.readData());
		lastsore.setForeground(Color.red);
		this.add(lastsore);
		//���ڵĳɼ�
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

	public void lister1(Game jFrame1) {

		// �ֶ���Ӽ���
		leave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				     //������ǳɼ�
				IOutil.writeData("�û��ɼ���"+jFrame1.user.score+"��");							
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
