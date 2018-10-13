package GoL;


import java.util.Random;

public class Field {


    public void firstGeneation(boolean[][] graph) {

        Random rand = new Random();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                boolean r = rand.nextBoolean();
                graph[i][j] = r;
            }

        }
    }

    public void printfield(boolean[][] graph) {
        char symbol;
        char[][] graph2 = new char[Game.getHight()][Game.getWidth()];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j]) {
                    symbol = '*';
                } else {
                    symbol = ' ';
                }
                graph2[i][j] = symbol;
                System.out.print(graph2[i][j]);

            }
            System.out.println();


        }
    }
}
