package BinarySearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Stringg {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi vao:");
        String string = new Scanner(System.in).nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.println(ch);
        }
        System.out.println();
    }
}
//public class Stringg {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        java.lang.String string = input.nextLine();
//
//        LinkedList<Character> max = new LinkedList<>();
//
//        // Find the maximum increasingly ordered subsequence
//        for (int i = 0; i < string.length(); i++) {
//            LinkedList<Character> list = new LinkedList<>();
//            list.add(string.charAt(i));
//            for (int j = i + 1; j < string.length(); j++) {
//                if (string.charAt(j) > list.getLast()) {
//                    list.add(string.charAt(j));
//                }
//            }
//
//            if (list.size() > max.size()) {
//                max.clear();
//                max.addAll(list);
//            }
//            list.clear();
//        }
//
//        for (Character ch : max) {
//            System.out.print(ch);
//        }
//        System.out.println();
//    }
//}