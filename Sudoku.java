import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.Dimension;
/**
 * JFrame that represents the Sudoku, and allows the user to enter numbers
 *
 * @author Adam Dachenhausen
 * @version 5/26/2020 v1.0
 */
public class Sudoku extends MouseAdapter implements Runnable
{
    //Dimensions of un-resizable frame
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 500;
    public void run(){
        //Window Init
        JFrame frame = new JFrame("Sudoku");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        frame.setResizable(false);

        //Display window
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Sudoku());
    }
}
