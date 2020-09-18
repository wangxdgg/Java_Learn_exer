package com.mr.modle;
/**
 * 
 * @author xiaodong
 * @since 
 */

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.mr.service.FreshThread;
import com.mr.service.Sound;

public class Dinosaur {
	public BufferedImage image;
	private BufferedImage image1, image2, image3;
	public int x, y;
	private int jumpValue = 0;
	private boolean jumpState = false;
	private int stepTimer = 0;
	private final int JUMP_HIGHT = 100;
	private final int LOWEST_Y = 120;
	private final int FREASH = FreshThread.FREASH;
	
	public Dinosaur() {
		x = 50;
		y = LOWEST_Y;
		try {
			image1 = ImageIO.read(new File("image/왜질1.png"));
			image2 = ImageIO.read(new File("image/왜질2.png"));
			image3 = ImageIO.read(new File("image/왜질3.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void move() {
		step();
		if (jumpState) {
			if (y >= LOWEST_Y) {
				jumpValue = -4;
			}
			if (y <= LOWEST_Y - JUMP_HIGHT) {
				jumpValue = 4;
			}
			y += jumpValue;
			if (y >= LOWEST_Y) {
				jumpState = false;
			}
		}
	}
	
	public void jump() {
		if (!jumpState) {
			Sound.jump();
		}
		jumpState = true;
	}
	
	public void step() {
		int tmp = stepTimer / 250 % 3;
		switch(tmp) {
		case 1:
			image = image1;
			break;
		case 2:
			image = image2;
			break;
		default:
			image = image3;
		}
		stepTimer += FREASH;
	}
	
	public Rectangle getFootBounds() {
		return new Rectangle(x + 30, y + 59, 29, 18);
	}
	
	public Rectangle getHeadBounds() {
		return new Rectangle(x + 66, y + 25, 32, 22);
	}
}
