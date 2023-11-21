package multi_screen_example.controller;
import multi_screen_example.view.*;
public class ExampleController{
    public ExampleController(){
        ExampleGUI gui = new ExampleGUI(this);
    }

    public void userSelectedOption1(){
        // you can instantiate a model here, if needed
        // and pass it as an argument to the controller constructor
        new Option1Controller();
    }

    public void userSelectedOption2(){
        // you can instantiate a model here, if needed
        // and pass it as an argument to the controller constructor
        new Option2Controller();
    }
}
