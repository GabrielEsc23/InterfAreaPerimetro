import exaple.InterfazF;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculo de Areas");
        frame.setContentPane(new InterfazF().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setPreferredSize(new Dimension(800,800));
        frame.pack();
        frame.setVisible(true);
    }
}