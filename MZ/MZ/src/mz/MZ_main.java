package mz;

import java.awt.EventQueue;

public class MZ_main {
	
	public MZ_main() {
		new MZ_home_p1();
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
            	new MZ_main();
            }
		});
	}
}