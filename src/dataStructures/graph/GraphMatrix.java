package dataStructures.graph;

public class GraphMatrix {

    static int [][]maze = {
            {0,0,0,0,0},
            {0,1,1,0,0},
            {0,1,1,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
    };
    static int paths = 0;

    public static int getPathsNumber(int row, int col) {
        int rows = maze.length-1;
        int cols = maze[0].length-1;

        if(row <= rows && col < cols
                && maze[row][col+1] == 0 ) {
            getPathsNumber(row, col+1);
        }
        if(row < rows && col <= cols
                && maze[row+1][col] == 0 ) {
            getPathsNumber(row+1, col);
        }
        if(row == rows && col == cols) {
            paths++;
        }
        return paths;
    }
}
