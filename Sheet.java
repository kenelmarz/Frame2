package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Sheet  extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		Font myFont=new Font("arial",Font.BOLD,26);
		g2.setFont(myFont);
		g2.setColor(Color.PINK);
		g2.drawString("Lorem Ipsum is simply dummy text of ...", 100, 100);
	}
	
}
