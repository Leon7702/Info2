package Lab10;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;


public class Triangle extends JPanel {
	
	
    static Toolkit toolkit = Toolkit.getDefaultToolkit();
	static int screenWidth = toolkit.getScreenSize().width;
    static int screenHeight = toolkit.getScreenSize().height;
    static int tHeight;
    static int tWidth;
    static int xPos;
    static int yPos;
    int leftMidX;
    int rightMidX;
    int baseMidX;
    
    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
    	tHeight = screenHeight;
    	tWidth = (int) (2 * tHeight / Math.sqrt(3));
    	xPos = screenWidth / 2;
    	yPos = 0;	
    	
    	x1 = xPos;
    	y1 = yPos;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] x = {xPos, xPos + (tWidth / 2), xPos - (tWidth / 2)};
        int[] y = {yPos, yPos + tHeight, yPos + tHeight};
        g.drawPolygon(x, y, 3);
    }
    
    public void smallerTri(Triangle tri) {
    	leftMidX = (xPos + (xPos - (tWidth / 2))) / 2;
    	rightMidX = (yPos + yPos + tHeight) / 2;
    	baseMidX = (xPos + (tWidth / 2) + xPos - (tWidth / 2)) / 2;
    	
    	xPos = 
    }
    
    

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("TRIANGLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(screenWidth, screenHeight);

        Triangle panel = new Triangle(xPos, xPos + (tWidth / 2), xPos - (tWidth / 2),yPos, yPos + tHeight, yPos + tHeight);
        frame.add(panel);
        frame.setVisible(true);
    }

}

