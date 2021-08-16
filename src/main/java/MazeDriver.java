package main.java;

import java.io.*;
import java.util.List;

public class MazeDriver {
    public static void main(String[] args) throws Exception {

        File maze1 = new File("C:/workspace/Maze/src/main/resources/maze1.txt");
        File maze2 = new File("C:/workspace/Maze/src/main/resources/maze2.txt");

        File maze3 = new File("C:/workspace/Maze/src/main/resources/maze3.txt");
        File maze4 = new File("C:/workspace/Maze/src/main/resources/maze4.txt");

        execute(maze1);
        execute(maze2);
        execute(maze3);
        execute(maze4);
    }

    private static void execute(File file) throws Exception {

        System.out.println("*****Executing Maze "+file.getName()+ "*****");
        System.out.println();

        Maze maze = new Maze(file);
        getMazeSolution(maze);

        System.out.println("_____________________________________________");
    }

    private static void getMazeSolution(Maze maze) {
        MazeSolver dfs = new MazeSolver();
        List<Coordinate> path = dfs.solve(maze);
        maze.printPath(path);
        maze.reset();
    }
}
