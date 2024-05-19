package Hotel.Mamagement.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UpdateCheck extends JFrame {
    UpdateCheck(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1  = new JLabel("Check-In Details");
        label1.setBounds(124,11,222,25);
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2  = new JLabel("ID :");
        label2.setBounds(25,88,46,14);
        label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(248,85,140,20);
        panel.add(c);



        JLabel label3  = new JLabel("Room Number :");
        label3.setBounds(25,129,107,14);
        label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JTextField textField3 = new JTextField();
        textField3.setBounds(248,129,140,20);
        panel.add(textField3);

        JLabel label4  = new JLabel("Name :");
        label4.setBounds(25,174,97,14);
        label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField textField4 = new JTextField();
        textField4.setBounds(248,174,140,20);
        panel.add(textField4);

        JLabel label5  = new JLabel("Checked-in :");
        label5.setBounds(25,216,97,14);
        label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField textField5 = new JTextField();
        textField5.setBounds(248,216,140,20);
        panel.add(textField5);

        JLabel label6  = new JLabel("Amount Paid (Rs) :");
        label6.setBounds(25,261,150,14);
        label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JTextField textField6 = new JTextField();
        textField6.setBounds(248,261,140,20);
        panel.add(textField6);

        JLabel label7  = new JLabel("Pending Amount (Rs) :");
        label7.setBounds(25,302,150,14);
        label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label7.setForeground(Color.WHITE);
        panel.add(label7);

        JTextField textField7 = new JTextField();
        textField7.setBounds(248,302,140,20);
        panel.add(textField7);


        JButton update = new JButton("Update");
        update.setBounds(56,378,89,23);
        update.setBackground(Color.WHITE);
        update.setForeground(Color.BLACK);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        JButton back = new JButton("Back");
        back.setBounds(168,378,89,23);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Reception();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(281,378,89,23);
        check.setBackground(Color.WHITE);
        check.setForeground(Color.BLACK);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        setLayout(null);
        setSize(950,500);
        setLocation(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new UpdateCheck();
    }
}
