package exo1;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class CitronPresse extends JFrame{
	public CitronPresse(){
		this.setSize(800, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.getContentPane().add(new MyButton("hein ?"));
		
	}

}
