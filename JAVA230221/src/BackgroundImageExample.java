import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BackgroundImageExample extends JFrame {
	private JTextField txtId;
	private JButton btnLogin;
	
	// ���� ������ ����
	public BackgroundImageExample() {
		this.setTitle("��� �׸� �ֱ�");
		this.getContentPane().add(new MyPanel(), BorderLayout.CENTER);
		this.setSize(200,270);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// JPanel Ŭ���� ����
	public class MyPanel extends JPanel{
		public MyPanel() {
			setLayout(null);
			// JTextField JButton ����
			add(getTextField());
			add(getButton());
		}
	
		@Override
		public void paintComponent(Graphics g) {
			// ��� �׸���
			ImageIcon icon = new ImageIcon(this.getClass().getResource("bg.jpg"));
			g.drawImage(icon.getImage(), 0, 0, this);
		}
	}
	
	// JTextField ����
	public JTextField getTextField() {
		if(txtId == null) {
			txtId = new JTextField();
			txtId.setBounds(50, 50, 100, 30);
		}
		return txtId;
	}
	
	// JButton ����
	public JButton getButton() {
		if(btnLogin == null) {
			btnLogin = new JButton("��ư");
			btnLogin.setBounds(50, 50, 100, 30);
		}
		return btnLogin;
	}
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	BackgroundImageExample jFrame = new BackgroundImageExample();
                jFrame.setVisible(true);
            }
        });
    }
}
