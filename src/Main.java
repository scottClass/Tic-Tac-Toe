
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author scott
 */
public class Main {

    boolean clear = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean done = false;

        GameBoard board = new GameBoard();

        while (!done) {

            int countLoops = 0;
            
            boolean player1 = true;
            while (countLoops != 9) {
                if(player1) {
                    board.setMessage("It's player 1's turn");
                    Coordinate c = board.getClick();
                    int row = c.getRow();
                    int col = c.getCol();
                    board.putPiece(row, col, Color.red);
                    player1 = false;
                } else {
                    board.setMessage("It's player 2's turn");
                    Coordinate a = board.getClick();
                    int row2 = a.getRow();
                    int col2 = a.getCol();
                    board.putPiece(row2, col2, Color.blue);
                    player1 = true;
                }
                countLoops++;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                
            }
            board.clearBoard();
        }
    }

}
