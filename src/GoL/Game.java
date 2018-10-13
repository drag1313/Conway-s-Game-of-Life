package GoL;



public class Game {
    public static int getHight() {
        return hight;
    }

    public static int getWidth() {
        return width;
    }

    public static final int hight=10;
    public static final int width=25;

    public static void main(String[] args) {

        boolean[][] graph = new boolean[hight][width];
        boolean[][] newgeneration=new boolean[hight][width];
            Cell cell=new Cell();
            Field field = new Field();
            field.firstGeneation(graph);
            field.printfield(graph);
            cell.deadoralive(graph,newgeneration);
            field.printfield(newgeneration);


    }
    }

