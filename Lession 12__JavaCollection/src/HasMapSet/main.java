package HasMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Hoa", 20, "Hue");
        Student student2 = new Student("Hieu", 22, "Hue");
        Student student3 = new Student("Binh", 24, "Hue");
        Student student4 = new Student();
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);
        studentMap.put(5, student4);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println(".........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        students.add(student4);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
