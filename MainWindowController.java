/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kandarp
 */
public class MainWindowController implements Controller,Runnable {
    
    private int velocity=-1;
    private Enviornment _enviornment;
    Thread t=new Thread(this);
    private double time=0;
    public MainWindowController(Enviornment e)
    {
        _enviornment = e;
    }

    
   
    
    @Override
    public void controll() {
        //throw new UnsupportedOperationException("Not supported yet.");
    
      // System.out.println("controll");
      //t.start(); 
//        _enviornment.getBirdController().setLocation((int)_enviornment.getBirdController().getBird().getRect().getX()+velocity,(int)_enviornment.getBirdController().getBird().getRect().getY());
        // velocity=velocity-(int)(time*0.01);      
        //time=time+0.10;
      
         for(Controller poles:_enviornment.getControllers())
        {
            
            
            if(poles.getDrawable()!=null)
            poles.setLocation((int)poles.getDrawable().getRect().getX()+velocity, velocity);
            
          
        }
      
      
    }

    @Override
    public void setLocation(int x, int y) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public drawable getDrawable() {
        return null;
    }

    @Override
    public void touched() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet.");
       while(true)
       {
       
       
       try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       }
       }
    
    

}
