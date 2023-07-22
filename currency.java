// java program to convert from
// rupee to the dollar and vice versa
// using java swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cuurncoveter {

    public static void converter()

    {
        JFrame f = new JFrame("CONVERTER");

        JLabel l1, l2;
        JTextField t1, t2;

        JButton b1, b2, b3;
        // naming the labels and settings
        // the bounds for the labels
        l1 = new JLabel("rupess");
        l1.setBounds(20, 40, 60, 30);
        l2 = new JLabel("Dollars");
        l2.setBounds(170, 40, 60, 30);

        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);
        // creating a button for INR
        // one button for the dollar
        // and one button to close
        // ans setting the bounds

        b1 = new JButton("INR");
        b1.setBounds(50, 80, 60, 15);
        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 60, 30);
        b3 = new JButton("close");
        b3.setBounds(150, 150, 60, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double d
                        = Double.parseDouble(t1.getText());
                double d1 = (d / 62.25);

                String str1 = String.valueOf(d1);
                t2.setText(str1);
            }



    });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d2
                        =Double.parseDouble(t2.getText());
                double d3 = (d2 * 62.65);

                String str2 = String.valueOf(d3);
                t1.setText(str2);


            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);

    }
    public static void main(String [] args){
        converter();
    }
}
