package baitapvenha.baitap2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            System.out.println("số lớn nhất là: " +searchMaxNumber());
        } catch (IllegalArgumentException e) {
            System.out.println("Mảng không có phần tử, xin mời nhập số lượng phần tử");

        }
    }

    public static int[] getArrRandom() {
        System.out.println("Nhập vào số lượng phần tử");
        int soLuongPhanTu = Integer.parseInt(sc.nextLine());
        if (soLuongPhanTu<=0){
            throw new IllegalArgumentException("Số lượng phần tử không hợp lệ");
        }
        int[] arr = new int[soLuongPhanTu];
        Random random = new Random();
        for (int i = 0; i < soLuongPhanTu; i++) {
            int phanTu = random.nextInt(100);
            arr[i] = phanTu;
        }
        return arr;
    }

    public static int searchMaxNumber() {
        int[] arr = getArrRandom();
        if (arr.length == 0) {
            throw new IllegalArgumentException("Mảng không có phần tử");
        }
        int maxNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }
}
