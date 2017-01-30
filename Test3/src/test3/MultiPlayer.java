
package test3;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class
import java.awt.event.ActionEvent; // Needed for button listeners
import java.awt.event.ActionListener;

/**
   This class implements Multiplayer mode.
*/

public class MultiPlayer extends JFrame
{
   private final int WINDOW_WIDTH = 180;   // Window width
   private final int WINDOW_HEIGHT = 180;  // Window height
   int row, col;
   String plr = "";
   String[][] board = {{" "," "," "},
                       {" "," "," "},
                       {" "," "," "}};
   
   JButton button1;
   JButton button2;
   JButton button3;
   JButton button4;
   JButton button5;
   JButton button6;
   JButton button7;
   JButton button8;
   JButton button9;

   /**
      Constructor
   */

   public MultiPlayer()
   {
       

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      // Add a GridLayout manager to the content pane.
      setLayout(new GridLayout(3, 3));
      
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      JPanel panel4 = new JPanel();
      JPanel panel5 = new JPanel();
      JPanel panel6 = new JPanel();
      JPanel panel7 = new JPanel();
      JPanel panel8 = new JPanel();
      JPanel panel9 = new JPanel();
      
      // Create nine buttons.
      button1 = new JButton(board[0][0]);
      button2 = new JButton(board[0][1]);
      button3 = new JButton(board[0][2]);
      button4 = new JButton(board[1][0]);
      button5 = new JButton(board[1][1]);
      button6 = new JButton(board[1][2]);
      button7 = new JButton(board[2][0]);
      button8 = new JButton(board[2][1]);
      button9 = new JButton(board[2][2]);

      panel1.add(button1);
      panel2.add(button2);
      panel3.add(button3);
      panel4.add(button4);
      panel5.add(button5);
      panel6.add(button6);
      panel7.add(button7);
      panel8.add(button8);
      panel9.add(button9);
      // Add the nine buttons to the content pane.
      add(panel1);  // Goes into row 1, column 1
      add(panel2);  // Goes into row 1, column 2
      add(panel3);  // Goes into row 1, column 3
      add(panel4);  // Goes into row 2, column 1
      add(panel5);  // Goes into row 2, column 2
      add(panel6);  // Goes into row 2, column 3
      add(panel7);  // Goes into row 3, column 1
      add(panel8);  // Goes into row 3, column 2
      add(panel9);  // Goes into row 3, column 3
      
      button1.addActionListener(new MultiPlayer.button1Listener());
      button2.addActionListener(new MultiPlayer.button2Listener());
      button3.addActionListener(new MultiPlayer.button3Listener());
      button4.addActionListener(new MultiPlayer.button4Listener());
      button5.addActionListener(new MultiPlayer.button5Listener());
      button6.addActionListener(new MultiPlayer.button6Listener());
      button7.addActionListener(new MultiPlayer.button7Listener());
      button8.addActionListener(new MultiPlayer.button8Listener());
      button9.addActionListener(new MultiPlayer.button9Listener());
      
      // Display the window.
      setVisible(true);
      
   }
   
   // each of these listeners corresponds to the equivalent button
   private class button1Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 0;
          col = 0;
          turn(button1);
      }
   }
   private class button2Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 0;
          col = 1;
          turn(button2);
      }
   }
   private class button3Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 0;
          col = 2;
          turn(button3);
      }
   }
   private class button4Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 1;
          col = 0;
          turn(button4);
      }
   }
   private class button5Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 1;
          col = 1;
          turn(button5);
      }
   }
   private class button6Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 1;
          col = 2;
          turn(button6);
      }
   }
   private class button7Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 2;
          col = 0;
          turn(button7);
      }
   }
   private class button8Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 2;
          col = 1;
          turn(button8);
      }
   }
   private class button9Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          row = 2;
          col = 2;
          turn(button9);
      }
   }
   
   // plays out each turn when a button is pressed
   public void turn(JButton button)
   {
       if(board[row][col].equals(" "))
            {
                if (plr.equals("X"))
                    plr = "O";
                else plr = "X";
                board[row][col] = plr;
                button.setText(plr);
                if (win())
                {
                    JOptionPane.showMessageDialog(null,"Player "+plr+" wins!");
                    setVisible(false);
                    dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"There is already something there.");
            }
   }
   public boolean win()
    {
        //horizontal checks
        if(board[0][0].equals(plr) && board[0][1].equals(plr) 
                && board[0][2].equals(plr))
        {
            return true;
        }
        else if(board[1][0].equals(plr) && board[1][1].equals(plr) 
                && board[1][2].equals(plr))
        {
            return true;
        }
        else if(board[2][0].equals(plr) && board[2][1].equals(plr) 
                && board[2][2].equals(plr))
        {
            return true;
        }
        //vertical checks
        else if(board[0][0].equals(plr) && board[1][0].equals(plr) 
                && board[2][0].equals(plr))
        {
            return true;
        }
        else if(board[0][1].equals(plr) && board[1][1].equals(plr) 
                && board[2][1].equals(plr))
        {
            return true;
        }
        else if(board[0][2].equals(plr) && board[1][2].equals(plr) 
                && board[2][2].equals(plr))
        {
            return true;
        }
        //diagonal checks
        else if(board[0][0].equals(plr) && board[1][1].equals(plr) 
                && board[2][2].equals(plr))
        {
            return true;
        }
        else if(board[2][0].equals(plr) && board[1][1].equals(plr) 
                && board[0][2].equals(plr))
        {
            return true;
        }
        else if(board[0][0].equals(" ") || board[0][1].equals(" ") ||
                board[0][2].equals(" ") || board[1][0].equals(" ") ||
                board[1][1].equals(" ") || board[1][2].equals(" ") ||
                board[2][0].equals(" ") || board[2][1].equals(" ") ||
                board[2][2].equals(" "))
        {
            return false;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "It's a tie!");
            setVisible(false);
            dispose();
            return false;
        }
    }
}