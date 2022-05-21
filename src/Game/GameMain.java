package Game;



import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameMain extends JFrame implements WindowListener{
	
	public static void main(String[] args) {
		new GameMain();
	}
	
	public GameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame jf = new JFrame();
		JPanel jf1 = new JPanel();
		GamePlay gamePlay = new GamePlay();
		jf.setBounds(100, 100, 670, 600);
		jf.setLocationRelativeTo(null);
		jf.setTitle("Breakout Ball");
		jf.setResizable(false);
		jf.setVisible(true);
		jf.add(gamePlay);
		JPanel panel = new JPanel();
		panel.setBounds(37, 76, 670, 600);
		jf1.add(panel);
		panel.setLayout(null);
		gamePlay.setLayout(null);
		setVisible(true);
		addWindowListener(this);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}
	// 윈도우창 닫기 알림
	@Override
	public void windowClosing(WindowEvent e) {
		int exit = 0;
			if(exit==0) {
				dispose();
			}
			else{
			}
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
}
