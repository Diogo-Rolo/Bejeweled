package org.academiadecodigo.bejeweled;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    //PROPERTIES
    private Gem gem;
    private int col;
    private int row;
    Rectangle rectangle;

    //CONSTRUCTOR
    public Cell(int col, int row){
        gem = new Gem(col,row);
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(Grid.getXcol(col),Grid.getYrow(row),Grid.CELL_SIZE,Grid.CELL_SIZE);
        rectangle.setColor((col + row)% 2 !=0 ? Color.DARK_GRAY: Color.GRAY);
        rectangle.fill();
    }


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Gem getGem() {
        return gem;
    }

    public void setGem(Gem gem){
        this.gem = gem;
    }
}
