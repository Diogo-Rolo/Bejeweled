package org.academiadecodigo.diogorolo;

public enum gemTypes {
    MASTERCODER ("resources/cat.jpg");

    private String image;

    gemTypes (String image){
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}
