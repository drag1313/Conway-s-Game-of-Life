package GoL;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class Game {

    final String NAME_OF_GAME = "Conway's Game of Life";
    final int START_LOCATION = 200;
    final int BTN_PANEL_HEIGHT = 58;
    final int MASS_SIZE = 50;
    final int POINT_RADIUS = 10;
    final int FIELD_SIZE = (MASS_SIZE + 1) * POINT_RADIUS - 3;
    boolean goNextGeneration = false;
    int showDelay = 200;
    boolean[][] oldGeneration = new boolean[MASS_SIZE][MASS_SIZE];
    boolean[][] newGeneration = new boolean[MASS_SIZE][MASS_SIZE];
    Canvas canvasPanel;
    JFrame frame;


    public static void main(String[] args) {


        new Game().go();


    }

    void go() {
        frame = new JFrame(NAME_OF_GAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FIELD_SIZE, FIELD_SIZE + BTN_PANEL_HEIGHT);
        frame.setLocation(START_LOCATION, START_LOCATION);
        frame.setResizable(false);
        canvasPanel = new Canvas();
        canvasPanel.setBackground(Color.WHITE);

        JButton fillButton = new JButton("Fill");
        fillButton.addActionListener(new FillButtonListener());
        JButton stepButton = new JButton("Step");
        stepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Life();
                canvasPanel.repaint();
            }
        });

        JButton goButton = new JButton("Play");
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    goNextGeneration = !goNextGeneration;
                    goButton.setText(goNextGeneration ? "Stop" : "Play");

                    while (true) {
                        if (goNextGeneration) {
                            Life();
                            canvasPanel.repaint();
                            try {
                                Thread.sleep(showDelay);
                            } catch (InterruptedException v) {
                                v.printStackTrace();
                            }

                        }

                    }
                }
        });


        JPanel btnPanel = new JPanel();
        btnPanel.add(fillButton);
        btnPanel.add(stepButton);
        btnPanel.add(goButton);


        frame.getContentPane().add(BorderLayout.CENTER, canvasPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, btnPanel);
        frame.setVisible(true);


    }


    public class FillButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent av) {

            Random rand = new Random();
            int countGeneration = 1;
            for (int x = 0; x < MASS_SIZE; x++) {
                for (int y = 0; y < MASS_SIZE; y++) {
                    oldGeneration[x][y] = rand.nextBoolean();
                }
            }

            canvasPanel.repaint();
        }
    }

    public class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int x = 0; x < MASS_SIZE; x++) {
                for (int y = 0; y < MASS_SIZE; y++) {
                    if (oldGeneration[x][y]) {
                        g.fillOval(x * POINT_RADIUS, y * POINT_RADIUS, POINT_RADIUS, POINT_RADIUS);
                    }
                }
            }
        }

    }

    void Life() {
        for (int x = 0; x < MASS_SIZE; x++) {
            for (int y = 0; y < MASS_SIZE; y++) {
                int count = countNeighbors(x, y);
                newGeneration[x][y] = oldGeneration[x][y];
                //
                newGeneration[x][y] = (count == 3) ? true : newGeneration[x][y];
                //
                newGeneration[x][y] = ((count < 2) || (count > 3) ? false : newGeneration[x][y]);
            }
        }
        for (int x = 0; x < MASS_SIZE; x++) {
            System.arraycopy(newGeneration[x], 0, oldGeneration[x], 0, MASS_SIZE);
        }
    }

    int countNeighbors(int x, int y) {
        int count = 0;
        for (int dx = -1; dx < 2; dx++) {
            for (int dy = -1; dy < 2; dy++) {
                int nx = x + dx;
                int ny = y + dy;
                nx = (nx < 0) ? MASS_SIZE - 1 : nx;
                ny = (ny < 0) ? MASS_SIZE - 1 : ny;
                nx = (nx > MASS_SIZE - 1) ? 0 : nx;
                ny = (ny > MASS_SIZE - 1) ? 0 : ny;
                count += (oldGeneration[nx][ny]) ? 1 : 0;
            }
        }
        if (oldGeneration[x][y]) {
            count--;
        }

        return count;
    }

}


