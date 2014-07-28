/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author kandarp
 */
public class FalppyBird {

    /**
     * @param args the command line arguments
     */
    static Enviornment enviorment =new Enviornment();
    public static void main(String[] args) {
        // TODO code application logic here
        initResourses();
        Game game=new Game(enviorment);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(2000,2000);
    }
    public static void initResourses()
    {
        Random rand = new Random();
        
        Bird b=new Bird(30,100,40,40);
       
        BirdController bc=new BirdController(enviorment, b);
        enviorment.addBirdContoller(bc);
        int x=1270;
        for(int i=0;i<300;i++)
        {
            int y=rand.nextInt(600);
            if(y<200)
            {
                y=y+200;
            }
            Poles p=new Poles(x,0,y);
            PolesController pp=new PolesController(enviorment,p);
          enviorment.add(pp);
           
            
            x+=500;
        
        }
         //MainWindow m=new MainWindow(enviorment);
        MainWindowController n=new MainWindowController(enviorment);
       enviorment.add(n);
        
        
    }
}

