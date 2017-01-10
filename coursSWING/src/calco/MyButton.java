package calco;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class MyButton extends JButton{
	public MyButton(String text){
		super(text);
		this.init();
	}
	public MyButton(String text, Color couleur){
		super(text);
		this.init();
		this.setForeground(couleur);
	}
	public void init(){
		this.setBackground(Color.WHITE);
		Font bFont = new Font("Arial", Font.PLAIN, 36);
		this.setFont(bFont);
		//this.setBorderPainted(false);
	}

}
