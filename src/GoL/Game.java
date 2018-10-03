package GoL;



public class Game {
    public static void main(String[] args) {
        final int hight=10;
        final int width=25;
        char[][] graph = new char[hight][width];
        char[][] newgeneration=new char[hight][width];

            Field field = new Field();
            field.firstGeneation(graph);
        }
    }

