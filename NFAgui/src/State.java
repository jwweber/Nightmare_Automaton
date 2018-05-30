import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;

import javax.sound.sampled.UnsupportedAudioFileException;

public class State extends JPanel implements Runnable{
	boolean isStart;
	boolean isEnd;
	State edgeOne;
	char  labelOne;
	State edgeTwo;
	char labelTwo;
	State edgeThree;
	char labelThree;
	File A1 = new File("src/A2.aiff");
	File As1 = new File("src/A2s.aiff");
	File B1 = new File("src/B2.aiff");
	File C1 = new File("src/C2.aiff");
	File Cs1 = new File("src/C2s.aiff");
	File D1 = new File("src/D2.aiff");
	File Ds1 = new File("src/D2s.aiff");
	File E1 = new File("src/E2.aiff");
	File F1 = new File("src/F2.aiff");
	File Fs1 = new File("src/F2s.aiff");
	File G1 = new File("src/G2.aiff");
	File Gs1 = new File("src/G2s.aiff");
	File A2 = new File("src/A4.aiff");
	File As2 = new File("src/A4s.aiff");
	File B2 = new File("src/B4.aiff");
	File C2 = new File("src/C4.aiff");
	File Cs2 = new File("src/C4s.aiff");
	File D2 = new File("src/D4.aiff");
	File Ds2 = new File("src/D4s.aiff");
	File E2 = new File("src/E4.aiff");
	File F2 = new File("src/F4.aiff");
	File Fs2 = new File("src/F4s.aiff");
	File G2 = new File("src/G4.aiff");
	File Gs2 = new File("src/G4s.aiff");
	
	String id;
	int idNum;
	public State(String id, int idNum){
		edgeOne = null;
		edgeTwo = null;
		this.id = id;
		this.idNum = idNum;
		isEnd = isStart = false;
		this.setPreferredSize(new Dimension(100,100));
		this.setBackground(new Color(116,110,119));
		JLabel l = new JLabel(id);
		l.setFont(new Font("Courier New", Font.BOLD, 26));
		this.add(l);
	}
	void flash(){
		run();
	}
	public void run() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int r = rand.nextInt(2);
		if(r == 0){
			switch(idNum){
			
			case 0:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(A1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 1:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(As1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 2:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(B1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 3:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(C1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 4:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Cs1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 5:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(D1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 6:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Ds1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 7:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(E1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 8:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(F1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 9:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Fs1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 10:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(G1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 11:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Gs1));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}
		}
		else if(r == 1){
			switch(idNum){
			
			case 0:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(A2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 1:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(As2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 2:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(B2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 3:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(C2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 4:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Cs2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 5:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(D2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 6:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Ds2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 7:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(E2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 8:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(F2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 9:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Fs2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 10:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(G2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 11:
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(Gs2));
					clip.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}	
			
			
		}
		
		
		this.setBackground(new Color(158,174,209));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setBackground(new Color(116,110,119));
	}
}
