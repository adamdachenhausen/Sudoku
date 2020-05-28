import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
/**
 * JFrame that represents the Sudoku, and allows the user to enter numbers
 *
 * @author Adam Dachenhausen
 * @version 5/26/2020 v1.0
 */
public class Sudoku extends MouseAdapter implements Runnable
{
    //Dimensions of un-resizable frame
    public static final int FRAME_WIDTH = 900;
    public static final int FRAME_HEIGHT = 900;

    //The two bold lines of the board that are parallel to the Y Axis
    public static final Point lineY1Start = new Point(FRAME_WIDTH/3,0);
    public static final Point lineY1End = new Point(FRAME_WIDTH/3,FRAME_HEIGHT);

    public static final Point lineY2Start = new Point((2*FRAME_WIDTH)/3,0);
    public static final Point lineY2End = new Point((2*FRAME_WIDTH)/3,FRAME_HEIGHT);

    //The two bold lines of the board that are parallel to the X Axis
    public static final Point lineX1Start = new Point(0,FRAME_HEIGHT/3);
    public static final Point lineX1End = new Point(FRAME_WIDTH,FRAME_HEIGHT/3);

    public static final Point lineX2Start = new Point(0,(2*FRAME_HEIGHT)/3);
    public static final Point lineX2End = new Point(FRAME_WIDTH,(2*FRAME_HEIGHT)/3);

    private JPanel panel;
    public void run(){
        //Window Init
        JFrame frame = new JFrame("Sudoku");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        frame.setResizable(false);

        panel = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                g.setColor(Color.BLACK);

                 
                
                //Draw the big pound symbol
                g.drawLine(lineY1Start.x-1,lineY1Start.y,lineY1End.x-1,lineY1End.y);
                g.drawLine(lineY1Start.x,lineY1Start.y,lineY1End.x,lineY1End.y);
                g.drawLine(lineY1Start.x+1,lineY1Start.y,lineY1End.x+1,lineY1End.y);

                g.drawLine(lineY2Start.x-1,lineY2Start.y,lineY2End.x-1,lineY2End.y);
                g.drawLine(lineY2Start.x,lineY2Start.y,lineY2End.x,lineY2End.y);
                g.drawLine(lineY2Start.x+1,lineY2Start.y,lineY2End.x+1,lineY2End.y);

                g.drawLine(lineX1Start.x,lineX1Start.y-1,lineX1End.x,lineX1End.y-1);
                g.drawLine(lineX1Start.x,lineX1Start.y,lineX1End.x,lineX1End.y);
                g.drawLine(lineX1Start.x,lineX1Start.y+1,lineX1End.x,lineX1End.y+1);

                g.drawLine(lineX2Start.x,lineX2Start.y-1,lineX2End.x,lineX2End.y-1);
                g.drawLine(lineX2Start.x,lineX2Start.y,lineX2End.x,lineX2End.y);
                g.drawLine(lineX2Start.x,lineX2Start.y+1,lineX2End.x,lineX2End.y+1);
            }
        };

        frame.add(panel);

        //Display window
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Sudoku());
    }
}
