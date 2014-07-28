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
public class Bird implements drawable{
    
    private Rectangle2D rect;
    //private int height;
    //private int width;
    private Color colr=Color.yellow ;
    
    
    Bird(double x,double y,double height,double width)
    {
        rect=new Rectangle();
        rect.setRect(x,y,height,width);
        //this.y=y;
        
        //this.height=height;
    }
    
   // @Override
    public void paint(Graphics g)
    {
        g.setColor(colr);
        
        g.fillRect((int)rect.getX(),(int)rect.getY() ,(int)rect.getWidth(),(int)rect.getHeight());
        
    }

    public Color getColr() {
        return colr;
    }

    public void setColr(Color colr) {
        this.colr = colr;
    }

//    @Override
    public Rectangle2D getRect() {
        return rect;
    }

    public void setRect(Rectangle2D rect) {
        this.rect = rect;
    }

//    @Override
    public Rectangle2D getRect2() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return this.rect;
    }

    
 
}
