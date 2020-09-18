package com.mr.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.mr.service.ScoreRecorder;

public class ScoreDialog extends JDialog{
	public ScoreDialog(JFrame frame) {
		super(frame, true);
		int scores[] = ScoreRecorder.getScores();
		JPanel scoreP = new JPanel(new GridLayout(4, 1));
		scoreP.setBackground(Color.WHITE);
		JLabel title = new JLabel("Rank", JLabel.CENTER);
		title.setFont(new Font("ºÚÌå", Font.BOLD, 20));
		title.setForeground(Color.RED);
		
		JLabel first = new JLabel("First: " + scores[2], JLabel.CENTER);
		JLabel second = new JLabel("Second: " + scores[1], JLabel.CENTER);
		JLabel third = new JLabel("Third: " + scores[0], JLabel.CENTER);
		
		JButton restart = new JButton("Restart");
		restart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		scoreP.add(title);
		scoreP.add(first);
		scoreP.add(second);
		scoreP.add(third);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(scoreP, BorderLayout.CENTER);
		c.add(restart, BorderLayout.SOUTH);
		
		setTitle("Game Over");
		int width, height;
		width = height = 200;
		
		int x = frame.getX() + (frame.getWidth() - width) / 2;
		int y = frame.getY() + (frame.getHeight() - height) / 2;
		setBounds(x, y, width, height);
		setVisible(true);
	}

}
