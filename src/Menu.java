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
        ImageIcon logo = new ImageIcon("res/logo.png");
        this.frame.setIconImage(logo.getImage());


        JLabel label = new JLabel("Welcome");
        this.frame.add(label, BorderLayout.CENTER);

        JButton reservationButton = new JButton("Rezervations");
        CustomThings.changeStyle(reservationButton);
        reservationButton.setBounds(150,450,300,50);
        this.frame.add(reservationButton);

        JButton centerButton = new JButton("Center");
        CustomThings.changeStyle(centerButton);
        centerButton.setBounds(150,350,300,50);
        this.frame.add(centerButton);

        JLabel logo1 = new JLabel();
        CustomThings.label(logo1);
        logo1.setBounds(0,0,500,200);
        this.frame.add(logo1);



        this.frame.setVisible(true); // tohle musi byt vzdy na konci

    }

}
