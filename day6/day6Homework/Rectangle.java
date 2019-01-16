package pl.sda.javastart.day6.day6Homework;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea(){
        return width * height;
    }

}
