/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package falppybird;

import java.util.ArrayList;

/**
 *
 * @author kandarp
 */
public class Enviornment {
    private ArrayList<Controller> controllers=new ArrayList<Controller>();
    private BirdController _birdController;
    public void add(Controller c)
    {
        controllers.add(c);
    }
    
    public void remove(Controller c)
    {
        controllers.remove(c);
    }
    public void addBirdContoller(BirdController b)
    {
        _birdController = b;
    }

    public BirdController getBirdController() {
        return _birdController;
    }

    public ArrayList<Controller> getControllers() {
        return controllers;
    }
    
}
