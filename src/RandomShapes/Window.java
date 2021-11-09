package RandomShapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.event.KeyEvent.*;

public class Window extends JFrame{

    private EnterPressed ep = new EnterPressed();

    public Window(){

        setTitle("GUI ME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        getContentPane().add(ep);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                switch (e.getKeyCode()) {

                    case VK_1:
                    ep.setNumberPressed(1);
                    ep.repaint();
                    break;

                    case VK_2:
                        ep.setNumberPressed(2);
                        ep.repaint();
                        break;

                    case VK_3:
                        ep.setNumberPressed(3);
                        ep.repaint();
                        break;

                    case VK_4:
                        ep.setNumberPressed(4);
                        ep.repaint();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });

       setVisible(true);
    }
}
