package org.academiadecodigo.diogorolo.mouse;

import org.academiadecodigo.diogorolo.Grid;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class GridMouseHandler implements MouseHandler {

    private Mouse mouse;
    private Grid grid;
    private volatile int x = 0;
    private volatile int y = 0;


    public GridMouseHandler(Grid gameGrid){
        this.mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        this.grid = gameGrid;
    }

    private void reset(){
        x = 0;
        y = 0;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        x = (int) e.getX();
        y = (int) e.getY();

        grid.selectCell(Grid.getColX(x), Grid.getRowY(y));
        System.out.println(" x: "+ x + " Col: " + Grid.getColX(x));
        System.out.println(" y: "+ y + " Row: " + Grid.getRowY(y));
        e.toString();


    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
