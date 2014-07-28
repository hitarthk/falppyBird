/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kandarp
 */
public class BirdController  implements Controller,Runnable{
    
//PolesController pole;
Enviornment enviorment;
Bird bird;
private final boolean isDownable=true;
private double v0=0;
private double velocityY=0;
private double time;
Thread t=new Thread(this);
    public BirdController(Enviornment enviornment, Bird bird) {
        this.enviorment=enviornment;
        this.bird = bird;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

  
    

    @Override
public void controll()
{
    
    
    //System.out.println("hihihi");
    //t.start();
       time=time+0.10;
    for(Controller c:enviorment.getControllers())
    {
        if(c.getDrawable()!=null)
        if(c.getDrawable().getRect().intersects(this.getBird().getRect()) || c.getDrawable().getRect2().intersects(this.getBird().getRect()) )
        {
            c.touched();
        }
        
    }
   velocityY=(v0+1*time);
    
    this.setLocation((int)bird.getRect().getX(),(int)(bird.getRect().getY()+velocityY));
   /*if(bird.getRect().getCenterY()>1000 || bird.getRect().getCenterY()<=-50)
    {
        Game.destroy();
         JOptionPane.showMessageDialog(null, "Game Over \n your Score is:"+MainWindow.score);
        System.exit(0);
    }*/
    
    
}

    @Override
    public void setLocation(int x, int y) {
        //throw new UnsupportedOperationException("Not supported yet.");
    
        Rectangle2D rect=new Rectangle();
        rect.setRect(x,y,bird.getRect().getWidth(),bird.getRect().getHeight());
        bird.setRect(rect);
        
        
    }
    public void jump()
    {
        
		this.v0=-4;
		this.time=0;
                this.controll();
    }

    @Override
    public drawable getDrawable() {
        return this.bird;
    }

    @Override
    public void touched() {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet.");
   while(true) 
   {
    
    
   
   try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
    
    
    
    }
}
