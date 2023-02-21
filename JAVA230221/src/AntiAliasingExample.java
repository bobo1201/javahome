import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AntiAliasingExample extends JFrame {
	// ���� ������ ����
	public AntiAliasingExample() {
		setTitle("��Ƽ�˸��ƽ�");
		getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
		setSize(200,300);
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
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	AntiAliasingExample jFrame = new AntiAliasingExample();
                jFrame.setVisible(true);
            }
        });
    }
}
