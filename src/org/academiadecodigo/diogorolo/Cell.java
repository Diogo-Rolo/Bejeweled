package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cell {
    //PROPERTIES
    private Gem gem;
    private int col;
    private int row;
    Rectangle rectangle;
    //private Picture picture;

    //CONSTRUCTOR
    public Cell(int col, int row){
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(Grid.getXcol(col),Grid.getYrow(row),Grid.CELL_SIZE,Grid.CELL_SIZE);
        rectangle.setColor((col + row)% 2 !=0 ? Color.DARK_GRAY: Color.GRAY);
        rectangle.fill();
        gem = new Gem(col,row);
    }


    public Gem getGem() {
        return gem;
    }

    public void setGem(Gem gem) {
        this.gem = gem;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
