
/**
 * A single tile of the Sudoku Board
 *
 * @author Adam Dachenhausen
 * @version 5/26/2020 v1.0
 */
public class SudokuTile
{
    public static final SudokuTileValue DEFAULT = SudokuTileValue.X;
    protected SudokuTileValue value;
    public SudokuTile(SudokuTileValue v){
        this.value = v;
    }
}
