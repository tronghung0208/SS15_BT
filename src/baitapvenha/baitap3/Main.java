package baitapvenha.baitap3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Objects> strList = new ArrayList<>();
        try {
            System.out.println(tinhTongMangObj(strList));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

    public static int tinhTongMangObj(List<Objects> list) {
        int sum = 0;
        boolean checkNumber = false;

        if (list.isEmpty()) {
            throw new IndexOutOfBoundsException("Mảng rỗng");
        } else {
            for (Object item : list
            ) {
                if (item instanceof Integer) {
                    sum += (Integer) item;
                    checkNumber=true;
                }
            }
            if (!checkNumber==false){
                throw new NumberFormatException("Không có số nguyên trong mảng");
            }
        }
        return sum;
    }
}
