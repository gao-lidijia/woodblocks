import java.awt.Graphics;

public class StickBlock extends Block{
	public StickBlock() {
		setXY(20, 20); // set bottom later
		bob = new int[5][2];
		bob[0][0] = 0;
		bob[0][1] = 0;
    
    bob[1][0] = 1;
		bob[1][1] = 0;
    
    bob[2][0] = 2;
		bob[2][1] = 0;
    
    bob[3][0] = 3;
		bob[3][1] = 0;
    
    bob[4][0] = 4;
		bob[4][1] = 0;
		// ^ bob = { {0,0}, {1,0}, {2,0}, {3,0}, {4,0} }
	}

}
