import java.util.TreeSet;

public class TreeSetExercise {
    static TreeSet<Student> students = new TreeSet<Student>();
    static class Student {
        String name;
        String ID;
    }

    public int compareTo( Student obj1, Student obj2 ) {
        return obj1.name.compareTo(obj2.name);
    }

    public void printStudent() {
        for (Student student: students) {
            System.out.print(student.name);
        }
    }


}
