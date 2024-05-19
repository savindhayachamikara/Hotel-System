package Hotel.Mamagement.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField textField1;

    JPasswordField passwordField1;

    JButton b1,b2;
    Login(){
        super("Hotel Management System");

        JLabel label1 = new JLabel("Password");
        label1.setBounds(40,70,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("UserName");
        label2.setBounds(40,20,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(new Color(26,104,110));
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(26,104,110));
        add(passwordField1);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/aa.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318,0,450,300);
        add(label);

        b2 = new JButton("Login");
        b2.setBounds(40,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        b1 = new JButton("Cancel");
        b1.setBounds(180,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);




        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setLocation(400,270);
        setSize(800,325);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2){
            new Dashboard();
            setVisible(false);


        }else {
            System.exit(102);
        }

    }

    public static void main(String[] args) {
        new Login();

    }
}
