package com.example.Platoproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class topPanel extends JPanel{
	public topPanel() {
		setLayout(new GridLayout(0,1));
		setPreferredSize(new Dimension(1000,75));
		JLabel title = new JLabel("Plato Academy of Law",SwingConstants.CENTER);
		title.setFont(new Font("Algerian",1,32));
		title.setForeground(Color.red);
		setBackground(Color.black);
		
		add(title);
	}
}
