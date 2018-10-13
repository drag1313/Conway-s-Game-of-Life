package GoL;

import java.awt.*;
import javax.swing.*;


public class Game {
    private JFrame frame;
    Canvas canvasPanel;
    final String NAME_OF_GAME="Conway-s-Game-of-Life";
    final int START_LOCATION=200;
    final int BTN_PANEL_HEIGHT=58;
    final int MASS_SIZE=50;
    final int POINT_RADIUS=10;
    final int FIELD_SIZE=(MASS_SIZE+1)*POINT_RADIUS-3;
    boolean[][]oldGeneration=new boolean[MASS_SIZE][MASS_SIZE];
    boolean[][]newGeneration=new boolean[MASS_SIZE][MASS_SIZE];


    public static void main(String[] args) {


        new Game().go();


    }
    void go(){
        frame=new JFrame(NAME_OF_GAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FIELD_SIZE,FIELD_SIZE+BTN_PANEL_HEIGHT);
        frame.setLocation(START_LOCATION,START_LOCATION);
        frame.setResizable(false);

        canvasPanel=new Canvas();
        canvasPanel.setBackground(Color.WHITE);


        JPanel btnPanel=new JPanel();


        frame.setVisible(true);
    }
}

