package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum GemType {
    //MASTERCODER ("resources/cat.jpg"),
    MC1 ("resources/gems/1mc0.png"),
    MC2("resources/gems/2mc0.png"),
    MC3("resources/gems/3mc0.png"),
    MC4("resources/gems/4mc0.png");

    private String imagePath;

    GemType (String imagePath){
        this.imagePath = imagePath;
    }

    public static GemType getRand(){
        return GemType.values()[(int)Math.round((float)Math.random()*3)];
    }

    public String getImagePath() {
        return imagePath;
    }
}
