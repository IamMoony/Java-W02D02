public class Teacher extends Person {

    private String major;

    public Teacher(int id, String name, int age, String major) {
        super(id, name, age);
    }

        public String toString() {
            return "Teacher[super:" + super.toString() + " ,major: " + major + "]";

    }
}
