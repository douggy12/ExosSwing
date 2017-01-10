package exo1;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyButton extends JButton implements MouseListener{
	public MyButton(String text){
		super(text);
		addMouseListener(this);
		this.setBackground(Color.BLUE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.setBackground(Color.YELLOW);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.setBackground(Color.RED);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.setBackground(Color.BLUE);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.setText("Citron");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.setText("Préssé !");
		
	}

}
