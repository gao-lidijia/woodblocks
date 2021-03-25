import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	SingleBlock bob = new SingleBlock();
	
	public MyPanel() {
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(new Color(201,233,246));
        
		g.drawRect(300, 300, 30, 30);
		
		bob.myDraw(g);
		
	}
}