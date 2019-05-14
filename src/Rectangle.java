public class Rectangle extends Shape {

    double widht;
    double length;

    public Rectangle(double width, double length){
        this.widht = widht;
        this.length = length;
    }

    @Override
    public double area (){
        return widht+length;

     }

}
