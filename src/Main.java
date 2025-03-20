import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame windows;
    Container con;
    JPanel panel;
    JLabel label;


    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        windows = new JFrame();
        windows.setSize(500,750);
        System.out.println("hello world");
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.getContentPane().setBackground(Color.darkGray);
        windows.setLocationRelativeTo(null);

        windows.setLayout(null);
        panel = new JPanel();
        panel.setBounds(0,0,580,990);
        panel.setBackground(Color.white);
        label = new JLabel();
        con = windows.getContentPane();
        panel.add(label);
        con.add(panel);
        windows.setVisible(true);



    }
}