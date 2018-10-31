package org.academiadecodigo.bejeweled;

public class Grid {
    //PROPERTIES
    int rows;
    int cols;
    static final int CELL_SIZE = 50;
    static final int X_PADDING = 10;
    static final int Y_PADDING = 10;
    private Cell[][] cells;
    private Gem[][] gems;
    private Cell lastClickedCell;
    private int lastClickedCol;
    private int lastClickedRow;

    //METHODS
    public void init(int size){
        this.rows = size;
        this.cols = size;
        cells = new Cell[size][size];
        for (int i = 0; i < cells.length ; i++) {
            for (int j = 0; j < cells[i].length ; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }

        gems = new Gem[size][size];
        for (int i = 0; i < gems.length ; i++) {
            for (int j = 0; j < gems[i].length ; j++) {
                gems[i][j] = new Gem(i, j);
            }
        }

    }



    //returns the pixel for the given col/row
    public static int getXcol(int col){
        return CELL_SIZE * col + X_PADDING;
    }
    public static int getYrow(int row){
        return CELL_SIZE * row + Y_PADDING;
    }


    //reverse operations from above, getting col/row from pixel x/y
    public static int getColX(int x){
        return (int) Math.round((x - X_PADDING)/(CELL_SIZE));
    }
    public static int getRowY(int y){
        return (int) Math.round((y - Y_PADDING-25)/(CELL_SIZE));
    }


    public void selectGem(int col, int row) {
        if (lastClickedCell == null){
            gems[col][row].select();
            lastClickedCell = cells[col][row];
            lastClickedCol = col;
            lastClickedRow = row;
            return;
        }
        if (col == lastClickedCol && row == lastClickedRow){
            gems[col][row].select();
            lastClickedCell = null;
            lastClickedRow = -1;
            lastClickedCol = -1;
            return;
        }

        if(checkForCorrectSwapAttempt(cells[col][row])){
            gems[col][row].select();
            System.out.println("valid");
            cells[lastClickedCol][lastClickedRow].setGem(cells[col][row].getGem());
            System.out.println(cells[lastClickedCol][lastClickedRow].getGem());
            System.out.println(lastClickedCell.getGem());
            cells[col][row].setGem(lastClickedCell.getGem());
            return;
        }
        System.out.println("invalid");

    }

    private boolean checkForCorrectSwapAttempt(Cell clicked) {
        boolean isValid = false;
            if ((clicked.getCol() == lastClickedCell.getCol()&& (clicked.getRow() == lastClickedCell.getRow() + 1 || clicked.getRow() == lastClickedCell.getRow() - 1))
                    || (clicked.getRow() == lastClickedCell.getRow() && (clicked.getCol() == lastClickedCell.getCol() + 1 || clicked.getCol() == lastClickedCell.getCol() - 1))){
                isValid = true;
            }
        return isValid;
    }



}
