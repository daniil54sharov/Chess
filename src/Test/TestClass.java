package Test;

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class TestClass implements ActionListener, KeyListener{
	
	Image dog = new ImageIcon("src/dog.jpg").getImage();
	JLabel board[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass tc = new TestClass();
		tc.go();
	}
	
	public void go() {
		JFrame frame = new JFrame("Image test");
		JPanel mainPanel = new JPanel(new GridLayout(9, 9));
		board = new JLabel[8][8];
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j] = new JLabel(new ImageIcon("src/dog.jpg"));
				mainPanel.add(board[i][j]);
			}
		}
		frame.setSize(550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		frame.add(mainPanel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
