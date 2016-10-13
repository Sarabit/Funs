
package bird;
import java.awt.*;

public class Cardinal extends AbstractBird {
    private int change = 1;
    
    public Cardinal(int x, int y){ 
        this.x = x;
        this.y = y; 
        this.color1 = Color.RED;
    }
    public void fly(){ 
       
        
        if(y == 0){ 
            change = 1; 
        } else if (y == 19){ 
            change = -1;
        }
        
        y+=change;  
        
    } 
}
