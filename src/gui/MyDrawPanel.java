package gui;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {



    public void  paintComponent(Graphics graphics) {

        graphics.setColor(Color.orange);

        graphics.fill3DRect(20,50,100,100,true);

    }
}
