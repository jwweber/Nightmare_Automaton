import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class ImagePanel extends JPanel{ 
	
    BufferedImage img;
    public void paintComponent(Graphics g){
    	this.setBackground(new Color(119,85,140));
        super.paintComponent(g);
        try {
			img   = ImageIO.read(new File("src/nfaimgjpg.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if(img != null){
            g.drawImage(img, 0, 0, this);
        }
    }
}