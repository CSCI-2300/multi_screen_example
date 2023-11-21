package multi_screen_example.view;

import javax.swing.*;
import java.awt.event.*;

import multi_screen_example.controller.ExampleController;
public class ExampleGUI
{
    JFrame mainFrame;
    JPanel mainPanel;
    public ExampleGUI(ExampleController controller){
        mainFrame = new JFrame("Example Frame 1");
        mainPanel = new JPanel();
        JButton button1 = new JButton("Option 1");
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                mainFrame.setVisible(false);
                controller.userSelectedOption1();
            }
        });
        JButton button2 = new JButton("Option 2");
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                mainFrame.setVisible(false);
                controller.userSelectedOption2();
            }
        });

        mainPanel.add(button1);
        mainPanel.add(button2);
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }


}
