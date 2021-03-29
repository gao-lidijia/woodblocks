import java.awt.Graphics;

public abstract class Block {
	public int[][] bob;
	
	private int x;
	private int y;

	
	public int numOfBlocks() {
		return bob.length;
	}
	
	public int[][] getArray() {
		return bob;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public void myDraw(Graphics g) {
		int myX;
		int myY;
		// will work for all vertical and horizontal thingies
		
		for (int r = 0; r < bob.length; r++) {
			myY = getY() + bob[r][0]*30; // y = row, which is first so have the first value of the 2 parts
			myX = getX() + bob[r][1]*30; // x = column, which is second so have the second value of the 2 parts
			g.drawRect(myX, myY, 30, 30);
			g.fillRect(myX, myY, 30, 30);
		}
	}
}
