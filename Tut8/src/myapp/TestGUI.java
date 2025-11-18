package myapp;
import javax.swing.*;

public class TestGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");

        JButton jbtOk = new JButton("OK");
        frame.add(jbtOk);


        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
