package Q1;

import lk.dilhara.oop.eventHandling.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    private JLabel lblCount; // Declare component JLabel
    private JTextField tfCount; // Declare component JTextField
    private JButton btnCount; // Declare component JButton
    private int count = 0; // counter's value
    private JButton btnCountDown;
    private JButton btnReset;

    // Constructor to setup UI components and event handlers

    public Counter() {

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        lblCount = new JLabel("Counter"); // Construct component Label
        add(lblCount); // "super" Frame adds Label
        tfCount = new JTextField(count + "", 10); // Construct component TextField
        tfCount.setEditable(false); // read-only
        add(tfCount); // "super" Frame adds TextField

        btnCountDown = new JButton("Count down");
        btnCount = new JButton("Count Up"); // Construct component Button
        btnReset = new JButton("Reset");

        add(btnCountDown);
        add(btnCount); // "super" Frame adds Button
        add(btnReset);

        MyListener handler = new MyListener();

        btnCount.addActionListener(handler);
        btnCountDown.addActionListener(handler);
        btnReset.addActionListener(handler);

    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == btnCount) {
                ++count;
                tfCount.setText(count + "");
            } else if (evt.getSource() == btnCountDown) {
                --count;
                tfCount.setText(count + "");
            } else if (evt.getSource() == btnReset) {
                count = 0;
                tfCount.setText(count + "");
            }
        }


    }


        public static void main(String[] args) {
            Counter counter = new Counter();
            counter.setSize(500, 150);
            counter.setVisible(true);
            counter.setLocationRelativeTo(null);
            counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}


