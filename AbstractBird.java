
package bird;
import java.awt.*;
public abstract class AbstractBird implements Bird {
    protected int x; 
    protected int y; 
    protected Color color1; 
    
    public Point getPosition(){ 
        Point place = new Point(this.getX(),this.getY());
        return place;
    }
    public int getX(){
        return x; 
    }
    public int getY(){
        return y; 
    }
    public Color getColor(){ 
        return color1;
    }
    public String toString(){ 
        return(x + "," + y);
    }
    public abstract void fly();     
    
}
