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
	
	// ���� ������ ����
	public AntiAliasingExample() {
		setTitle("��Ƽ�˸��ƽ�");
		getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
		setSize(200,300);
        setVisible(true);
		add(getButton());

	}
	
	// Canvas Ŭ���� ����
	public class MyCanvas extends Canvas{
		public void paint(Graphics g) {
			// ��Ƽ�˸������ �������� ���� ��
			g.fillOval(50, 50, 100, 100);
			
			// ��Ƽ�˸������ ������ ��
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
			g.fillOval(50, 200, 100, 100);
		}
	}
	
	// JButton ����
	public JButton getButton() {
		if(b2 == null) {
			b2 = new JButton("��ư");
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
