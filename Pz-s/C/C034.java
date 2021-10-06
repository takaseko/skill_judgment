package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.nextLine(); // 入力の値（例；1 + 3 = x）
        String[] strArray = inputValue.split(""); // 入力の値をリストへ格納
        // System.out.println(); // 入力受付確認

        int sum = 0; // 合計
        int tempSum = 0; // 一区切りの合計値を一時的に保持する変数
        for (int i = 0; i < strArray.length; i++) {
            String str = strArray[i];
            // 記号が"a"の場合
            if (str.equals("1")) {
                tempSum += 1;
            }
            // 記号が"op"の場合
            if (str.equals("+")) {
                tempSum += 0;
            }
            // 記号が"b"の場合
            if (str.equals("3")) {
                sum += tempSum;
                tempSum = 3;
            }
            // 記号が"="の場合
            if (str.equals("=")) {
                sum += tempSum;
                tempSum = 0;
            }
            // // 記号が"c"の場合
            // if (str.equals("x")) {
            //     sum += tempSum;
            //     tempSum = Integer.parseInt("");
            // }
            // ループが一番最後の場合
            if (i == strArray.length - 1) {
                sum += tempSum;
            }
            // System.out.println(str);
        }
        System.out.println(sum);
    }
}