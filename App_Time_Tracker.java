import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App_Time_Tracker extends JFrame implements ActionListener 
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
        ImageIcon setting_btn_Icon = new ImageIcon("icons/setting_btn_icon.png");
        JButton setting_btn = new JButton(setting_btn_Icon);
        setting_btn.setBounds(10, 10, 50, 50);
        this.add(setting_btn);

        ImageIcon add_btn_Icon = new ImageIcon("icons/add_btn_icon.png");
        JButton add_btn = new JButton(add_btn_Icon);
        add_btn.setBounds(70, 10, 50, 50);
        this.add(add_btn);

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println("This is a computer program made by ShizamDa_Geek");
        new App_Time_Tracker();
    }

    @Override
    public void actionPerformed(ActionEvent btn_action) 
    {

    }
}