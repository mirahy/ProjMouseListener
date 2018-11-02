

package projmouselistener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author IFMS
 */
public class ProjMouseListener extends JFrame implements MouseListener, MouseMotionListener{
    
    Label label1, label2;

    public ProjMouseListener() throws HeadlessException {
        
        addMouseListener(this);
        addMouseMotionListener(this);
        
        label1 = new Label();
        label1.setBounds(20,50,230,30);
        label1.setBackground(Color.gray);
        label1.setFont(new Font("Serif", Font.BOLD, 16));
        add(label1);
        
        label2 = new Label();
        label2.setBounds(20,100,230,30);
        label2.setBackground(Color.GREEN);
        label2.setFont(new Font("Serif", Font.BOLD, 16));
        add(label2);
        
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

   
    
    @Override
    public void mouseClicked(MouseEvent e) {
        label1.setText("Mouse Clicked  X = " + e.getX() + " ,Y = " + e.getY());
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label1.setText("Mouse Pressed  X = " + e.getX() + " ,Y = " + e.getY());
        Graphics g=getGraphics();  
        g.setColor(Color.RED);  
        g.fillOval(e.getX(),e.getY(),30,30); 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label1.setText("Mouse Released  X = " + e.getX() + " ,Y = " + e.getY());
        Graphics g=getGraphics();  
        g.setColor(Color.GREEN);  
        g.fillOval(e.getX(),e.getY(),30,30); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label1.setText("Mouse Entered  X = " + e.getX() + " ,Y = " + e.getY());
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label1.setText("Mouse Exited  X = " + e.getX() + " ,Y = " + e.getY());
    }
    

    
    public static void main(String[] args) {
        
        new ProjMouseListener();

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label2.setText("Mouse Dragged  X = " + e.getX() + " ,Y = " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label2.setText("Mouse Moved  X = " + e.getX() + " ,Y = " + e.getY());
    }

    
}