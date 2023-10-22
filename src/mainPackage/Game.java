package mainPackage;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
	
	JFrame frame;
	JLabel board[][];
	JPanel mainPanel;
	
	public static void main(String[] args) {
		Game chess = new Game();
		chess.go();
	}
	
	public void go() {
	    frame = new JFrame("Chess");
	    board = new JLabel[8][8];
	    mainPanel = new JPanel(new GridLayout(8, 8));
	    
	    for (int i = 0; i < 8; i++) {
	        for (int j = 0; j < 8; j++) {
	            board[i][j] = new JLabel();
	            board[i][j].setOpaque(true);
	            if ((i + j) % 2 == 0) {
	                board[i][j].setBackground(new Color(111, 78, 55));
	            } else {
	                board[i][j].setBackground(new Color(255,248,220));
	            }
	            mainPanel.add(board[i][j]);
	        }
	    }
	    
	    frame.add(mainPanel);
	    frame.setSize(800, 800);
	    frame.setResizable(false);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
