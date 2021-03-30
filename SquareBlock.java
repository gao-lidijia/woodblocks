import java.awt.Graphics;

public class SingleBlock extends Block{
	public SingleBlock() {
		setXY(20, 20); // set bottom later
		bob = new int[4][2];
		
		
		
		
		bob[0][0] = 0;
		bob[0][1] = 0;
		
		bob[1][0] = 0;
		bob[1][1] = 1;
    
		bob[2][0] = 1;
		bob[2][1] = 0;
    
		bob[3][0] = 1;
		bob[3][1] = 1;
    
 }
}
