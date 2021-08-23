package YonggerBroTurtle;

import java.util.Scanner;

public class YounggerBrotherTurtle {
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = new Scanner(System.in).nextInt();
        int[] numb = new int[size];
        int[] numbe = {92, 83, 74, 65, 56, 47, 38, 29, 1445, 98944, 12, 153};
        for (int i = 0; i < size; i++) {
            numb[i] = new Scanner(System.in).nextInt();
        }
        sort(numb);
        System.out.println("Tìm nè: ");
        System.out.println(binarySearch(numb,0,numb.length-1,6));




    }
    static int binarySearch(int[] list,int left,int right, int value) {

        while (left > right) {
            int mid = (left + right) / 2;
            if (value < list[mid]) {
                right = mid - 1;

            } else if (value == list[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void sort(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
