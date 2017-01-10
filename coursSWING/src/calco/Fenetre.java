package calco;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Fenetre extends JFrame{
	
	private JLabel ecran = new JLabel("0");
	
	public Fenetre(){
		this.setTitle("Ma Calculette");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setBackground(Color.WHITE);
		BorderLayout bLay = new BorderLayout();
		bLay.setHgap(5);
		bLay.setVgap(5);
		JPanel panP = new JPanel();
		panP.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		this.setContentPane(panP);
		
		this.getContentPane().setLayout(bLay);
		
		ecran.setOpaque(true);
		ecran.setBackground(Color.GRAY);
		ecran.setForeground(Color.WHITE);
		ecran.setHorizontalAlignment(JLabel.RIGHT);
		ecran.setPreferredSize(new Dimension(10, this.getHeight()/5));
		ecran.setFont(new Font("Arial", Font.BOLD, 36));
		ecran.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
		
		this.getContentPane().add(ecran, BorderLayout.NORTH);
		this.getContentPane().add(new NumPav(), BorderLayout.CENTER);
		OpPav opPav = new OpPav();
		opPav.setPreferredSize(new Dimension(this.getWidth()/6, 10));
		this.getContentPane().add(opPav, BorderLayout.EAST);
		
		
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
		ecran.setPreferredSize(new Dimension(10, this.getHeight()/5));
	}
	

	
	

}
