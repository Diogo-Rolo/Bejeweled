package org.academiadecodigo.bejeweled;

import org.academiadecodigo.bejeweled.mouse.GridMouseHandler;

public class Game {

    Grid gamegrid;
    GridMouseHandler mouseHandler;

    public Game(){

        gamegrid = new Grid();
        mouseHandler = new GridMouseHandler(gamegrid);

    }


    public void init() {
        gamegrid.init(8);
    }

    public void start() {

    }
}
