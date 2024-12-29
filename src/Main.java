import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame windows;
    Container con;
    JPanel panel;
    JLabel label;
    ImageIcon image;

    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        windows = new JFrame();

        windows.setSize(480,900);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.getContentPane().setBackground(Color.darkGray);
        windows.setLocationRelativeTo(null);
        windows.setLayout(null);

        panel = new JPanel();

        panel.setBounds(0,0,480,990);
        panel.setBackground(Color.white);

        label = new JLabel();




        System.out.println("hello world");

        System.out.println("not fount");

        con = windows.getContentPane();
        panel.add(label);
        con.add(panel);
        windows.setVisible(true);
    }
}