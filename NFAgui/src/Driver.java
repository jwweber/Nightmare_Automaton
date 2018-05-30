import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Driver {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BackPanel back = new BackPanel();
		Thread t = new Thread(back);
		JFrame frame = new JFrame();
		frame.setSize(980,1000);
		frame.setContentPane(back);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		back.run();
	}

}
