import javax.swing.*;
import java.awt.*;

public class CustomThings {


    public static void changeStyle(JButton button){
        button.setBackground(new Color(190, 50, 105));
        button.setForeground(Color.black);

        button.setFont(new Font("TimesNew Roman",Font.BOLD,14));

        button.setFocusPainted(false);
        button.setBorderPainted(false);

//        button.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
    public static void changeButton(JButton button){
        button.setBackground(new Color(186, 10, 109));
        button.setForeground(Color.cyan);

        button.setFont(new Font("TimesNew Roman",Font.BOLD,14));

        button.setFocusPainted(false);
        button.setBorderPainted(false);

        button.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    public static void label(JLabel label){
        ImageIcon logo = new ImageIcon("res/logo2.png");
        label.setIcon(logo);

    }

}
