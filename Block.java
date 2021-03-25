import java.awt.Graphics;

public abstract class Block {
	public int[][] bob;
	
	private int x;
	private int y;
	public abstract void myDraw(Graphics g);
	
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
}