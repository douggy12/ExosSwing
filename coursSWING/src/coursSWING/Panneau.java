package coursSWING;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Panneau extends JPanel {
	
	public Panneau(){
		
		//this.setPreferredSize(new Dimension(10, 10));
		//this.setSize(50, 50);
		//this.setLocation(0, 0);
		this.setBackground(Color.LIGHT_GRAY);
		this.setVisible(true);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton monBouton = new JButton();
		monBouton.setText("héHO HOhé!");
		
		this.add(monBouton);
		
		
		
		for (int i=0; i<5; i++){
			Checkbox check = new Checkbox("check mon " + i, false);
			this.add(check);
		}
		
		
		
		ButtonGroup bGroup = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("oui");
		JRadioButton radio2 = new JRadioButton("non");
		bGroup.add(radio1);
		bGroup.add(radio2);
		this.add(radio1);
		this.add(radio2);
		
		
		
		JLabel labelo = new JLabel("Hohé Hého labelO !",2);
		
		this.add(labelo);
		
		
	
		JTextField texto = new JTextField("Ecris un truc si tu l'oses !");
		texto.setPreferredSize(new Dimension(400,200));
		
		this.add(texto);
		
		
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Rouge");
		combo.addItem("Bleu");
		combo.addItem("Jaune");
		combo.addItem("Vert");
		combo.addItem("Rose");
		combo.addItem("Noir");
		combo.addItem("Gris");
		
		combo.setSelectedIndex(3);
		this.add(combo);
	}

}
