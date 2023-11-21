package multi_screen_example.controller;
import multi_screen_example.GameControllerInterface;
import multi_screen_example.view.GameGUI;

public class Option2Controller implements GameControllerInterface{
    GameGUI gameGUI;

    public Option2Controller(){
        gameGUI =new GameGUI(this);
    }

    @Override
    public void userDidSomething(){
        System.out.println("User did something, Option2Controller is on it!");
    }
}
