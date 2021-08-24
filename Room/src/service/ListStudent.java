package service;

import model.Student;

import java.util.List;
import java.util.Scanner;


public class ListStudent {
    List<Student> listStudent;

    public void addStudent(Student student) {
        listStudent = StudentWriteFile.readFile();
        student.setStt((listStudent.size() > 0) ? (listStudent.size() + 1) : 1);
        System.out.print("Tên: ");
        student.setName(new Scanner(System.in).nextLine());
        System.out.print("Giới tính: ");
        student.setGender(new Scanner(System.in).nextLine());
        System.out.print("Ngày sinh: ");
        student.setDoB(new Scanner(System.in).nextLine());
        System.out.print("Địa chỉ: ");
        student.setAddress(new Scanner(System.in).nextLine());

        listStudent.add(student);
        StudentWriteFile.writeFile(listStudent);
    }

    public void showListStudent() {
        listStudent = StudentWriteFile.readFile();
        for (Student listStudent : listStudent) {
            listStudent.showInfo();
        }
    }

    public void findStt() {
        System.out.println("Nhập stt: ");
        int findID = new Scanner(System.in).nextInt();
        for (Student listStudent : listStudent) {
            if (listStudent.getStt() == findID) {
                listStudent.showInfo();
            }
        }
    }

    public void findName() {
        System.out.println("Nhập tên: ");
        String findName = new Scanner(System.in).nextLine();
        for (Student listStudent : listStudent) {
            if (listStudent.getName().equals(findName)) {
                listStudent.showInfo();
            }
        }
    }

    public void editStudent() {
        System.out.print("Nhập stt: ");
        int eStt = new Scanner(System.in).nextInt();
        for (Student listStudent : listStudent) {
            if (listStudent.getStt() == eStt) {
                System.out.print("Nhập tên: ");
                String name = new Scanner(System.in).nextLine();
                listStudent.setName(name);
                System.out.print("Nhập giới tính: ");
                String gender = new Scanner(System.in).nextLine();
                listStudent.setGender(gender);
                System.out.print("Nhập ngày sinh:");
                String dayOfBirth = new Scanner(System.in).nextLine();
                listStudent.setDoB(dayOfBirth);
                System.out.print("Nhập địa chỉ ");
                String address = new Scanner(System.in).nextLine();
                listStudent.setAddress(address);
            }
        }
    }

    public void editNameStudent() {
        System.out.println("Nhập stt: ");
        int eStt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == eStt) {
                System.out.println("Nhập tên: ");
                student.setName(new Scanner(System.in).nextLine());
            }
        }
    }

    public void editGenderStudent() {
        System.out.println("Nhập stt: ");
        int eStt = new Scanner(System.in).nextInt();

        for (Student student : listStudent) {
            if (student.getStt() == eStt) {
                System.out.println("Nhập giới tính: ");
                student.setGender(new Scanner(System.in).nextLine());
            }
        }
    }

    public void editDobStudent() {
        System.out.println("Nhập stt: ");
        int eStt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == eStt) {
                System.out.println("Nhập ngày tháng năm sinh: ");
                student.setDoB(new Scanner(System.in).nextLine());
            }
        }
    }

    public void editAddressStudent() {
        System.out.println("Nhập stt: ");
        int eStt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == eStt) {
                System.out.println("Nhập địa chỉ: ");
                student.setAddress(new Scanner(System.in).nextLine());
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Nhập stt: ");
        int dID = new Scanner(System.in).nextInt();
        listStudent.removeIf(student -> student.getStt() == dID);
    }

    public void showScore() {
        if (listStudent.size() == 0) {
            System.out.println("Danh sách trống");
        } else {
            for (Student listStudent : listStudent) {
                listStudent.showScore();
            }
        }
    }

    public void addAllScore() {
        System.out.print("Nhập stt: ");
        int stt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == stt) {
                System.out.print("Nhập điểm hệ số 1 lần 1: ");
                student.setFirstScoreCoefficient1(new Scanner(System.in).nextDouble());
                System.out.print("Nhập điểm hệ số 1 lần 2: ");
                student.setSecondScoreCoefficient1(new Scanner(System.in).nextDouble());
                System.out.print("Nhập điểm hệ số 2: ");
                student.setScoreCoefficient2(new Scanner(System.in).nextDouble());
                System.out.print("Nhập điểm hệ số 3: ");
                student.setScoreCoefficient3(new Scanner(System.in).nextDouble());
            }
        }
    }

    public void addFirstScoreCoefficient1() {
        System.out.print("Nhập stt: ");
        int stt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == stt) {
                System.out.print("Nhập điểm hệ số 1 lần 1: ");
                student.setFirstScoreCoefficient1(new Scanner(System.in).nextDouble());
            }
        }
    }

    public void addSecondScoreCoefficient1() {
        System.out.print("Nhập stt: ");
        int stt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == stt) {
                System.out.print("Nhập điểm hệ số 1 lần 2: ");
                student.setSecondScoreCoefficient1(new Scanner(System.in).nextDouble());
            }
        }
    }

    public void addScoreCoefficient2() {
        System.out.print("Nhập stt: ");
        int stt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == stt) {
                System.out.print("Nhập điểm hệ số 2: ");
                student.setScoreCoefficient2(new Scanner(System.in).nextDouble());
            }
        }
    }

    public void addScoreCoefficient3() {
        System.out.print("Nhập stt: ");
        int stt = new Scanner(System.in).nextInt();
        for (Student student : listStudent) {
            if (student.getStt() == stt) {
                System.out.print("Nhập điểm hệ số 3: ");
                student.setScoreCoefficient3(new Scanner(System.in).nextDouble());
            }
        }
    }
}

