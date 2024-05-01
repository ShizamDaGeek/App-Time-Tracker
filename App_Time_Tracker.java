import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App_Time_Tracker extends JFrame implements ActionListener
{
    JButton add_btn;
    JButton color_chooser_btn;
    JButton font_chooser_btn;

    public App_Time_Tracker()
    {
        // WINDOW
        this.setTitle("App Time Tracker");
        this.setSize(900, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(34, 32, 52));
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        JPanel topMenu = new JPanel();
        topMenu.setBackground(Color.black);
        topMenu.setPreferredSize(new Dimension(100, 100));
        this.add(topMenu, BorderLayout.NORTH);

        // BUTTONS
        ImageIcon add_btn_Icon = new ImageIcon("icons/add_btn_icon.png");
        add_btn = new JButton(add_btn_Icon);
        add_btn.setBounds(10, 10, 50, 50);
        add_btn.addActionListener(this);
        topMenu.add(add_btn);

        ImageIcon color_chooser_btn_Icon = new ImageIcon("icons/color_chooser_btn_icon.png");
        color_chooser_btn = new JButton(color_chooser_btn_Icon);
        color_chooser_btn.setBounds(70, 10, 50, 50);
        color_chooser_btn.addActionListener(this);
        topMenu.add(color_chooser_btn);

        ImageIcon font_chooser_btn_Icon = new ImageIcon("icons/font_chooser_btn_icon.png");
        font_chooser_btn = new JButton(font_chooser_btn_Icon);
        font_chooser_btn.setBounds(130, 10, 50, 50);
        font_chooser_btn.addActionListener(this);
        topMenu.add(font_chooser_btn); 

        // MAKING IT ALL VISIBLE
        this.setVisible(true);
    }

    // ACTION PERFORMED BY USER
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == add_btn)
        {
            JFileChooser chooseApp = new JFileChooser();
            chooseApp.showOpenDialog(null);
        }

        if(e.getSource() == color_chooser_btn)
        {
            JColorChooser windowColorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Choose Color for the Window", getContentPane().getBackground());
            this.getContentPane().setBackground(color);
        }
    }

    // PUBLICSTATICVOIDOWEFUHWEBUWE
    public static void main(String[] args)
    {
        System.out.println("*---------------------------------------------------*");
        System.out.println("|                    Hello World!                   |");
        System.out.println("|This is a computer program is made by ShizamDa_Geek|");
        System.out.println(".---------------------------------------------------.");
        new App_Time_Tracker();
    }
}