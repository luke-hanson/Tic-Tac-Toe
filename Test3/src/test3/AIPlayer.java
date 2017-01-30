
package test3;

/**
 * Abstract superclass for all AI players with different strategies.
 * To construct an AI player:
 * 1. Construct an instance (of its subclass) with the game Board
 * 2. Call setSeed() to set the computer's seed
 * 3. Call move() which returns the next move in an int[2] array of {row, col}.
 *
 * The implementation subclasses need to override abstract method move().
 * They shall not modify Cell[][], i.e., no side effect expected.
 * Assume that next move is available, i.e., not game-over yet.
 */
public abstract class AIPlayer {
   protected int ROWS = 3;  // number of rows
   protected int COLS = 3;  // number of columns
   
   protected String[][] cells; // the board's ROWS-by-COLS array of Cells
   protected String mySeed;    // computer's seed
   protected String oppSeed;   // opponent's seed
 
   /** Constructor with reference to game board */
   public AIPlayer(String[][] board) {
      cells = board;
   }
 
   /** Set/change the seed used by computer and opponent */
   public void setSeed(String seed) {
      this.mySeed = seed;
      if (mySeed.equals("X"))
      {
          oppSeed = "O";
      }
      else
          oppSeed = "X";
        
   }
 
   /** Abstract method to get next move. Return int[2] of {row, col} */
   abstract int[] move();  // to be implemented by subclasses
}