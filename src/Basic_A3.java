public class Basic_A3 {

    public static void main(String args[]) {

        Employees vec[] = {new Manager("John", 34, 100), new Clerk ("Zoe", 25, 110), new Manager("Joe", 30,105), new Clerk("Lisa", 36, 109) };
        for (int i = 0; i<vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
}
