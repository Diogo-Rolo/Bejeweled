package org.academiadecodigo.diogorolo;

public class Grid {
    //PROPERTIES
    int rows;
    int cols;
    Gem hasSelected;
    static final int CELL_SIZE = 50;
    static final int X_PADDING = 10;
    static final int Y_PADDING = 10;
    private Cell[][] cells;
    //private Gem[][] gems;

    //METHODS
    public void init(int size){
        this.rows = size;
        this.cols = size;
        this.hasSelected = null;
        cells = new Cell[size][size];
        for (int i = 0; i < cells.length ; i++) {
            for (int j = 0; j < cells[i].length ; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }

        //gems = new Gem[size][size];
        //for (int i = 0; i < gems.length ; i++) {
        //    for (int j = 0; j < gems[i].length ; j++) {
        //        gems[i][j] = new Gem(i, j);
        //    }
        //}

    }



    //returns the pixel for the given col/row
    public static int getXcol(int col){
        return CELL_SIZE * col + X_PADDING;
    }
    public static int getYrow(int row){
        return CELL_SIZE * row + Y_PADDING;
    }

    public static int getColX(int x){
        return (int) Math.round((x - X_PADDING)/(CELL_SIZE));
    }
    public static int getRowY(int y){
        return (int) Math.round((y - Y_PADDING-25)/(CELL_SIZE));
    }


    public void selectGem(int col, int row) {
        if(hasSelected!=null){
            //hasSelected.

        }
       // gems[col][row].select();
    }
}
