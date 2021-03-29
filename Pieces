

import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Pieces implements ActionListener, MouseListener, MouseMotionListener {
	
	public int num;
	public int idnum;
	public static int id = 0;
	
	ImageIcon img1;
	Image scaleImage1;
	ImageIcon img2;
	Image scaleImage2;
	ImageIcon img3;
	Image scaleImage3;
	ImageIcon img4;
	Image scaleImage4;
	ImageIcon img5;
	Image scaleImage5;
	ImageIcon img6;
	Image scaleImage6;
	public Pieces() {
		
		id++;
		idnum = id;
		num = (int)(Math.random()*6);
		img1 = new ImageIcon("one.png");
		scaleImage1 = img1.getImage().getScaledInstance(185, 185, Image.SCALE_DEFAULT);
		img2 = new ImageIcon("two.png");
		scaleImage2 = img2.getImage().getScaledInstance(185, 185, Image.SCALE_DEFAULT);
		img3 = new ImageIcon("three.png");
		scaleImage3 = img3.getImage().getScaledInstance(185, 185, Image.SCALE_DEFAULT);
		img4 = new ImageIcon("four.png");
		scaleImage4 = img4.getImage().getScaledInstance(185, 185, Image.SCALE_DEFAULT);
		img5 = new ImageIcon("five.png");
		scaleImage5 = img5.getImage().getScaledInstance(185, 185, Image.SCALE_DEFAULT);
		img6 = new ImageIcon("six.png");
		scaleImage6 = img6.getImage().getScaledInstance(185, 185, Image.SCALE_DEFAULT);
		
		
		
	}
	
	public void myDraw(Graphics g, int x, int y) {
		if(num==0) {
			g.drawImage(scaleImage1, x, y, null);
		}
		if(num==1) {
			g.drawImage(scaleImage2, x, y, null);
		}
		if(num==2) {
			g.drawImage(scaleImage3, x, y, null);
		}
		if(num==3) {
			g.drawImage(scaleImage4, x, y, null);
		}
		if(num==4) {
			g.drawImage(scaleImage5, x, y, null);
		}
		if(num==5) {
			g.drawImage(scaleImage6, x, y, null);
		}
		
	}
	

	public void actionPerformed(ActionEvent e) {}

	
	public void mouseDragged(MouseEvent e) {}

	
	public void mouseMoved(MouseEvent e) {}

	
	public void mouseClicked(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	
	public void mouseReleased(MouseEvent e) {}

	
	public void mouseEntered(MouseEvent e) {}

	
	public void mouseExited(MouseEvent e) {}

}
