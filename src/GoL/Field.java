package GoL;


import java.util.Random;

public class Field {


    public void box() {
        //сделать рамку

    }

    public void firstGeneation(char[][] graph) {
        char symbol;
        Random rand = new Random();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                int r = rand.nextInt(2);
                if (r == 1) {
                    symbol = '*';
                } else {
                    symbol = ' ';
                }
                graph[i][j] = symbol;
                System.out.print(graph[i][j]);
            }
            System.out.println();

        }
    }
}

