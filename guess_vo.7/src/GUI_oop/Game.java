package GUI_oop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener,Runnable {

	int perFist = 0;//表示用户出拳。
	int compFist = 0;//表示电脑出拳
	
	private Socket socket ;
	
	public void setSocket(Socket socket) {
		this.socket = socket;
		//启动接受线程
		Thread t =new Thread(this);
		t.start();
	}
		
	/**
	 * 发送消息
	 */
	private void send(String data){
		
		try {
			DataOutputStream pw =new DataOutputStream(socket.getOutputStream());
			
			pw.writeUTF(data);
			System.out.println("发的消息："+data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Game中send方法的错误！");
			e.printStackTrace();
		}
		
	}
	
	private User user;
	private computer comp;
	private int count = 0;// 记录场数
	// 初始化
	JLabel preqlbl;// 用户出拳
	JLabel comqlbl;// 电脑出拳
	JButton jlbl, qlbl, blbl;// 剪刀,石头，布
	JLabel tiplbl;// 结果显示。

	//设置一个按钮，结束比赛游戏
	JButton  overGame ;
	public void intit() {
		user = new User();
		comp = new computer();
		// 游戏界面
		// 基本的设置
		// 基本的设置
		this.setTitle("猜拳游戏");
		this.setSize(550, 500);
		// 布局设置为空，绝对布局
		this.setLayout(null);
		
		////设置一个按钮，结束比赛游戏
		overGame =new JButton("结束");
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
		String filepath2 = "img/q.png";//这个是默认的图标，改成空白的
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
	//注册监听
	private void registerListenner() {
		jlbl.addActionListener(this);
		qlbl.addActionListener(this);
		blbl.addActionListener(this);
		overGame.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		//调用户出拳
		perFist = user.punches(this, btn);
		String data =socket.getLocalPort()+":"+perFist ;
		//出拳之后，发消息给服务器，由服务器转发消息
		send(data);
		// 计算当前的比赛的结果
		//rule(perfist, compfist);
		// 显示结果
		// 点击按钮的时候 实现结果输出
		if (btn == overGame) {
			jFrame aFrame = new jFrame(showResult());
			// 操作返回
			aFrame.lister1(this);
		}

	}

	/**
	 * 单局的结果
	 * @param perFist
	 * @param compFist
	 * @return
	 */
	public int rule(int perFist, int compFist) {
		
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

	/**
	 * 最终结果
	 * 
	 * @return
	 */
	public String  showResult() {	
		String result ="";
		if (user.score == comp.score) {
			result = "平局!      " + user.name + "  VS  " + comp.name + "   " + user.score + "  :    " + comp.score;
		} else if (user.score > comp.score) {
			result = "恭喜你 获胜 !      " + user.name + "  VS  " + comp.name + "    " + user.score+ "  :    " + comp.score;
		} else {
			result = "你输了 !    " + user.name + "  VS  " + comp.name + "   " + user.score + "  :    " + comp.score;
		}
		return result ;
	}
	
	/**
	 * 线程调用
	 * 
	 */
	
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		while(true){			
			//接受消息			
			String rec = "";
			
			DataInputStream buf;
			try {
				buf = new DataInputStream(socket.getInputStream());
				rec = buf.readUTF();
				
				System.out.println("接受到的消息："+rec);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] texts =rec.split(":");
			if(null == texts || texts.length<=1){
				return ;
			}
			String port = texts[0];
			if(port.equals(socket.getLocalPort()+"")){
				return;
			}
			String fistNum = texts[1];//分割后的出拳数字。
			//电脑出拳变成了这个对方用户传过来的值
			compFist =Integer.parseInt(fistNum);
			if (compFist == 1) {// 剪刀
				comqlbl.setIcon(new ImageIcon("img/j.png"));			
			}
			if (compFist == 2) {// 石头
				comqlbl.setIcon(new ImageIcon("img/q.png"));			
			}
			if (compFist == 3) {// 布
				comqlbl.setIcon(new ImageIcon("img/b.png"));			
			}			
			rule(perFist, compFist);//单局的判定
		}
		
	}

}
