import java.util.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private ArrayList<Player> players;
    private Board board;
    private boolean gameOver;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        gameOver = false;
        players= new ArrayList<Player>();
        Player p1 = new Player();
        Player p2 = new Player();
        
        players.add(p1);
        players.add(p2);
        board = new Board();
        playGame();
    }
    
    public void playGame()
    {
        while(gameOver = false)
        {
           players.get(0).move();
           
           players.get(1).move();
        }
        
    }
    


}
