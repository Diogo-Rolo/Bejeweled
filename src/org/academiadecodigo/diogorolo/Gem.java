package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Gem {

    //PROPRERTIES
    private boolean isSelected;
    private GemType mc;
    private Picture pic;

    public Gem(int col, int row){

        this.mc = GemType.getRand();
        this.pic = new Picture(Grid.getXcol(col), Grid.getYrow(row),mc.getImagePath());
        this.pic.draw();
    }

    public void select() {
        isSelected = !isSelected;
        pic.load(mc.getImageSelectedPath(isSelected));
        this.pic.draw();
    }
}
