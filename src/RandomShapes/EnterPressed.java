package RandomShapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

public class EnterPressed extends JPanel {

    private int numberPressed;

    public EnterPressed(){
        setBackground(Color.black);
    }

    public int getNumberPressed() {
        return numberPressed;
    }

    public void setNumberPressed(int numberPressed) {
        this.numberPressed = numberPressed;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Random r = new Random();

        switch (getNumberPressed()){

            case 1:

                for (int i = 0; i < r.nextInt(300); i++)
                    circle(g, r);
            break;

            case 2:

                for (int i = 0; i < r.nextInt(300); i++)
                    rect(g, r);
                break;

            case 3:

                for (int i = 0; i < r.nextInt(300); i++)
                    polygon(g, r);
                break;

            case 4:

                for (int i = 0; i < r.nextInt(300); i++) {
                    polygon(g, r);
                    rect(g, r);
                    circle(g, r);
                }

                break;
        }
    }

    private void polygon(Graphics g, Random r){

        new PolygonPaint(r.nextInt(300), r.nextInt(3000), r.nextInt(3000), new Color(r.nextFloat(), r.nextFloat(), r.nextFloat())).draw(g);
    }

    private void circle(Graphics g, Random r){

        new CirclePaint(r.nextInt(300), r.nextInt(3000), r.nextInt(3000), new Color(r.nextFloat(), r.nextFloat(), r.nextFloat())).draw(g);
    }

    private void rect(Graphics g, Random r){

        new RectPaint(r.nextInt(300), r.nextInt(3000), r.nextInt(3000), new Color(r.nextFloat(), r.nextFloat(), r.nextFloat())).draw(g);
    }
}















