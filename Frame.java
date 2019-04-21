package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame() {
		Toolkit screen= Toolkit.getDefaultToolkit();
		Dimension sizeScreen=screen.getScreenSize();
		int heigthtScreen=sizeScreen.height;
		int widthScreen=sizeScreen.width;
		setSize(widthScreen/2,heigthtScreen/2);
		setLocation(widthScreen/4,heigthtScreen/4);
		setTitle("Frame test 1");
		Image icon=screen.getImage("src/frames/icon.png");
		setIconImage(icon);
		
		Sheet mysheet=new Sheet();
		add(mysheet);
			
	}

}

