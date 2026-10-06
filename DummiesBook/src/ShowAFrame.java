import javax.swing.*;
import java.util.Scanner;

class ShowAFrame{
    public static void main(String[] args){
        JFrame myFrame = new JFrame();
        String myTitle = "Blank Frame";

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setSize(300, 200);
        myFrame.setTitle(myTitle);

    }
}