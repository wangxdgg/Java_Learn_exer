package com.mingrisoft.login;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LoginPanel extends JPanel{
	public int width, height;
	private Image img;
	public LoginPanel() {
		super();
		URL url = getClass().getResource("/res/login.jpg");
		img = new ImageIcon(url).getImage();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this);
	}
}
