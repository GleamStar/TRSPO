package com.company;

public abstract class GraphicObject {
    int x, y;
    void moveTo(int newX, int newY) {
    }
    abstract void draw();
    abstract void resize();
}
class Circle extends GraphicObject {
    void draw() {

    }
    void resize() {

    }
}