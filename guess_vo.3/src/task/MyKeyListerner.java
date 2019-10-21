package task;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListerner implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed:"+e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased:");
	}

}
