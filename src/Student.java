public class Student extends Person {

    int average;

   public Student(int id, String name, int age, int average) {

       super(id, name, age);
       this.average = average;

        }

        public String toString() {
            return "Student[super:" + super.toString() + ", average: " + average + "]";
        }
    }
