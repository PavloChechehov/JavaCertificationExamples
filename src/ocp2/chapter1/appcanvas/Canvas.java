package ocp2.chapter1.appcanvas;

import ocp2.chapter1.graphicshape.Circle;

class Canvas {
    void getArea() {
        Circle circle = new Circle();
        circle.area(); // call to public method area(), outside package
    }
}
