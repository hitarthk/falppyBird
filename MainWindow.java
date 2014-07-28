/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kandarp
 */
public class MainWindow extends JPanel {
    
BirdController birdcontroller;
//ArrayList<Poles>poles;

//ArrayList<Controller>controllers;
Enviornment enviornment;
static Integer score=0;
Thread t=new Thread(new ScoreCard());
Random rand = new Random();
class ScoreCard implements Runnable{

        @Override
        public void run() {
            //throw new UnsupportedOperationException("Not supported yet.");
           while(true)
           { int scor=0; 
           double x= enviornment.getBirdController().getBird().getRect().getX();
           for(Controller c:enviornment.getControllers())
           {
               if(c.getDrawable()!=null)
               {
                   if(c.getDrawable().getRect().getX()+c.getDrawable().getRect().getWidth()<x)
                   {
                       scor++;
                   }
               }
           }
           score=scor;
                if(score ==130)
                {
                    Game.destroy();
                    JOptionPane.showMessageDialog(null,"you win the game! \n Your score is:"+score);
                    System.exit(0);
                    
                }
           
           }
          // System.out.println(score+" "+scor);
         
        }
           
    
}
    MainWindow(Enviornment enviorment)
    {
        birdcontroller=enviorment.getBirdController();
        this.enviornment=enviorment;
        
        t.start();
        
        //b=new Bird(30,100,30,30);
        //poles=new ArrayList<Poles>();
       // this.generatePoles();
       
    }
    
    /*public void generatePoles()
    {
        int x=70;
        
        for(int i=0;i<300;i++)
        {
            int y=rand.nextInt(700);
            if(y<100)
            {
                y=y+100;
            }
            Poles p=new Poles(x,0,y);
            PolesController pp=new PolesController(p);
            controllers.add(pp);
            poles.add(p);
            
            x+=100;
        }
    }*/
    @Override
    public void paintComponent(Graphics g)
    {
      g.setColor(Color.CYAN);
      g.fillRect(0,0,this.getWidth(), this.getHeight());
      // g.setPaintMode();
        
        for(Controller c:enviornment.getControllers())
        {
            c.controll();
        }
         birdcontroller.controll();
      
         
         
         birdcontroller.bird.paint(g);
         for(Controller c:enviornment.getControllers())
         {
             if(c.getDrawable()!=null)
             c.getDrawable().paint(g);
         }
         
         g.setColor(Color.red);
      Font f = new Font("Consolas",Font.BOLD,25);
      g.setFont(f);
      //g.setXORMode(Color.red);
      g.drawString(score+"", 10, 30);
     
        
       /*b.paint(g);
       for(Poles p:poles)
       {
           p.paint(g);
       }*/
        
       
    }
    


}
