package exo1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	
	public Fenetre(){
		this.setTitle("Border Layout");
		this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JPanel panel = new JPanel();
		
		this.setContentPane(panel);
		panel.setLayout(new GridLayout(0, 2));
		
		JPanel panel1 = new JPanel();
		panel.add(panel1);
		
		panel1.setLayout(new BorderLayout());
		JButton bouton1 = new JButton("bouton 1");
		panel1.add(bouton1, BorderLayout.NORTH);
		bouton1.setPreferredSize(new Dimension(10, this.getHeight()/6));
		panel1.add(new JButton("bouton 2"), BorderLayout.SOUTH);
		panel1.add(new JButton("bouton 3"), BorderLayout.EAST);
		panel1.add(new JButton("bouton 4"), BorderLayout.WEST);
		panel1.add(new JButton("bouton 5"), BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		panel.add(panel2);
		CardLayout cl = new CardLayout();
		panel2.setLayout(cl);
		
		JPanel pancol1 = new JPanel();
		pancol1.setBackground(Color.GRAY);
		panel2.add(pancol1, "blue");
		JPanel pancol2 = new JPanel();
		pancol2.setBackground(Color.RED);
		panel2.add(pancol2, "red");
		JPanel pancol3 = new JPanel();
		pancol3.setBackground(Color.CYAN);
		panel2.add(pancol3, "cyan");
		cl.next(panel2);
		
		JPanel panel3 = new JPanel();
		panel.add(panel3);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.setBackground(Color.ORANGE);
		
		for (int i =0;i<6;i++)
		{
			panel3.add(new JCheckBox(("checkbox "+i),false));
		}
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridBagLayout());
		
		panel4.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc = new GridBagConstraints();
		
		JPanel case1 = new JPanel();
		case1.setBackground(Color.BLUE);
		case1.setPreferredSize(new Dimension(50, 50));
		JLabel case2 = new JLabel("case 2");
		case2.setPreferredSize(new Dimension(50, 50));
		case2.setBackground(Color.BLACK);
		case2.setOpaque(true);
		JLabel case3 = new JLabel("case 3");
		case3.setOpaque(true);
		case3.setBackground(Color.GRAY);
		case3.setPreferredSize(new Dimension(50, 50));
		JLabel case4 = new JLabel("case 4");
		
		case4.setBackground(Color.WHITE);
		JLabel case5 = new JLabel("case 5");
		
		case5.setBackground(Color.ORANGE);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridwidth = 4;
		gbc.fill = GridBagConstraints.VERTICAL;
		
		
		panel4.add(case1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight =1;
		gbc.gridwidth = 3;
		panel4.add(case2,gbc);
		
		gbc.gridx=4;
		gbc.gridwidth= 1;
		panel4.add(case3,gbc);
		 
		panel.add(panel4);
	}

}
