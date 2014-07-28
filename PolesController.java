/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import javax.swing.JOptionPane;

/**
 *
 * @author kandarp
 */
public class PolesController implements Controller{
    
    private Poles poles;
    private Enviornment enviormrnt;
    public PolesController(Enviornment enviorment,Poles poles) {
        this.poles = poles;
        this.enviormrnt=enviorment;
    }
    
    
    
    
    @Override
    public void touched()
    {
       
     //   System.out.print("game over");
        
        Game.destroy();
         JOptionPane.showMessageDialog(null, "Game Over"+"\n"+"Your Score is:"+MainWindow.score);
        System.exit(0);
    }

  
    public Poles getPoles() {
        return poles;
    }

    public void setPoles(Poles poles) {
        this.poles = poles;
    }

    @Override
    public void controll() {
        //throw new UnsupportedOperationException("Not supported yet.");
        if(this.poles.getRect1().intersects(enviormrnt.getBirdController().getBird().getRect()) || this.poles.getRect1().intersects(enviormrnt.getBirdController().getBird().getRect()))
        {
            this.touched();
        }
    }

    @Override
    public void setLocation(int x, int y) {
        //throw new UnsupportedOperationException("Not supported yet.");
        
        poles.getRect1().setRect(x, poles.getRect1().getY(),poles.getRect1().getWidth() , poles.getRect1().getHeight());
        poles.getRect2().setRect(x, poles.getRect2().getY(),poles.getRect2().getWidth() , poles.getRect2().getHeight());
        
    
    
    }

    @Override
    public drawable getDrawable() {
        return this.poles;
    }
    
    

}
