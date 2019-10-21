package task;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;//引入事件包

//定义类时实现监听接口

public class cardlayout extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton nextbutton;// 下一张

	private JButton preButton;// 前一张

	private JButton fisbutton;// 第一张

	private JButton lastButton;// 最后一张

	Panel cardPanel = new Panel();

	Panel controlpaPanel = new Panel();

	// 定义卡片布局对象

	CardLayout card = new CardLayout();

	// 定义构造函数

	public cardlayout() {

		setTitle("卡片布局管理器");

		setSize(400, 700);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		// 设置cardPanel面板对象为卡片布局

		cardPanel.setLayout(card);

		// 实例化按钮对象
		fisbutton = new JButton("第一张");

		nextbutton = new JButton("下一张");

		preButton = new JButton("上一张");

		lastButton = new JButton("最后一张");

		// 因为cardPanel面板对象为卡片布局，因此只显示最先添加的组件

		
		
		String picture[] = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg" };

		for (int i = 0; i < picture.length; i++) {

			// 图片地址
			
			ImageIcon icon = new ImageIcon("img1/" + picture[i]);
			
			//设置图片	
			JButton button = new JButton();
			button.setIcon(icon);
			
			cardPanel.add(button);
		}
		// 为按钮对象注册监听器

		nextbutton.addActionListener(this);

		preButton.addActionListener(this);

		fisbutton.addActionListener(this);

		lastButton.addActionListener(this);
		
		//在控制面板中添加

		controlpaPanel.add(fisbutton);

		controlpaPanel.add(preButton);

		controlpaPanel.add(nextbutton);

		controlpaPanel.add(lastButton);

		// 定义容器对象为当前窗体容器对象

		Container container = getContentPane();

		// 将 cardPanel面板放置在窗口边界布局的中间，窗口默认为边界布局

		container.add(cardPanel, BorderLayout.CENTER);

		// 将controlpaPanel面板放置在窗口边界布局的南边，

		container.add(controlpaPanel, BorderLayout.SOUTH);

		this.setVisible(true);

	}

	// 实现按钮的监听触发时的处理

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