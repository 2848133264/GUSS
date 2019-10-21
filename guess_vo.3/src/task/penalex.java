package task;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class penalex  extends JFrame{

	public penalex(){
		
		this.setSize(500,500);
		this.getContentPane().add(new myPanel());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new penalex();
	}

}
class myPanel extends JPanel{
	 public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.red);
		for(int i = 1;i<12;i++){
			g.drawLine(10, 30*i-20, 310,30*i-20);
			g.drawLine(30*i-20, 10, 30*i-20, 310);
		}
		
	}	
}