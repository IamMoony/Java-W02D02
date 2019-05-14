public class Circle extends Shape {

    double pi = Math.PI;
    double radius;

    public Circle(double radius) {
        this.pi = pi;
        this.radius = radius;
    }

    @Override
    public double area(){
        return pi * Math.pow(radius, 2);
    }
}



