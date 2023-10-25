package mainPackage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;

public class Game {
	
	private JFrame frame;
	private JLabel board[][];
	private JPanel mainPanel;
	private ImageIcon[] black_figures;
	
	public static void main(String[] args) {
		Game chess = new Game();
		chess.createGui();
	}
	
	public void createGui() {
	    frame = new JFrame("Chess");
	    board = new JLabel[8][8];
	    mainPanel = new JPanel(new GridLayout(8, 8));
	    black_figures = new ImageIcon[8];
	    String icon_path = "src/img/icon.png";
	    ImageIcon icon = new ImageIcon (icon_path);

	    String[] black_figures_name = new String[] {"black_rock", "black_knight", "black_bishop", "black_king", "black_queen", "black_bishop", "black_knight", "black_rock"};
	    for(int black_figure_counter = 0; black_figure_counter < 8; black_figure_counter++) {
	    	black_figures[black_figure_counter] = new ImageIcon("src/img/" + black_figures_name[black_figure_counter] + ".png");
	    }
	    String[] white_figures_name = new String[] {"white_rock", "white_knight", "white_bishop", "white_king", "white_queen", "white_bishop", "white_knight", "white_rock"};
	    
	    for (int row = 0; row < 8; row++) {
	        for (int col = 0; col < 8; col++) {
	            board[row][col] = new JLabel();
	            board[row][col].setOpaque(true);
	            if ((row + col) % 2 == 0) {
	                board[row][col].setBackground(new Color(111, 78, 55));
	            } else {
	                board[row][col].setBackground(new Color(255,248,220));
	            }
	            mainPanel.add(board[row][col]);
	        }
	    }
	    
	    for(int black_row = 0; black_row < 2; black_row++) {
	    	for(int black_col = 0; black_col < 8; black_col++) {
	    		if(black_row == 0) {
//	    			board[black_row][black_col].setText(black_figures_name[black_col]);
	    			board[black_row][black_col].setIcon(black_figures[black_col]);
	    		} else {
	    			board[black_row][black_col].setText("black_pawn");
	    		}
	    	}
	    }
	    
	    for(int white_row = 6; white_row < 8; white_row++) {
	    	for(int white_col = 0; white_col < 8; white_col++) {
	    		if(white_row == 7) {
	    			board[white_row][white_col].setText(white_figures_name[white_col]);
	    		} else {
	    			board[white_row][white_col].setText("white_pawn");
	    		}
	    	}
	    }
	    
	    frame.add(mainPanel);
	    frame.setSize(800, 800);
	    frame.setIconImage(icon.getImage());
	    frame.setResizable(false);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
