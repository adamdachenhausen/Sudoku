
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
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                board[i][j] = new SudokuTile(SudokuTile.DEFAULT);
            }
        }
    }
}
