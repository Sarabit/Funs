
package bird;
import java.awt.*;
import java.util.*;
public class Hummingbird extends AbstractBird {
    public Hummingbird(int x, int y){ 
        this.x = x;
        this.y = y; 
        this.color1 = Color.MAGENTA;
    }
    public void fly(){ 
        Random r = new Random();
        x = r.nextInt(10);
        y = r.nextInt(10);
    } 
}
