package lk.dilhara.oop.eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JLabel label;

    public MyFrame() {
        super("Meow Meow");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        label = new JLabel("First Text");
        JButton button = new JButton("Click me");
        this.add(label);
        this.add(button);

        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);
    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("CatCat");
        }
    }

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setSize(500,100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
