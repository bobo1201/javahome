import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ImageExample extends JFrame {
	// ���� ������ ����
	public ImageExample() {
		setTitle("�̹��� �׸���");
		getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
		add(new MyCanvas(), BorderLayout.CENTER);
		setSize(500,350);
	}
	
	// Canvas Ŭ���� ����
	public class MyCanvas extends Canvas{
		private Image imgSun, imgMoon;
		
		public MyCanvas() {
			// ����� ������� ����
			setBackground(Color.WHITE);
			
			// �̹����� �ε��ؼ� �а�, Image ��ü ���
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			imgSun = toolkit.getImage(getClass().getResource("sun.gif"));
			imgMoon = new ImageIcon(getClass().getResource("moon.gif")).getImage();
		}
		
		public void paint(Graphics g) {
			// �̹��� �����
			g.drawImage(imgSun, 10, 10, this);
			g.drawImage(imgMoon, 300, 20, this);			
		}
	}
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	ImageExample jFrame = new ImageExample();
                jFrame.setVisible(true);
            }
        });
    }
}
