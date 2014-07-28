/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author kandarp
 */
public interface drawable {
    
    public void paint(Graphics g);
    public Rectangle2D getRect();
    public Rectangle2D getRect2();        
            
}
