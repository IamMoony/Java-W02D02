public class Person {

    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {

        return "Person: id:" + id + " name: " + name + " age: " + age + "]";
    }
}
