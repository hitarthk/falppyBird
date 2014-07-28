/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author kandarp
 */
public class Poles implements drawable{
    
    Rectangle2D rect1=new  Rectangle();
    Rectangle2D rect2=new Rectangle();
    Color color=Color.LIGHT_GRAY;
    
    Poles(double x,double y1,double y2)
    {
        rect1.setRect(x, y1, 50, y2-150);
        rect2.setRect(x, y2, 50, 2000);
        
        
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(color);
        g.fillRect((int)rect1.getX(),(int) rect1.getY(),(int)rect1.getWidth(), (int)rect1.getHeight());
        g.fillRect((int)rect2.getX(),(int)rect2.getY(),(int)rect2.getWidth(),(int)rect2.getHeight());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Rectangle2D getRect1() {
        return rect1;
    }

    public void setRect1(Rectangle2D rect1) {
        this.rect1 = rect1;
    }

    @Override
    public Rectangle2D getRect2() {
        return rect2;
    }

    public void setRect2(Rectangle2D rect2) {
        this.rect2 = rect2;
    }

    @Override
    public Rectangle2D getRect() {
        return rect2;
    }
    
    
}
