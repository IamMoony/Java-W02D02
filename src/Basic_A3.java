public class Basic_A3 {

    public static void main(String args[]) {

        Employees vec[] = {new Manager("John", 34, 100), new Clerk ("Zoe", 25, 110), new Manager("Joe", 30,105), new Clerk("Lisa", 36, 109) };
        double hours[] = {140, 120, 115, 90};
        double total = 0;
        for (int i = 0; i<vec.length; i++) {
            total = total + vec[i].salary(hours[i]);
            System.out.println(vec[i]);
        }

        System.out.println("The total payment of the employees is " + total);
    }
}
