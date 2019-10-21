package task;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;//�����¼���

//������ʱʵ�ּ����ӿ�

public class cardlayout extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton nextbutton;// ��һ��

	private JButton preButton;// ǰһ��

	private JButton fisbutton;// ��һ��

	private JButton lastButton;// ���һ��

	Panel cardPanel = new Panel();

	Panel controlpaPanel = new Panel();

	// ���忨Ƭ���ֶ���

	CardLayout card = new CardLayout();

	// ���幹�캯��

	public cardlayout() {

		setTitle("��Ƭ���ֹ�����");

		setSize(400, 700);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		// ����cardPanel������Ϊ��Ƭ����

		cardPanel.setLayout(card);

		// ʵ������ť����
		fisbutton = new JButton("��һ��");

		nextbutton = new JButton("��һ��");

		preButton = new JButton("��һ��");

		lastButton = new JButton("���һ��");

		// ��ΪcardPanel������Ϊ��Ƭ���֣����ֻ��ʾ������ӵ����

		
		
		String picture[] = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg" };

		for (int i = 0; i < picture.length; i++) {

			// ͼƬ��ַ
			
			ImageIcon icon = new ImageIcon("img1/" + picture[i]);
			
			//����ͼƬ	
			JButton button = new JButton();
			button.setIcon(icon);
			
			cardPanel.add(button);
		}
		// Ϊ��ť����ע�������

		nextbutton.addActionListener(this);

		preButton.addActionListener(this);

		fisbutton.addActionListener(this);

		lastButton.addActionListener(this);
		
		//�ڿ�����������

		controlpaPanel.add(fisbutton);

		controlpaPanel.add(preButton);

		controlpaPanel.add(nextbutton);

		controlpaPanel.add(lastButton);

		// ������������Ϊ��ǰ������������

		Container container = getContentPane();

		// �� cardPanel�������ڴ��ڱ߽粼�ֵ��м䣬����Ĭ��Ϊ�߽粼��

		container.add(cardPanel, BorderLayout.CENTER);

		// ��controlpaPanel�������ڴ��ڱ߽粼�ֵ��ϱߣ�

		container.add(controlpaPanel, BorderLayout.SOUTH);

		this.setVisible(true);

	}

	// ʵ�ְ�ť�ļ�������ʱ�Ĵ���

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == nextbutton) {

			card.next(cardPanel);
		}

		if (e.getSource() == preButton) {

			card.previous(cardPanel);
		}
		if (e.getSource() == fisbutton) {

			card.first(cardPanel);
		}
		if (e.getSource() == lastButton) {

			card.last(cardPanel);
		}

	}

	public static void main(String[] args) {

		 new cardlayout();

	}

}