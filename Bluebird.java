
package bird;
import java.awt.*;
import java.util.*;
public class Bluebird extends AbstractBird {
    private int change = 1;
    private boolean up = false;
    
    public Bluebird(int x, int y){ 
        this.x = x;
        this.y = y; 
        this.color1 = Color.BLUE;
    }
    public void fly(){ 
              
        if(up)
            y--;
        else
            y++;
        
        if(x == 0){ 
            change = 1; 
        } else if (x == 19){ 
            change = -1;
        }
        
        x+=change;  
        up = !up;
        
    } 
}
