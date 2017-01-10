package calco;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumPav extends JPanel{
	public NumPav(){
		GridLayout grid = new GridLayout(4, 3);
		grid.setHgap(5);
		grid.setVgap(5);
		this.setLayout(grid);
		for(int i = 0; i<9;i++)
		{
			this.add(new MyButton(""+(i+1)));
		}
		this.add(new MyButton("0"));
		this.add(new MyButton(","));
		this.add(new MyButton("="));
	}

}
