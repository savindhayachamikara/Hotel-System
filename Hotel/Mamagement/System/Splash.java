package Hotel.Mamagement.System;

import javax.swing.*;
import java.awt.*;

public class Splash  extends JFrame {
    Splash(){
        super("Hotel Management System");

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/aa.png"));
        Image i22 = i111.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(30,50,800,500);
        label.add(label11);

        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public  static void main(String[] args){
        new Splash();

    }
}
