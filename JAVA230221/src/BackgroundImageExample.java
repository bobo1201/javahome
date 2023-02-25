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

public class BackgroundImageExample {
	
	// 메인 윈도우 설정
	public BackgroundImageExample() {
		BackgroundImageExample2 bg2 = new BackgroundImageExample2();
//		bg2.setTitle("배경 그림 넣기");
//		this.getContentPane().add(bg2.getButton(), BorderLayout.CENTER);
//		this.setSize(200,270);
//		this.setResizable(false);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);

	}
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	BackgroundImageExample jFrame = new BackgroundImageExample();
            }
        });
    }
}
