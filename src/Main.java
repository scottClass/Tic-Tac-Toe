
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamonta
 */
public class Main {

    boolean clear = false;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean done = false;
        

        GameBoard board = new GameBoard();
        
        
        while(!done) {
            Coordinate c = board.getClick();
            int row = c.getRow();
            int col = c.getCol();
            board.putPiece(row, col, Color.red);
            
            Coordinate a = board.getClick();
            int row2 = a.getRow();
            int col2 = a.getCol();
            board.putPiece(row2, col2, Color.blue);
            
        }

    }
    
    
}
