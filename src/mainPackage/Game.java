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
	private ImageIcon[] white_figures;
	
	public static void main(String[] args) {
		Game chess = new Game();
		chess.createGui();
	}
	
	public void createGui() {
	    frame = new JFrame("Chess");
	    board = new JLabel[8][8];
	    mainPanel = new JPanel(new GridLayout(8, 8));
	    black_figures = new ImageIcon[9];
	    white_figures = new ImageIcon[9];
	    String icon_path = "src/img/icon.png";
	    ImageIcon icon = new ImageIcon (icon_path);

	    String[] black_figures_name = new String[] {"black_rock", "black_knight", 
	    		"black_bishop", "black_queen", "black_king", "black_bishop", 
	    		"black_knight", "black_rock", "black_pawn"};
	    for(int black_figure_counter = 0; black_figure_counter < black_figures.length; black_figure_counter++) {
	    	black_figures[black_figure_counter] = new ImageIcon("src/img/" + black_figures_name[black_figure_counter] + ".png");
	    }
	    
	    String[] white_figures_name = new String[] {"white_rock", "white_knight", 
	    		"white_bishop", "white_queen", "white_king", "white_bishop", 
	    		"white_knight", "white_rock", "white_pawn"};
	    for(int white_figures_counter = 0; white_figures_counter < white_figures.length; white_figures_counter++) {
	    	white_figures[white_figures_counter] = new ImageIcon("src/img/" + white_figures_name[white_figures_counter] + ".png");
	    }
	    
	    for (int row = 0; row < 8; row++) {
	        for (int col = 0; col < 8; col++) {
	        	
	            board[row][col] = new JLabel();
	            board[row][col].setOpaque(true);
	            board[row][col].setBackground((row + col) % 2 == 0 ? new Color(111, 78, 55) : new Color(255,248,220));
	            board[row][col].addMouseListener(new BoardListener());
	            
	            if(row == 0) {
	    			board[row][col].setIcon(black_figures[col]);
	    		} else if(row == 1){
	    			board[row][col].setIcon(black_figures[8]);
	    		} else if(row == 7) {
	    			board[row][col].setIcon(white_figures[col]);
	    		} else if(row == 6) {
	    			board[row][col].setIcon(white_figures[8]);
	    		}
	            mainPanel.add(board[row][col]);
	        }
	    }
	    
	    frame.add(mainPanel);
	    frame.setSize(800, 800);
	    frame.setIconImage(icon.getImage());
	    frame.setResizable(false);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
	class BoardListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			System.out.println("clicked");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			System.out.println("pressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseReleased(e);
			System.out.println("released");
		}
	}
}
