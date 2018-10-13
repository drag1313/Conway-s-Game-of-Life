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
}
