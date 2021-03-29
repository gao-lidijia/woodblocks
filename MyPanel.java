import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
	
	SingleBlock bob = new SingleBlock();
	/*ArrayList<Pieces> piece = new ArrayList<Pieces>();
	int xpos1 = 75;
	int xpos2 = 175;
	int xpos3 = 275;
	int ypos = 350;*/

	
	/*public MyPanel() {
		for(int i = 0; i<3; i++)
			piece.add(new Pieces());*/
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(new Color(201,233,246));
		bob.myDraw(g);
		
		//piece.get(0).myDraw(g, xpos1, ypos);
		
		
		
		//piece.get(1).myDraw(g, xpos2, ypos);
		//piece.get(2).myDraw(g, xpos3, ypos);
		
			
	
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
	}
	
	
}
