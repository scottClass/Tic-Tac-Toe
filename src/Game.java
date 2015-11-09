
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamonta
 */
public class Game extends JComponent implements KeyListener{

    /**
     * @param args the command line arguments
     */
    
    boolean clear = false;
    
    public static void main(String[] args) {

        boolean done = false;
        

        GameBoard board = new GameBoard();
        
        board.setMessage("Press C to clear the board");
        
        while(!done) {
            Coordinate c = board.getClick();
            int row = c.getRow();
            int col = c.getCol();
            board.putPiece(row, col, Color.red);
            
            Coordinate a = board.getClick();
            int row2 = a.getRow();
            int col2 = a.getCol();
            board.putPiece(row2, col2, Color.blue);
            
            if(clear) {
                
            }
            
        }

    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int KeyCode = e.getKeyCode();
        if (KeyCode == KeyEvent.VK_UP) {
            clear = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int KeyCode = e.getKeyCode();
        if (KeyCode == KeyEvent.VK_RIGHT) {
            clear = false;
        } 

    }
}
