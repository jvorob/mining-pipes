


package Util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import miningpipes.MiningPipes;

/**
 *
 * @author George
 */
public class Keyboard extends KeyAdapter {
    private boolean[] keys;
    
    public Keyboard(){
        keys=new boolean[66000];
    }
    
    public void keyPressed(KeyEvent e){
        keys[e.getKeyCode()]=true;
        MiningPipes.tm.keyPressed(e);
    }
    
    public void keyReleased(KeyEvent e){
        keys[e.getKeyCode()]=false;
    }
    
    public boolean getKey(int k){
        return keys[k];
    }
    
}
