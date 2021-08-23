package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student = new Student("Binh", 30, "Hue");
        Student student1 = new Student("Hoa", 45, "Hue");
        Student student2 = new Student("Hoang", 42, "Hue");
        Student student3 = new Student("Hieu", 18, "Hue");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();

        Collections.sort(lists);
        System.out.println("So sanh theo tuoi: ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
