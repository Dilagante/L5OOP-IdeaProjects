package myapp;

import java.awt.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3,5,5));

        for (int i = 0; i < 10; i++) {
            p1.add(new JButton("" + i));
        }

        p1.add(new JButton("0"));
        p1.add(new JButton("."));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 1, 5, 5));

        p2.add(new JButton("+"));
        p2.add(new JButton("-"));
        p2.add(new JButton("Clear"));

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2,15,15));
        p3.add(p1);
        p3.add(p2);

        setLayout(new BorderLayout(25,15));

        add(new JTextField("Cat"), BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}