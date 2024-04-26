import java.awt.*;
import javax.swing.*;

public class App_Time_Tracker extends JFrame
{
    public App_Time_Tracker()
    {
        this.setTitle("App Time Tracker");
        this.setSize(900, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(34, 32, 52));
        this.setLayout(null);
        this.setResizable(false);

        // Buttons
        JButton add_btn = new JButton();
        add_btn.setText("Add");
        add_btn.setBounds(0, 0, 100, 100);
        add_btn.setBackground(Color.WHITE);
        this.add(add_btn);

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println("This is a computer program made by ShizamDa_Geek");
        new App_Time_Tracker();
    }
}