package baitapvenha.baitap1;

import java.util.Scanner;

public class baitap1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        handleArrNumber();

    }

    public static void handleArrNumber() {
        try {
            System.out.println("Nhập vào số a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số b: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Tổng hai số a và b là: " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Nhập không đúng định dạng, bạn phải nhập số");
            handleArrNumber();
        }
    }
    public static void handleArrNumberThrows () throws NumberFormatException {

            System.out.println("Nhập vào số a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số b: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Tổng hai số a và b là: " + (a + b));

    }
}
