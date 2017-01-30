/*This program uses a minimax AI from
https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaGame_TicTacToe_AI.html
*/
//Project created by LUKE HANSON
package test3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Test3 extends JFrame
{
   private StartMenu bagels;      // Start menu panel
   private JPanel buttonPanel;    // To hold the buttons
   private JButton calcButton;    // To calculate the cost
   private SinglePlayer game1;    // To start single player game
   private MultiPlayer game2;     // To start multiplayer game

   /**
      Constructor
   */

   public Test3()
   {
      // Display a title.
      setTitle("Tic-Tac-Toe");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager.
      setLayout(new BorderLayout());

      // Create the custom panels.
      bagels = new StartMenu();

      // Create the button panel.
      buildButtonPanel();

      // Add the components to the content pane.
      add(bagels, BorderLayout.WEST);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack the contents of the window and display it.
      pack();
      setVisible(true);
   }

   /**
      The buildButtonPanel method builds the button panel.
   */

   private void buildButtonPanel()
   {
      // Create a panel for the buttons.
      buttonPanel = new JPanel();

      // Create the buttons.
      calcButton = new JButton("Start");


      // Register the action listeners.
      calcButton.addActionListener(new Test3.CalcButtonListener());

      // Add the buttons to the button panel.
      buttonPanel.add(calcButton);
   }

   /**
      Private inner class that handles the event when
      the user clicks the Start button.
   */

   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         boolean terminator = bagels.getGameMode();
         
         if (terminator == true)
         {
             game1 = new SinglePlayer();
         }
         else
         {
             game2 = new MultiPlayer();
         }
      }
   }
   
   /**
      main method
   */
   
   public static void main(String[] args)
   {
      new Test3();
   }
}
