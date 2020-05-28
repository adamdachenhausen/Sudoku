
/**
 * A single collection of SudokuTiles
 *
 * @author Adam Dachenhausen
 * @version 5/28/2020 v1.0
 */
public class SudokuHouse
{
    //The dimension of the board
    public static final int SIZE = 3;
    
    //The board itself
    private SudokuTile[][] board;
    
    public SudokuHouse(){
        board = new SudokuTile[SIZE][SIZE];
    }
}
