import javax.swing.*;
import java.awt.*;

public class Menu {
    private JFrame frame;

    public Menu(){
        frame = new JFrame("Menu");

    }

    public void init(){
        this.frame.setSize(600,600);
        this.frame.setLayout(null);
//        new BorderLayout()
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null); //vycentruje to na obrazovku
        this.frame.getContentPane().setBackground(new Color(204, 153, 255));
        JLabel label = new JLabel("Welcome");
        this.frame.add(label, BorderLayout.CENTER);

        JButton button = new JButton("Rezervations");
        CustomButtons.changeStyle(button);
        button.setBounds(150,450,300,50);
        this.frame.add(button);

        JButton button1 = new JButton("Center");
        CustomButtons.changeButton(button1);
        button.setBounds(150,350,300,50);
        this.frame.add(button1);



        this.frame.setVisible(true); // tohle musi byt vzdy na konci

    }

}
