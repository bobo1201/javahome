import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AntiAliasingExample extends JFrame {
	private JButton b2;
	
	// 메인 윈도우 설정
	public AntiAliasingExample() {
		setTitle("안티알리아싱");
		getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
		setSize(200,300);
        setVisible(true);
		add(getButton());

	}
	
	// Canvas 클래스 선언
	public class MyCanvas extends Canvas{
		public void paint(Graphics g) {
			// 안티알리어싱을 적용하지 않은 원
			g.fillOval(50, 50, 100, 100);
			
			// 안티알리어싱을 적용한 원
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
			g.fillOval(50, 200, 100, 100);
		}
	}
	
	// JButton 생성
	public JButton getButton() {
		if(b2 == null) {
			b2 = new JButton("버튼");
			b2.setBounds(50, 50, 100, 30);
			b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new BackgroundImageExample();
					setVisible(false);
				}
			});
		}
		return b2;
	}
}
