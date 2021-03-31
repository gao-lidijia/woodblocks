import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
	
	SingleBlock bob = new SingleBlock();
	public int[][] grid;
	
	}

	public myPanel() {
		
		grid = new int[9][9];
		for(int i = 0; i<9; i++)
			for(int j = 0; j<9; j++)
				grid[i][j]=1;
		for(int i = 1; i<8; i++)
			for(int j = 1; j<8; j++)
				grid[i][j]=1;
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(new Color(201,233,246));
		
		for(int i = 0; i<7; i++)
			for(int j = 0; j<7; j++)
				g.drawRect(i*30+100, j*30+50, 30, 30);
		bob.myDraw(g);
		
		
		
			
	
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
	}
	
	
}
