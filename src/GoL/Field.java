/*package GoL;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

                while (true) {
                    if (goNextGeneration) {
                        Life();
                        canvasPanel.repaint();
                        try {
                            Thread.sleep(showDelay);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }

                    }

                }



public class Field {

      JButton goButton = new JButton("Play");
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                goNextGeneration = !goNextGeneration;
                goButton.setText(goNextGeneration ? "Stop" : "Play");
            }
        })




}
*/