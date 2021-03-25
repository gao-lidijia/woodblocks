import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
  MyPanel mp;	
  Container c;
  
  public MyFrame(String title) {
	  super(title);
	  
	  mp= new MyPanel();
	  c= this.getContentPane();
	  c.setLayout(new BorderLayout());
	  c.add(mp, BorderLayout.CENTER);
	  
      this.setVisible(true);
      this.setSize(419,606);
  }
}
