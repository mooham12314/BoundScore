/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundscore;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author mooham12314
 */
public class Listener1 implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt){
            System.out.println("Live Score is : "+evt.getNewValue());
    }
    
}
