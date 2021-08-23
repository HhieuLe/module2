package onlyWrite;

public class Student {
    String name = "john";
    String classes = "C02";
    public Student(){

    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.classes);
    }
}
