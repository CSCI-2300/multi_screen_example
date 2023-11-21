package multi_screen_example.view;

import javax.swing.*;
import java.awt.event.*;

import multi_screen_example.GameControllerInterface;

public class GameGUI{
    GameControllerInterface controller;
    public GameGUI(GameControllerInterface controller){
        this.controller = controller;
        JFrame mainFrame = new JFrame("Game GUI");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        JLabel label = new JLabel("I'm the game GUI");

        JButton button = new JButton("Press me and see the output in the terminal");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                controller.userDidSomething();
            }
        });

        mainPanel.add(label);
        mainPanel.add(button);
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
