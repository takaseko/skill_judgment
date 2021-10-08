package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C034 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String inputValue = sc.nextLine(); // 入力の値（例；1 + 3 = x）
          String[] strArray = inputValue.split(" "); // 入力の値をリストへ格納
          System.out.println();
    
          int x;
          if ("x".equals(strArray[0])) {
                if ("+".equals(strArray[1])) {
                      // x + 3 = 4
                      // x = 4 - 3
              x = Integer.parseInt(strArray[4]) - Integer.parseInt(strArray[2]);
              System.out.println(x);
          } else {
                // x - 3 = 4
              // x = 4 + 3
              x = Integer.parseInt(strArray[4]) + Integer.parseInt(strArray[2]);
              System.out.println(x);
          }
      }

      if ("x".equals(strArray[2])) {
            if ("+".equals(strArray[1])) {
                  // 3 + x = 4
                  // x = 4 - 3
              x = Integer.parseInt(strArray[4]) - Integer.parseInt(strArray[0]);
              System.out.println(x);
          } else {
                // 3 - x = 1
              // x = 3 - 1
              x = Integer.parseInt(strArray[0]) - Integer.parseInt(strArray[4]);
              System.out.println(x);
          }
      }

      if ("x".equals(strArray[4])) {
          if ("+".equals(strArray[1])) {
                // 3 + 4 = x
                x = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[2]);
                System.out.println(x);
            } else {
                  // 4 - 2 = x
              x = Integer.parseInt(strArray[0]) - Integer.parseInt(strArray[2]);
              System.out.println(x);
          }
      }
  }
}

// 高瀬
// public class C034 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String inputValue = sc.nextLine(); // 入力の値（例；1 + 3 = x）
//         String[] strArray = inputValue.split(" "); // 入力の値をリストへ格納
//         System.out.println(); // 入力受付確認

//         int x = 0; // 空欄に入る整数（答え）
//         int tempSum = 0; // 一区切りの合計値を一時的に保持する変数
//         for (int i = 0; i < strArray.length; i++) {
//             String str = strArray[i];
//             // 入力値が"数値0〜9"の場合
//             if (str.equals("0")) {
//               tempSum += 0;
//             }
//             if (str.equals("1")) {
//               tempSum += 1;
//             }
//             if (str.equals("2")) {
//               tempSum += 2;
//             }
//             if (str.equals("3")) {
//               tempSum += 3;
//             }
//             if (str.equals("4")) {
//               tempSum += 4;
//             }
//             if (str.equals("5")) {
//               tempSum += 5;
//             }
//             if (str.equals("6")) {
//               tempSum += 6;
//             }
//             if (str.equals("7")) {
//               tempSum += 7;
//             }
//             if (str.equals("8")) {
//               tempSum += 8;
//             }
//             if (str.equals("9")) {
//               tempSum += 9;
//             }
//             // 記号が"+"の場合
//             if (str.equals("+")) {
//                 x += tempSum;
//                 tempSum = 0;
//             }
//             // 記号が"-"の場合
//             if (str.equals("-")) {
//                 x -= tempSum;
//                 tempSum = 0;
//             }
//             // ループが一番最後の場合
//             if (i == strArray.length - 1) {
//               x += tempSum;
//             }
//             System.out.println(str);
//         }
//           System.out.println(x);
//     }
// }