
/**
 * A collection of SudukoTiles arranged in a standard Sudoku layout.
 * @see https://en.wikipedia.org/wiki/Sudoku
 *
 * @author Adam Dachenhausen
 * @version 5/26/2020 v1.0
 */
public class SudokuBoard
{
    //The dimension of the board
    public static final int SIZE = 9;
    
    //The board itself
    private SudokuTile[][] board;
    
    public SudokuBoard(){
        board = new SudokuTile[SIZE][SIZE];
    }
}
