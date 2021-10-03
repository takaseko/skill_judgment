package C;

import java.util.Scanner;

public class C048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int X = sc.nextInt(); // 価格
        int P = sc.nextInt(); // 割引率
        sc.nextLine(); // 改行
        // System.out.println(); // 受付確認済

        // 結果の出力
        // for分で無料になる条件処理を繰り返す。
        int discountPrice = (X * P) / 100;
        for (int i = 0; i > discountPrice; i++) {
          int finalPrice = 0;
          finalPrice += discountPrice;
          // if () { // の場合「」
          //     System.out.println("AB");
          // } else if (X == 0) { // の場合「」
          //     System.out.println("A");
          // } else if (P == 0) { // の場合「」
          //     System.out.println("B");
          // } else {
          //     System.out.println("N"); // それ以外の場合「」
          // }
          System.out.println(finalPrice + X);
        }
  }
}