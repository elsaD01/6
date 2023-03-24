package task4;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    @org.junit.jupiter.api.Test
    void getTotalArea() {

        Square s1 = new Square(2);
        Square s2 = new Square(5);
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(s1);
        shapeBuilder.addShape(s2);
        double d = shapeBuilder.getTotalArea();
        assertEquals(29, d);



    }
    @org.junit.jupiter.api.Test
    void getTotalAreaNegatives() {

        Square s1 = new Square(-2);
        Square s2 = new Square(-5);
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(s1);
        shapeBuilder.addShape(s2);
        double d = shapeBuilder.getTotalArea();
        assertEquals(0, d);



    }
}