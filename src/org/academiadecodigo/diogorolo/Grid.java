package org.academiadecodigo.diogorolo;

public class Grid {
    //PROPERTIES
    int rows;
    int cols;
    static final int CELL_SIZE = 50;
    static final int X_PADDING = 10;
    static final int Y_PADDING = 10;
    private Cell[][] cells;

    //METHODS
    public void init(int size){
        this.rows = size;
        this.cols = size;
        cells = new Cell[size][size];
        for (int i = 0; i < cells.length ; i++) {
            for (int j = 0; j < cells[i].length ; j++) {
                cells[i][j] = new Cell();
            }
        }
    }



}
