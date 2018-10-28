package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cell {
    //PROPERTIES
    private Gem gem;
    private int col;
    private int row;
    //private Picture picture;
    Rectangle rectangle;

    //CONSTRUCTOR
    public Cell(int col, int row){
        gem = new Gem();
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(Grid.getXcol(col),Grid.getYrow(row),Grid.CELL_SIZE,Grid.CELL_SIZE);
        rectangle.setColor((col + row)% 2 !=0 ? Color.DARK_GRAY: Color.GRAY);
        rectangle.fill();
        //this.picture = new Picture(col * Grid.CELL_SIZE + Grid.X_PADDING, row * Grid.CELL_SIZE + Grid.Y_PADDING, gem.image);
        //picture.draw();
    }


}
