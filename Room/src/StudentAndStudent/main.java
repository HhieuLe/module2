package StudentAndStudent;


import StudentAndStudent.List.listStudent;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        listStudent listStudent = new listStudent();
        int num, num1, num2,num3;
        do {
            printMenu();
            System.out.print("Nhập lựa chọn của bạn :  ");
            num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1:
                    do {
                        printStudentMenu();
                        System.out.print("Nhập lựa chọn của bạn: ");
                        num1 = new Scanner(System.in).nextInt();
                        switch (num1) {
                            case 1:
                                listStudent.showListStudent();
                                break;
                            case 2:
                                listStudent.addStudent(new Student());
                                break;
                            case 3:
                                 do {
                                     printEditMenu();
                                     System.out.println("Nhập lựa chọn của bạn:");
                                     num3=new Scanner(System.in).nextInt();
                                     switch (num3){
                                         case 1:
                                             listStudent.editStudent();
                                             break;
                                         case 2:
                                             listStudent.editNameStudent();
                                             break;
                                         case 3:
                                             listStudent.editGenderStudent();
                                             break;
                                         case 4:
                                             listStudent.editDobStudent();
                                             break;
                                         case 5:
                                             listStudent.editAddressStudent();
                                             break;
                                         case 0:
                                                 break;
                                         default:
                                             System.out.println("Vui lòng nhập trong khoảng từ 0->5");
                                     }
                                 }while (num3!=0);
                                break;
                            case 4:
                                listStudent.deleteStudent();
                                break;
                            case 5:
                                do {
                                    printFindMenu();
                                    System.out.print("Nhập lựa chọn của bạn: ");
                                    num2 = new Scanner(System.in).nextInt();
                                    switch (num2) {
                                        case 1:
                                            listStudent.findStt();
                                            break;
                                        case 2:
                                            listStudent.findName();
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Lỗi, vui lòng nhập trong khoảng từ 0->2");
                                            System.out.println("Nhập lại: ");
                                            break;
                                    }
                                } while (num2 != 0);

                            case 0:
                                break;
                            default:
                                System.out.println("Lỗi, vui lònh nhập trong khoảng từ 0->5");
//                                num1 = new Scanner(System.in).nextInt();
                                System.out.println("Nhập lại: ");
                                break;
                        }
                    } while (num1 != 0);
                    break;
                case 2:
                    do {
                        printScoreMenu();
                        System.out.print("Nhập lựa chọn của bạn: ");
                        num1 = new Scanner(System.in).nextInt();
                        switch (num1){
                            case 1:
                                listStudent.showScore();
                                break;
                            case 2:
                                listStudent.addAllScore();
                                break;
                            case 3:
                                listStudent.addFirstScoreCoefficient1();
                                break;
                            case 4:
                                listStudent.addSecondScoreCoefficient1();
                                break;
                            case 5:
                                listStudent.addScoreCoefficient2();
                                break;
                            case 6:
                                listStudent.addScoreCoefficient3();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Lỗi, vui lòng nhập trong khoảng từ 0->6");
                                break;
                        }
                    }while (num1!=0);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lỗi, vui lòng nhập trong khoảng từ 0-> 2");
//                    num = new Scanner(System.in).nextInt();
                    System.out.println("Nhập lại: ");
                    break;
            }
        } while (true);

    }

    public static void printMenu() {
        System.out.println("----- Hệ Thống Tổng -----");
        System.out.println("1. Menu quản lý học viên ");
        System.out.println("2. Menu quản lý điểm học viên");
        System.out.println("0. Thoát");
        System.out.println("-----");
    }

    public static void printStudentMenu() {
        System.out.println("----- Quản lý học viên -----");
        System.out.println("1. Xem danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Tìm học viên");
        System.out.println("0. Trở lại");
        System.out.println("-----");
    }

    public static void printFindMenu() {
        System.out.println("----- Tìm học viên-----");
        System.out.println("1. Tìm theo STT");
        System.out.println("2. Tìm theo tên");
        System.out.println("0. Trở lại");
        System.out.println("-----");
    }
    public static void printScoreMenu(){
        System.out.println("----- Quản lý điểm học viên-----");
        System.out.println("1. Hiện danh sách");
        System.out.println("2. Nhập điểm");
        System.out.println("3. Sửa điểm lần 1");
        System.out.println("4. Sửa điểm lần 2");
        System.out.println("5. Sửa điểm lần 3");
        System.out.println("6. Sửa điểm lần 4");
        System.out.println("7. Xếp loại học viên");
        System.out.println("0. Trở lại");
        System.out.println("-----");
    }
    public static void printEditMenu(){
        System.out.println("----- Sửa thông tin học viên-----");
        System.out.println("1. Sửa tất cả thông tin");
        System.out.println("2. Sửa tên");
        System.out.println("3. Sửa giới tính");
        System.out.println("4. Sửa ngày tháng sinh");
        System.out.println("5. Sửa địa chỉ");
        System.out.println("0. Trở lại");
        System.out.println("------");
    }
}
