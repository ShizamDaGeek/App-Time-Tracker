import java.awt.*;
import javax.swing.*;

public class App_Time_Tracker extends JFrame
{
    public App_Time_Tracker()
    {
        this.setTitle("App Time Tracker");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(34, 32, 52));
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        new App_Time_Tracker();
    }
}