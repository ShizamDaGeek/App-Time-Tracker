import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App_Time_Tracker extends JFrame implements ActionListener
{
    JButton setting_btn;
    JButton add_btn;

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
        setting_btn = new JButton(setting_btn_Icon);
        setting_btn.setBounds(10, 10, 50, 50);
        setting_btn.addActionListener(this);
        this.add(setting_btn);

        ImageIcon add_btn_Icon = new ImageIcon("icons/add_btn_icon.png");
        add_btn = new JButton(add_btn_Icon);
        add_btn.setBounds(70, 10, 50, 50);
        add_btn.addActionListener(this);
        this.add(add_btn);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == add_btn)
        {
            JFileChooser chooseApp = new JFileChooser();
            chooseApp.showOpenDialog(null);
        }

        if(e.getSource() == setting_btn)
        {
            SettingsDialog();
        }
    }

    private void SettingsDialog()
    {
        JDialog settingMenu = new JDialog(this, "Settings", true);
        settingMenu.setTitle("Settings");
        settingMenu.setBounds(600, 100, 400, 400);
        settingMenu.setResizable(false);
        settingMenu.setVisible(true);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println("This is a computer program made by ShizamDa_Geek");
        new App_Time_Tracker();
    }
}