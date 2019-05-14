public class Basic_A2 {

    public static void main(String args[]) {

        Circle c1 = new Circle(1);
        Rectangle r1 = new Rectangle(2,3);

        Shape vec[] = {new Circle(3), new Rectangle(4,5), new Circle(4), new Circle(8)};

        for(int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
}
