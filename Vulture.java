
package bird;
import java.awt.*;
import java.util.*;
public class Vulture extends AbstractBird {
    int direction = 0; //0 = left, 2 = down, 4 = right, 6 = up
                       //pause ever other move to turn to face direction
    
    public Vulture(int x, int y){ 
        this.x = x;
        this.y = y; 
        this.color1 = Color.BLACK;
    }
    public void fly(){ 
        if(direction == 0)
            x--;
        else if(direction == 2)
            y++;
        else if(direction == 4)
            x++;
        else if(direction == 6)
        {
            y--;
            direction = -2;
        }
        
        direction++;
        
    } 
}
