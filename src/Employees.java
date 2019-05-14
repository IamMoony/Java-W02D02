public class Employees {

    String name;
    int age;
    int hourlyRates;
    int hours;

    public Employees(String name, int age, int hourlyRates)
    {
        this.name = name;
        this.age = age;
        this.hourlyRates = hourlyRates;
        this.hours = hours;
    }

    public String toString() {
        String employee = "Name: " + name+"," + " Age: " + age+"," + " Hourly Rate: " + hourlyRates + " USD";
        return employee;
    }

    public double salary(double hours) {
        double salary = hourlyRates * hours;
        return salary;


    }
}
