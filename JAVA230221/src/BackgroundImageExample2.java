import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BackgroundImageExample2 extends JFrame {
	private JTextField txtId;
	private JButton btnLogin;
	
	// 메인 윈도우 설정
	public BackgroundImageExample2() {
		this.setTitle("배경 그림 넣기");
		this.getContentPane().add(new MyPanel(), BorderLayout.CENTER);
		this.setSize(200,270);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(getButton());
        setVisible(true);
	}
	
	// JPanel 클래스 선언
	public class MyPanel extends JPanel{
		public MyPanel() {
			setLayout(null);
			// JTextField JButton 부착
			add(getTextField());
		}
	
		@Override
		public void paintComponent(Graphics g) {
			// 배경 그리기
//			ImageIcon icon = new ImageIcon(this.getClass().getResource("bg.jpg"));
//			g.drawImage(icon.getImage(), 0, 0, this);
		}
	}
	
	// JTextField 생성
	public JTextField getTextField() {
		if(txtId == null) {
			txtId = new JTextField();
			txtId.setBounds(50, 50, 100, 30);
		}
		return txtId;
	}
	
	// JButton 생성
	public JButton getButton() {
		if(btnLogin == null) {
			btnLogin = new JButton("버튼");
			btnLogin.setBounds(50, 50, 100, 30);
			btnLogin.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new AntiAliasingExample();
					setVisible(false);
				}
			});
		}
		return btnLogin;
	}
}
