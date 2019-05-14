public class Employees {

    String name;
    int age;
    int hourlyRates;

    public Employees(String name, int age, int hourlyRates)
    {
        this.name = name;
        this.age = age;
        this.hourlyRates = hourlyRates;
    }

    public String toString() {
        String employee = "Name: " + name+"," + " Age: " + age+"," + " Hourly Rate: " + hourlyRates + " USD";
        return employee;
    }
}
