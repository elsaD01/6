package task4;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public String toString(){
        return "circle with radius" + radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius(){
        return radius;
    }


}
