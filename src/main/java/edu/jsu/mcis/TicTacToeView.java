package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeView extends JPanel implements ActionListener {
    
    TicTacToeModel model;

    private JButton[][] squares;
    private JPanel squaresPanel;
    private JLabel resultLabel;

    public TicTacToeView(TicTacToeModel model) {

        this.model = model;

        int width = model.getWidth();

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        squares = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width,width));
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");
        
        for (int row = 0; row < width; row++){
            
            for (int col = 0; col < width; col++){
                
                squares[row][col] = new JButton(); 
                squares[row][col].addActionListener(this);
                squares[row][col].setName("Square" + row + col);
                squares[row][col].setPreferredSize(new Dimension(64,64));
                squaresPanel.add(squares[row][col]);
                
            }
            
        }

        this.add(squaresPanel);
        this.add(resultLabel);
        
        resultLabel.setText("Welcome to Tic-Tac-Toe!");

    }
	
	
    @Override
    public void actionPerformed(ActionEvent event) {
        
        /* Handle button clicks.  Extract the row and col values from the name
           of the button that was clicked, then make the mark in the grid using
           the Model's "makeMark()" method.  Finally, use the "updateSquares()"
           method to refresh the View.  If the game is over, show the result
           (from the Model's "getResult()" method) in the result label. */
        
        String name = ((JButton) event.getSource()).getName(); // Get button name
        
        // INSERT YOUR CODE HERE
		int a;
		  JButton buttonClicked = (JButton)e.getSource();
            if(a%2 == 0)
                buttonClicked.setText("X");
            else
                buttonClicked.setText("O");
			
			panel.updateSquares();
            
            if(getResult() == true)
            {
                resultLabel.setText(null, "Game Over.");
                resetButtons();
            }
                
            a++;
            
        }

    }
        
    public void updateSquares() {

        /* Loop through all View buttons and (re)set the text of each button
           to reflect the grid contents (use the Model's "getMark()" method). */

    }
        
    public void showResult(String message) {
        resultLabel.setText(message);
    }

}
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		System.out.println("\n  ");
		for (int i = 0; i < model.getWidth(); i++) {
			System.out.print(i);
		}
		System.out.println("\n\n");
		for (int i = 0; i < model.getWidth(); i++) {
			System.out.println(i + " ");
        }
        
		System.out.println("\n\n");
        
}

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		
		if(xTurn == true){
                System.out.println("Player 1 (X) Move: ");
        }
        else{
                System.out.println("Player 2 (O) Move: ");
        }
		System.out.println("Enter the row and column numbers, separated by a space:	");
		grid [row][col] = keyboard.next.split(“ “);
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        System.out.println("Input is invalid");
              

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}