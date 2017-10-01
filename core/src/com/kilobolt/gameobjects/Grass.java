package com.kilobolt.gameobjects;

/**
 * Created by Admin on 01.10.2017.
 */

public class Grass extends Scrollable {

    // Когда констуктор Grass вызван – вызовите конструтор родителя (Scrollable)
    public Grass(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);

    }

}