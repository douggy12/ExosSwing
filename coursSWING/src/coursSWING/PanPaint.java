package coursSWING;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanPaint extends JPanel{
	
	public void paintComponent(Graphics g){
		int marg = Math.min(this.getHeight(), this.getWidth());
		int larg = marg/2-marg/10;
		
		 
		//g.drawPolygon((this.getWidth()/4-50), (this.getHeight()/2+50), (this.getWidth()/4+50),(this.getHeight()/2+50),this.getWidth()/4,this.getHeight()/2+170);
		g.setColor(Color.GREEN);
		g.drawPolygon(new int[]{(this.getWidth()/4-larg/2),(this.getWidth()/4+larg/2),this.getWidth()/4}, new int[]{(this.getHeight()/4+larg/2),(this.getHeight()/4+larg/2),this.getHeight()/4-larg/2},3);
		g.setColor(Color.BLUE);
		g.drawRect(this.getWidth()/4*3-larg/2, this.getHeight()/4-larg/2, larg, larg);
		g.setColor(Color.YELLOW);
		g.fillOval(this.getWidth()/4-larg/2, this.getHeight()/4*3-larg/2, larg, larg);
		
			 
			try {
				Image img = ImageIO.read(new File("logo.png"));
				
				int scale = img.getWidth(this)/img.getHeight(this);
				
				g.drawImage(img, this.getWidth()/4*3-larg/2, this.getHeight()/4*3-larg/scale/2, larg, larg/scale,  this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
}
