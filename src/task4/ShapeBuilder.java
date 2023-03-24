package task4;

import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public double getTotalArea(){
        double result = 0;
        for(Shape s: shapes){
            result += s.getArea();
        }

        return result;
    }


}
