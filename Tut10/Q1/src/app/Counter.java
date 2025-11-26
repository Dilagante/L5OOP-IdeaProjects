package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    private JLabel lblCount;
    private JTextField tfCount;
    private JButton btnCountUp;
    private JButton btnCountDown;
    private JButton btnCountReset;
    private int count = 0;


    public Counter() {
        super("My Counter");
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        
        lblCount = new JLabel("Counter");
        tfCount = new JTextField(String.valueOf(count),10);
        tfCount.setEditable(false);

        btnCountUp = new JButton("⬆");
        btnCountDown = new JButton("⬇");
        btnCountReset = new JButton("Reset");

        this.add(lblCount);
        this.add(tfCount);
        this.add(btnCountDown);
        this.add(btnCountUp);
        this.add(btnCountReset);

        MyListener myListener = new MyListener();

        btnCountUp.addActionListener(myListener);
        btnCountDown.addActionListener(myListener);
        btnCountReset.addActionListener(myListener);
    }

    public class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == btnCountUp) {
                count++;
            } else if (evt.getSource() == btnCountDown) {
                count--;
            } else if (evt.getSource() == btnCountReset) {
                count = 0;
            }
            tfCount.setText(String.valueOf(count));
        }
    }

    public static void main(String[] args) {
        Counter frame = new Counter();
        frame.setSize(500,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

}
