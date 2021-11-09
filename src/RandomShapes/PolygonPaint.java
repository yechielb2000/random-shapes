package RandomShapes;

import java.awt.*;
import java.util.Random;

public class PolygonPaint {


    private int size, x, y;
    private Color color;

    public PolygonPaint(int size, int x, int y, Color color) {
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

        Random r = new Random();

        g.setColor(getColor());
        g.fillPolygon(new int[] {getSize() + getX(), getSize() + getX() + r.nextInt(300), getSize() + getX() + r.nextInt(300)}, new int[] {getSize() + getY() + r.nextInt(300), getSize() + getY(), getSize() + getY() + r.nextInt(300)}, 3);
    }

}
