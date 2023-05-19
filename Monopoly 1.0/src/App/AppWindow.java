package App;
import javax.swing.*;
import java.awt.*;


public class AppWindow {
    private JFrame jFrame;
    private ImageIcon imageIcon;
    private JLabel jLabel;
    private JButton startButton;
    private JButton settingButton;

    public AppWindow(){

        imageIcon = new ImageIcon("Image/demo.png");
        jLabel = new JLabel(imageIcon);
        jLabel.setSize(1000,563);

        startButton = new JButton("Start");
        startButton.setBounds(450, 250, 100, 40);


        settingButton = new JButton("Setting");
        settingButton.setBounds(450, 300, 100, 40);
        settingButton.addActionListener(e -> settingGame());

        jFrame = new JFrame();
        jFrame.add(jLabel);
        jFrame.add(startButton);
        jFrame.add(settingButton);
        jFrame.setSize(1000,563);
        jFrame.setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public void settingGame(){
        new AppSetting();
    }

}