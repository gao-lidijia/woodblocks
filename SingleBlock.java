import java.awt.Graphics;

public class SingleBlock extends Block{
	public SingleBlock() {
		setXY(20, 20); // set bottom later
		bob = new int[1][2];
		bob[0][0] = 0;
		bob[0][1] = 0;
		// ^ bob = { {0,0} }
	}

}
