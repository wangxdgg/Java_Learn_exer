package com.mr.modle;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.mr.view.BackgroundImage;

public class Obstacle {
	public int x, y;
	public BufferedImage image;
	private BufferedImage stone;
	private BufferedImage cacti;
	private int speed;
	
	public Obstacle() {
		try {
			stone = ImageIO.read(new File("image/ ØÕ∑.png"));
			cacti = ImageIO.read(new File("image/œ…»À’∆.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Random r = new Random();
		if (r.nextInt(2) == 0) {
			image = cacti;
		} else {
			image = stone;
		}
		x = 800;
		y = 200 - image.getHeight();
		speed = BackgroundImage.SPEED;
	}
	
	public void move() {
		x -= speed;
	}
	
	public boolean isLive() {
		if (x <= -image.getWidth()) {
			return false;
		}
		return true;
	}
	
	public Rectangle getBounds() {
		if (image == cacti) {
			return new Rectangle(x + 7, y, 15, image.getHeight());
		}
		return new Rectangle(x + 5, y + 4, 23, 21);
	}
	
	
}
