/*package GoL;

public class Cell {


    public boolean[][] deadoralive(boolean[][] oldGeneration, boolean[][] newgeneration) {

        for (int i = 0; i < oldGeneration.length; i++) {
            for (int j = 0; j < oldGeneration[i].length; j++) {
                int minRow = Math.max(0, i - 1);
                int maxRow = Math.min(oldGeneration.length - 1, i + 1);
                int minCol = Math.max(0, j - 1);
                int maxCol = Math.min(oldGeneration[i].length - 1, j + 1);
                int count = 0;
                for (int a = minRow; a <= maxRow; a++)
                    for (int b = minCol; b <= maxCol; b++) {
                        if ((oldGeneration[a][b]) && !(a == i && b == j))
                            count++;

                    }
                System.out.print(count + " ");

                if ((oldGeneration[i][j]) && (count < 2 || count > 3))
                    newgeneration[i][j] = false;
                else if (!(oldGeneration[i][j]) && (count == 3))
                    newgeneration[i][j] = true;
            }

        }
        return newgeneration;
    }
}
*/
