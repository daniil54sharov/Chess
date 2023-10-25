package Test;

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class TestClass extends MouseAdapter implements ActionListener, KeyListener{
	
	Image dog = new ImageIcon("src/dog.jpg").getImage();
	JLabel board[][];
	JLabel label;
	JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass tc = new TestClass();
		tc.go();
		int i = 1;
		int b = (i == 1) ? 2 : 1;
	}
	
	public void go() {
		frame = new JFrame("Image test");
		JPanel mainPanel = new JPanel();
		label = new JLabel("asd");
		label.addMouseListener(this);
//		board = new JLabel[8][8];
//		
//		for(int i = 0; i < 8; i++) {
//			for(int j = 0; j < 8; j++) {
//				board[i][j] = new JLabel(new ImageIcon("src/dog.jpg"));
//				mainPanel.add(board[i][j]);
//			}
//		}
		mainPanel.add(label);
		frame.setSize(550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		frame.add(mainPanel);
		frame.setVisible(true);
		
		
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseClicked(e);
		System.out.println("gay sex");
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
