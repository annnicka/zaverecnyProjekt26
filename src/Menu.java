import javax.swing.*;
import java.awt.*;

public class Menu {
    private JFrame frame;

    public Menu(){
        frame = new JFrame("Menu");

    }

    public void init(){
        this.frame.setSize(600,600);
        this.frame.setLayout(new BorderLayout());
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null); //vycentruje to na obrazovku


        JLabel label = new JLabel("Welcome");
        this.frame.add(label, BorderLayout.CENTER);

        JButton button = new JButton("Rezervotions");
        CustomButtons.changeStyle(button);
        this.frame.add(button, BorderLayout.SOUTH);




        this.frame.setVisible(true); // tohle musi byt vzdy na konci

    }

}
