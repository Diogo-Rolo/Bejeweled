package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum GemType {
    //MASTERCODER ("resources/cat.jpg"),
    MC1,
    MC2,
    MC3,
    MC4;

    private String path;
    private String name;
    private String extension;

    GemType (){
        path = "resources/gems/";
        name = "mc";
        extension = ".png";
    }

    public static GemType getRand(){
        return GemType.values()[(int)Math.round((float)Math.random()*3)];
    }

    public String getImagePath() {
        return path+this.ordinal()+name+extension;
    }

    public String getImageSelectedPath(boolean isSelected) {
        String selection = isSelected ? "S" : "";
        return path+this.ordinal()+name+selection+extension;
    }
}
