package C;

import java.util.Scanner;

public class C048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int X = sc.nextInt(); // 価格
        int P = sc.nextInt(); // 割引
        sc.nextLine(); // 改行
        // System.out.println(); // 受付確認済

        // 結果の出力
        int rate = 100 - P; // 割引の割合(100 - 割引率)を変数に代入する
        int finalPrice = X; // 無料注文できる最終的な金額にXを代入
        while (Math.floor(X) > 0) { // Math.floorメソッドでXの小数点切り捨てをして、while文でXが0になるまで繰り返す
          X = (X * rate / 100); // 割引後の金額を計算して変数Xを更新
          finalPrice += X; // 無料注文できる最終的な金額に、割引後の金額を足していく
          System.out.println(finalPrice);
        }
        System.out.println(finalPrice); // 最終的な金額を出力する
  }
}