package GUI_oop2;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame {
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

	public MenuFrame() {
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			jbInit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		contentPane = (JPanel) getContentPane();
		contentPane.setLayout(null);
		this.setJMenuBar(mnuNotepad);
		setSize(new Dimension(760, 480));
		setTitle("�˵�");
		mnuFile.setText("�ļ�");//1
		mnuEdit.setText("�༭");//2
		mnuFormat.setText("��ʽ");//3
		mnuNew.setText("�½�");
		mnuOpen.setText("��...");
		mnuSave.setText("����");
		mnuSaveAs.setText("���Ϊ...");
		mnuExit.setText("�˳�");
		mnuHelp.setText("����");//4
		
		mnuNotepad.add(mnuFile);
		mnuNotepad.add(mnuEdit);
		mnuNotepad.add(mnuFormat);
		mnuNotepad.add(mnuHelp);
		mnuFile.add(mnuNew);//1
		mnuFile.add(mnuOpen);
		mnuFile.add(mnuSave);
		mnuFile.add(mnuSaveAs);
		mnuFile.add(mnuExit);
		setVisible(true);
	}
	public static void main(String[] args) {
		 new MenuFrame();
	}
}
