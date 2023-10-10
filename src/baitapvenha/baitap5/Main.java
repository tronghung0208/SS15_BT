package baitapvenha.baitap5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b;
        int[] input = inputData();
        a = input[0];
        b = input[1];
        System.out.println(Arrays.toString(input));
        try {
            double ketQua=phepChia(a,b);
            System.out.println("Kết quả: "+ketQua);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static int[] inputData() {
        int[] input = new int[2];
        try {
            System.out.println("Nhập vào số a: ");
            input[0] = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số b: ");
            input[1] = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("số nhập vào không phải số nguyên, xin mời nhập lại");
            inputData();
        }
        return input;
    }

    public static double phepChia(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Lỗi, không thể chia cho 0");
        }
        return (double) a / b;
    }
}
