import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
                        int x = 55;
                        int y = 55;
                        int centerX = (getWidth()-x)/2;
                        int centerY = (getHeight()-y)/2;
                        //Paint the background
                        g.setColor(Color.CYAN);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width , height );
                        //g.setColor(Color.RED);
                        //g.drawRect(x1+10, y1 +10, width -20, height -20);
                        
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        //g.setColor(Color.PINK);
                        //g.drawLine(x2, y1, x1, y2);
                        
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval( centerX,centerY, x, y);
                        
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.fillPolygon(p);
            }
}