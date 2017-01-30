
package test3;

import javax.swing.*;
import java.awt.*;

/**
   The StartMenu class allows the user to select either
   a single or multiplayer game.
*/

public class StartMenu extends JPanel
{
   // The following constants are used to indicate
   // the cost of each type of bagel.

   private JRadioButton one;  // To select singleplayer
   private JRadioButton two;  // To select multiplayer
   private ButtonGroup bg;    // Radio button group

   /**
      Constructor
   */

   public StartMenu()
   {
      // Create a GridLayout manager with 
      // two rows and one column.
      setLayout(new GridLayout(2, 1));

      setPreferredSize(new Dimension(200, 100));
      
      // Create the radio buttons.
      one = new JRadioButton("1 player", true);
      two = new JRadioButton("2 players");

      // Group the radio buttons.
      bg = new ButtonGroup();
      bg.add(one);
      bg.add(two);

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Select game mode"));

      // Add the radio buttons to the panel.
      add(one);
      add(two);
   }

   // method to get the gamemode
   public boolean getGameMode()
   {
      boolean terminator; 
      if (two.isSelected())
         terminator = false;
      else
         terminator = true;

      return terminator;
   }
}
