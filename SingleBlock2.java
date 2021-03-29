
import java.awt.Color;
import java.awt.Graphics;

public class SingleBlock extends Block{
	public SingleBlock() {
		setXY(20, 20); // set bottom later
		
		bob = new int[9][9];
		for(int i = 0; i<9; i++)
			for(int j = 0; j<9; j++)
				bob[i][j]=1;
		for(int i = 1; i<8; i++)
			for(int j = 1; j<8; j++)
				bob[i][j]=1;
		
	}
	
	public void myDraw(Graphics g) {
		
		for(int i = 0; i<7; i++)
			for(int j = 0; j<7; j++)
				g.drawRect(i*30+100, j*30+50, 30, 30);
				
	}

}
