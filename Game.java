/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author kandarp
 */
public class Game  extends JFrame implements KeyListener{
    
    MainWindow mainwindow;
    Enviornment enviorment;
   static Thread t;
    
    public static void destroy()
    {
        t.stop();
    }
    
    Game(Enviornment enviornment)
    {
        this.enviorment=enviornment;
        mainwindow=new MainWindow(enviorment);
        this.getContentPane().add(mainwindow);
       t= new Thread(new Running());
        t.start();
        this.setVisible(true);
        this.setSize(1000, 1000);
        this.addKeyListener(this);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        int k=e.getExtendedKeyCode();
        if(k==38)
        {
            enviorment.getBirdController().jump();
        }
    
    }
    
    
    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
        int k=e.getExtendedKeyCode();
        if(k==38)
        {
            
            
        }
        enviorment.getBirdController().jump();
        System.out.println("key");
    }
  private   class Running implements Runnable
  {

        @Override
        public void run() {
           // throw new UnsupportedOperationException("Not supported yet.");
        
            while(true)
            {mainwindow.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
        }
      
  }
    
}
