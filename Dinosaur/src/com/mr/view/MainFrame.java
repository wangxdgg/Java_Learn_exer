package com.mr.view;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import com.mr.service.ScoreRecorder;
import com.mr.service.Sound;

public class MainFrame extends JFrame {
	public MainFrame() {
		restart();
		setBounds(340, 150, 820, 260);
		setTitle("Running! Baby Dinosaur!");
		Sound.background();
		ScoreRecorder.init();
		addListener();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void restart() {
		Container c = getContentPane();
		c.removeAll();
		GamePanel panel = new GamePanel();
		c.add(panel);
		addKeyListener(panel);
		c.validate();
	}
	
	private void addListener() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				ScoreRecorder.saveScore();
			}
		});
	}

}
