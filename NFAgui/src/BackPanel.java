import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;

public class BackPanel extends JPanel implements Runnable {

	/**
	 * @param args
	 */
	JLabel stringHolder;
	JPanel stringPanel;
	int endStateCounter;
	State q0 = new State("A",0);
	State q1 = new State("A#",1);
	State q2 = new State("B",2);
	State q3 = new State("C",3);
	State q4 = new State("C#",4);
	State q5 = new State("D",5);
	State q6 = new State("D#",6);
	State q7 = new State("E",7);
	State q8 = new State("F",8);
	State q9 = new State("F#",9);
	State q10 = new State("G",10);
	State q11 = new State("G#",11);
	Random random;
	int randNum;
	ImagePanel ip;
	JPanel acceptPanel;
	JLabel acceptLabel;
	String outputString = "";
	HorizontalDivider h1 = new HorizontalDivider();
	HorizontalDivider h2 = new HorizontalDivider();
	HorizontalDivider h3 = new HorizontalDivider();
	HorizontalDivider h4 = new HorizontalDivider();
	
	State statePointer;
	
	Divider[] divs = new Divider[12];
	public BackPanel() throws IOException{
		for(int i = 0; i <= 11; i++){
			divs[i] = new Divider();
		}
		
		this.setPreferredSize(new Dimension(1000,1000));
		this.setBackground(new Color(119,85,140));

		ip = new ImagePanel();		
		ip.setPreferredSize(new Dimension(1000,1000));
	
		JPanel header = new JPanel();
		header.setPreferredSize(new Dimension(1000,150));
		header.setBackground(new Color(119,85,140));
		JLabel nm = new JLabel("Nightmare Machine");
		nm.setFont(new Font("Courier New", Font.BOLD, 40));
		JLabel title = new JLabel("recognizes the language:");
		title.setFont(new Font("Courier New", Font.BOLD, 36));
		JLabel expression = new JLabel("[(c ∪ d)(ba ∪ p)*][(c ∪ d)(ba ∪ p)*]*");
		expression.setFont(new Font("Courier New", Font.BOLD, 36));
		header.add(nm);
		header.add(title);
		header.add(expression);
		ip.add(header);
				
		ip.add(h1);
		ip.add(q0);
		ip.add(divs[0]);
		ip.add(q1);
		ip.add(divs[1]);
		ip.add(q2);
		ip.add(divs[2]);
		ip.add(q3);
		
		
		ip.add(h2);
		ip.add(divs[3]);
		ip.add(q4);
		ip.add(divs[4]);
		ip.add(q5);
		ip.add(divs[5]);
		
		ip.add(q6);
		ip.add(divs[6]);
		ip.add(q7);
		ip.add(divs[7]);
		
		
		ip.add(h3);
		ip.add(q8);
		ip.add(divs[8]);
		ip.add(q9);
		ip.add(divs[9]);
		ip.add(q10);
		ip.add(divs[10]);
		ip.add(q11);

		ip.add(h4);
		
		stringPanel = new JPanel();
		stringPanel.setPreferredSize(new Dimension(1000,150));
		stringPanel.setBackground(new Color(119,85,140));
		
		JLabel outputTitle = new JLabel("Output:");
		outputTitle.setFont(new Font("Courier New", Font.BOLD, 26));
		stringHolder = new JLabel(outputString);
		stringHolder.setFont(new Font("Courier New", Font.BOLD, 26));
		stringPanel.add(stringHolder);
		ip.add(outputTitle);
		ip.add(stringPanel);

		this.add(ip);
		
		//Assemble Graph
		q0.isStart = true;
		q8.isEnd = true;
		q9.isEnd = true;
		
		
		q0.edgeOne = q1;
		q0.labelOne = '_';
		q0.edgeTwo = q4;
		q0.labelTwo = '_';
		q0.edgeThree = null;
		q0.labelThree = 'n';
		
		q1.edgeOne = q2;
		q1.labelOne = 'c';
		q1.edgeTwo = null;
		q1.labelTwo = 'n';
		q1.edgeThree = null;
		q1.labelThree = 'n';
		
		q2.edgeOne = q3;
		q2.labelOne = '_';
		q2.edgeTwo = null;
		q2.labelTwo = 'n';
		q2.edgeThree = null;
		q2.labelThree = 'n';
		
		q3.edgeOne = q7;
		q3.labelOne = '_';
		q3.edgeTwo = q8;
		q3.labelTwo = '_';
		q3.edgeThree = q9;
		q3.labelThree = '_';
		
		q4.edgeOne = q5;
		q4.labelOne = 'd';
		q4.edgeTwo = null;
		q4.labelTwo = 'n';
		q4.edgeThree = null;
		q4.labelThree = 'n';
		
		q5.edgeOne = q3;
		q5.labelOne = '_';
		q5.edgeTwo = null;
		q5.labelTwo = 'n';
		q5.edgeThree = null;
		q5.labelThree = 'n';
		
		q6.edgeOne = q8;
		q6.labelOne = 'p';
		q6.edgeTwo = null;
		q6.labelTwo = 'n';
		q6.edgeThree = null;
		q6.labelThree = 'n';
		
		q7.edgeOne = q11;
		q7.labelOne = '_';
		q7.edgeTwo = q6;
		q7.labelTwo = '_';
		q7.edgeThree = null;
		q7.labelThree = 'n';
		
		q8.edgeOne = q7;
		q8.labelOne = '_';
		q8.edgeTwo = q0;
		q8.labelTwo = '_';
		q8.edgeThree = null;
		q8.labelThree = 'n';
		
		q9.edgeOne = q7;
		q9.labelOne = '_';
		q9.edgeTwo = q0;
		q9.labelTwo = '_';
		q9.edgeThree = null;
		q9.labelThree = 'n';
		
		q10.edgeOne = q9;
		q10.labelOne = 'a';
		q10.edgeTwo = null;
		q10.labelTwo = 'n';
		q10.edgeThree = null;
		q10.labelThree = 'n';
		
		q11.edgeOne = q10;
		q11.labelOne = 'b';
		q11.edgeTwo = null;
		q11.labelTwo = 'n';
		q11.edgeThree = null;
		q11.labelThree = 'n';
		
		acceptPanel = new JPanel();
		acceptPanel.setPreferredSize(new Dimension(200,40));
		acceptPanel.setBackground(Color.GREEN);
		acceptLabel = new JLabel("ACCEPT");
		acceptLabel.setFont(new Font("Courier New", Font.BOLD, 26));
		acceptPanel.add(acceptLabel);
		
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("src/drone.aiff")));
			clip.start();
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

	public void run() {
		// TODO Auto-generated method stub
		boolean flag1 = true;
		while(flag1){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			statePointer = q0;
			statePointer.flash();
			random = new Random();
			endStateCounter = random.nextInt(30);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(endStateCounter > 0){
				boolean flag2 = true;
				String temp = "";
				while(flag2){
					randNum = random.nextInt(3) + 1;
					if(randNum == 1){
						temp = String.valueOf(statePointer.labelOne);
						statePointer = statePointer.edgeOne;
						
						flag2 = false;
					}
					else if(randNum == 2){
						if(statePointer.edgeTwo != null){
							temp = String.valueOf(statePointer.labelTwo);
							statePointer = statePointer.edgeTwo;
							
							flag2 = false;
						}	
					}
					else if(randNum == 3){
						if(statePointer.edgeThree != null){
							temp = String.valueOf(statePointer.labelThree);
							statePointer = statePointer.edgeThree;
							
							flag2 = false;
						}
					}
				}
				if(!temp.equals("_")){
					ip.remove(stringPanel);
					stringPanel.remove(stringHolder);
					outputString = outputString + temp;
					System.out.println(outputString);
					stringHolder.setText(outputString);
					stringPanel.add(stringHolder);
					ip.add(stringPanel);
					revalidate();
					repaint();
				}
				statePointer.flash();
				if(statePointer.isEnd){
					endStateCounter--;
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			stringPanel.add(acceptPanel);
			revalidate();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ip.remove(stringPanel);
			stringPanel.remove(stringHolder);
			outputString = "";
			stringHolder.setText(outputString);
			stringPanel.add(stringHolder);
			ip.add(stringPanel);
			
			stringPanel.remove(acceptPanel);
			revalidate();
			repaint();
			
			
			//flag1 = false;
		}
	}

}

