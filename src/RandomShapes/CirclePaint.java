package RandomShapes;

import java.awt.*;

public class CirclePaint {

    private int size, x, y;
    private Color color;

   public CirclePaint(int size, int x, int y, Color color) {
        this.size = size;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics g){
       g.setColor(getColor());
       g.fillOval( getX(), getY(), getSize(), getSize());
    }

}
