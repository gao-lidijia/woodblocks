import java.awt.Graphics;

public class SingleBlock extends Block{
	public SingleBlock() {
		setXY(20, 20); // set bottom later
		bob = new int[2][2];
		bob[0][0] = 0;
		bob[0][1] = 0;
		bob[1][0] = 1; // all of these are POSITIVE
		bob[1][1] = 0;
		// ^ bob = { {0,0} }
	}
	
	public void myDraw(Graphics g) {
		int myX;
		int myY;
		// will work for all vertical and horizontal thingies
		for (int r = 0; r < bob.length; r++) {
			myY = getY() + bob[r][0]*30; // y = row, which is first so have the first value of the 2 parts
			myX = getX() + bob[r][1]*30; // x = column, which is second so have the second value of the 2 parts
			g.drawRect(myX, myY, 30, 30);
		}
	}

}
