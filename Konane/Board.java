import java.util.*;
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    private int rows;
    private int columns;
    private String[][] boardArray;

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
      rows = 8;
      columns = 8;
      boardArray = new String[rows][columns];
      for(int i = 0; i <rows; i++)
      {
          for(int j = 0; j < columns; j++)
          {
              if((i+j)%2 ==0)
              {
                  boardArray[i][j]="B";
              }
              else
              {
                  boardArray[i][j]="W";
              }
              System.out.print(boardArray[i][j]);
          }
          System.out.println();
    }
  }
}
