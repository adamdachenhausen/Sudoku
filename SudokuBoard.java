import java.util.List;
import java.util.ArrayList;
/**
 * A collection of SudokuHouses arranged in a standard Sudoku layout.
 * @see https://en.wikipedia.org/wiki/Sudoku
 *
 * @author Adam Dachenhausen
 * @version 5/26/2020 v1.0
 */
public class SudokuBoard
{
    //The dimension of the board
    public static final int SIZE = 3;

    //The board itself
    private SudokuHouse[][] board;

    public SudokuBoard(){
        board = new SudokuHouse[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                board[i][j] = new SudokuHouse();
            }
        }
    }

    /** Returns a List of the SudokuHouses countained in board,
     *  so that the user can easily iterate through them
     * 
     */
    public List getBoard(){
        List output = new ArrayList<SudokuHouse>();
        
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                output.add(board[i][j]);
            }
        }

        return output;
    }
}
