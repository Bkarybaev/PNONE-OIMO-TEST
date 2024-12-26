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

        windows.setSize(380,700);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.getContentPane().setBackground(Color.darkGray);
        windows.setLocationRelativeTo(null);
        windows.setLayout(null);

        panel = new JPanel();

        panel.setBounds(0,0,380,690);
        panel.setBackground(Color.white);

        label = new JLabel();
        image = new ImageIcon(".//src//images//Фото 27.11.2024, 12.23.jpg");
        label.setIcon(image);

        if (image.getIconWidth() == -1) {
            System.out.println("Сүрөт жүктөлгөн жок! Жолду текшериңиз.");
        }


        System.out.println("hello world");

        System.out.println("not fount");

        con = windows.getContentPane();
        panel.add(label);
        con.add(panel);
        windows.setVisible(true);
    }
}