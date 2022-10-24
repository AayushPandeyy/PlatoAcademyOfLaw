package com.example.Platoproject;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class mainFrame {
	public static JFrame frame;
	public mainFrame() {
		frame = new JFrame("Plato Academy of Law");
		Image icon = Toolkit.getDefaultToolkit().getImage("img/plato.png");    
		frame.setIconImage(icon);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setUndecorated(true);
		frame.setDefaultCloseOperation(3);
		frame.setLayout(new BorderLayout());
		topPanel tpanel = new topPanel();
		frame.add(tpanel,BorderLayout.NORTH);
		mainPanel mpanel = new mainPanel();
		frame.add(mpanel,BorderLayout.CENTER);
		footerPanel fpanel = new footerPanel();
		frame.add(fpanel,BorderLayout.SOUTH);
		frame.setVisible(true);
}
	
}
