package calco;



import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OpPav extends JPanel{
	public OpPav(){
		GridLayout grid = new GridLayout(0, 1);
		grid.setVgap(5);
		this.setLayout(grid);
		
		this.add(new MyButton("C",Color.RED));
		this.add(new MyButton("+"));
		this.add(new MyButton("-"));
		this.add(new MyButton("x"));
		this.add(new MyButton("/"));
		
	}

}
