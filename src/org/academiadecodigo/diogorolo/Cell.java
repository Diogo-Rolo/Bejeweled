package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cell {
    //PROPERTIES
    private Gem gem;
    private int col;
    private int row;
    private Picture picture;

    //CONSTRUCTOR
    public Cell(int col, int row){
        gem = new Gem();
        this.col = col;
        this.row = row;
        this.picture = new Picture(col * Grid.CELL_SIZE + Grid.X_PADDING, row * Grid.CELL_SIZE + Grid.Y_PADDING, gem.image);
        picture.draw();
    }


}
