package project1;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Game");
        Logic game = new Logic();
        window.setSize(600,   400) ;
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocation(600,300);
        window.add(game);
    }
}
