package exo1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaFenetre extends JFrame implements MouseListener{
	public MaFenetre(){
		super("Une fenetre qui traite les clics souris");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		
		System.out.println("clic dans la fenetre au point de coordonnées " +x+", "+y);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("citron");
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("préssé !");
		
	}
	
}
