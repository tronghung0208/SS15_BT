package baitapvenha.baitap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        List<Integer> soNguyenList =stringToNumber(str);

        System.out.println(soNguyenList);
    }


    public static List<Integer> stringToNumber(String str) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char kiTu = str.charAt(i);

            try {
                int soNguyen = Integer.parseInt(String.valueOf(kiTu));
                list.add(soNguyen);
            } catch (NumberFormatException e) {
                System.out.println("Kí tự thứ " + i + " không phải số nguyên và được thay thế bằng 0");
                list.add(0);
            }

        }
        return list;
    }
}
