package GUI_oop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener {

	JPanel contentPane;
	JMenuBar mnuNotepad = new JMenuBar();
	JMenu mnuFile = new JMenu();
	JMenu mnuEdit = new JMenu();
	JMenu mnuFormat = new JMenu();
	JMenuItem mnuNew = new JMenuItem();
	JMenuItem mnuOpen = new JMenuItem();
	JMenuItem mnuSave = new JMenuItem();
	JMenuItem mnuSaveAs = new JMenuItem();
	JMenuItem mnuExit = new JMenuItem();
	JMenu mnuHelp = new JMenu();
	JMenu mnuRank = new JMenu();// 排行的菜单
	JMenuItem mnuRankA = new JMenuItem();//

	User user = new User();
	private computer comp = new computer();
	private int count = 0;// 记录场数
	// 初始化
	JLabel preqlbl;// 用户出拳
	JLabel comqlbl;// 电脑出拳
	int perfist = 0;
	int compfist = 0;
	JButton jlbl, qlbl, blbl;// 剪刀,石头，布
	JLabel tiplbl;// 结果显示。

	public Game(String name) {
		// TODO Auto-generated constructor stub
		user.name = name;
		System.out.println("用户名为：" + user.name);
	}

	// 设置一个按钮，结束比赛游戏
	JButton overGame;

	void showMnue() {
		contentPane = (JPanel) getContentPane();
		contentPane.setLayout(null);
		this.setJMenuBar(mnuNotepad);
		setSize(new Dimension(760, 480));
		setTitle("菜单");
		mnuFile.setText("文件");// 1
		mnuEdit.setText("编辑");// 2
		mnuFormat.setText("格式");// 3
		mnuNew.setText("新建");
		mnuOpen.setText("打开...");
		mnuSave.setText("保存");
		mnuSaveAs.setText("另存为...");
		mnuExit.setText("退出");
		mnuHelp.setText("帮助");// 4
		mnuRank.setText("排行");//
		mnuRankA.setText("降序方式");

		mnuNotepad.add(mnuFile);
		mnuNotepad.add(mnuEdit);
		mnuNotepad.add(mnuFormat);
		mnuNotepad.add(mnuHelp);
		mnuNotepad.add(mnuRank);

		mnuFile.add(mnuNew);// 1
		mnuFile.add(mnuOpen);
		mnuFile.add(mnuSave);
		mnuFile.add(mnuSaveAs);
		mnuFile.add(mnuExit);
		mnuRank.add(mnuRankA);
	}

	public void intit() {

		showMnue();
		// 游戏界面
		// 基本的设置
		// 基本的设置

		this.setTitle("猜拳游戏");
		this.setSize(550, 560);
		// 布局设置为空，绝对布局
		this.setLayout(null);

		//// 设置一个按钮，结束比赛游戏
		overGame = new JButton("结束");
		overGame.setBounds(440, 370, 60, 60);
		overGame.setBackground(Color.white);
		this.add(overGame);
		// 添加图标
		String filepath = "img/icon.jpg";
		ImageIcon icon = new ImageIcon(filepath);
		this.setIconImage(icon.getImage());
		// 添加人物图片。
		String filepath1 = "img/m1.png";
		ImageIcon iconl = new ImageIcon(filepath1);
		JLabel imLabel = new JLabel();
		imLabel.setIcon(iconl);
		imLabel.setBounds(27, 40, 85, 80);
		this.add(imLabel);
		// 添加拳头图片
		String filepath2 = "img/q.png";
		ImageIcon iconl1 = new ImageIcon(filepath2);
		preqlbl = new JLabel();
		preqlbl.setIcon(iconl1);
		preqlbl.setBounds(125, 46, 50, 50);
		this.add(preqlbl);
		// VS图片
		String filepath3 = "img/vs1.png";
		ImageIcon iconl3 = new ImageIcon(filepath3);
		JLabel imLabel3 = new JLabel();
		imLabel3.setIcon(iconl3);
		imLabel3.setBounds(230, 45, 70, 45);
		this.add(imLabel3);
		// 布添加
		String filepath4 = "img/b.png";
		ImageIcon iconl4 = new ImageIcon(filepath4);
		comqlbl = new JLabel();
		comqlbl.setIcon(iconl4);
		comqlbl.setBounds(350, 46, 50, 50);
		this.add(comqlbl);
		// 对手添加
		String filepath5 = "img/m2.png";
		ImageIcon iconl5 = new ImageIcon(filepath5);
		JLabel imLabel5 = new JLabel();
		imLabel5.setIcon(iconl5);
		imLabel5.setBounds(420, 40, 85, 80);
		this.add(imLabel5);
		// 剪刀
		String filepath6 = "img/j.png";
		ImageIcon iconl6 = new ImageIcon(filepath6);
		jlbl = new JButton();
		jlbl.setIcon(iconl6);
		jlbl.setBounds(40, 150, 50, 50);
		this.add(jlbl);
		// 小弟
		String filepath7 = "img/z.png";
		ImageIcon iconl7 = new ImageIcon(filepath7);
		tiplbl = new JLabel();
		tiplbl.setIcon(iconl7);
		tiplbl.setBounds(160, 130, 230, 125);
		this.add(tiplbl);
		// 布
		String filepath8 = "img/b.png";
		ImageIcon iconl8 = new ImageIcon(filepath8);
		blbl = new JButton();
		blbl.setIcon(iconl8);
		blbl.setBounds(40, 260, 50, 50);
		this.add(blbl);
		// vs
		String filepath10 = "img/vs.png";
		ImageIcon iconl10 = new ImageIcon(filepath10);
		JLabel imLabel10 = new JLabel();
		imLabel10.setIcon(iconl10);
		imLabel10.setBounds(125, 255, 330, 190);
		this.add(imLabel10);
		// 拳头
		String filepath9 = "img/q.png";
		ImageIcon iconl9 = new ImageIcon(filepath9);
		qlbl = new JButton();
		qlbl.setIcon(iconl9);
		qlbl.setBounds(40, 370, 50, 50);
		this.add(qlbl);
		//
		registerListenner();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	// 注册监听
	private void registerListenner() {
		jlbl.addActionListener(this);
		qlbl.addActionListener(this);
		blbl.addActionListener(this);
		overGame.addActionListener(this);

		mnuRankA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					new Rankuser(IOutil.Rankread());

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		mnuNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 新建的时候，跳转到登入界面去，保存信息到某个菜单中
				// String data =null;
				// String time = IOutil.sdf.format(new Date().getTime());
				// data= time + "%"+user.name + "%"+user.score;//用于分割
				//
				// //新建用户的时候
				// try {
				// IOutil.RankscoreWriter(data);
				// } catch (IOException e1) {
				// // TODO Auto-generated catch block
				// e1.printStackTrace();
				// }
				// Game_start game_start =new Game_start();
			}
		});

		// 保存
		mnuSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 保存信息的时候，关闭程序
				// IOutil.RankscoreWriter(data);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		perfist = user.punches(this, btn);
		// 电脑出拳
		compfist = comp.punches(this);
		// 计算当前的比赛的结果
		rule(perfist, compfist);
		// 显示结果
		// 点击按钮的时候 实现结果输出

		if (btn == overGame) {
			jFrame aFrame = new jFrame(showResult());
			// 操作返回
			aFrame.lister1(this);
		}

	}

	public int rule(int perFist, int compFist) {
		/*
		 * 1.如果perFist == compFist ----> 平局 2.如果 perFist == 1 && compFist ==3 ||
		 * perFist == 2 && compFist== 1 || perFist == 3&& compFist == 2 用户赢
		 * 3.否则电脑胜。
		 */
		if (perFist == compFist) {
			System.out.println("结局：和局，真帅。");
			tiplbl.setIcon(new ImageIcon("img/z.png"));
			this.add(tiplbl);
		} else if ((perFist == 1 && compFist == 3) || (perFist == 2 && compFist == 1)
				|| (perFist == 3 && compFist == 2)) {
			tiplbl.setIcon(new ImageIcon("img/h.png"));
			System.out.println("结局：恭喜，你赢了！");
			user.score++;
			return 1;
		} else {
			tiplbl.setIcon(new ImageIcon("img/w.png"));
			System.out.println("你输了，再接再厉！");
			comp.score++;
			return 2;
		}
		return 0;
	}

	public String showResult() {
		String result = "";
		if (user.score == comp.score) {
			result = "平局!      " + user.name + "  VS  " + comp.name + "   " + user.score + "  :    " + comp.score;
		} else if (user.score > comp.score) {
			result = "恭喜你 获胜 !      " + user.name + "  VS  " + comp.name + "    " + user.score + "  :    " + comp.score;
		} else {
			result = "你输了 !    " + user.name + "  VS  " + comp.name + "   " + user.score + "  :    " + comp.score;
		}
		return result;
	}

}
