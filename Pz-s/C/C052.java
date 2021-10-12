package C;

import java.util.*;
import java.util.Scanner;

public class C052 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt(); // 縦の解像度
      int w = sc.nextInt(); // 横の解像度
      sc.nextLine(); // 改行
      int y = Math.abs(sc.nextInt()); // y軸へスクロールする距離
      int x = Math.abs(sc.nextInt()); // x軸へスクロールする距離

      // 240 180
      // 30 30
      // (30 × 240) + (30 × 180) - (30 × 30) = 11700
      // (240 * 180) - (240 - 30) * (180 - 30)

      // 100 80
      // 95 -6
      // (100 * 80) - (100 - 95) * (80 - 6)
      int result = (h * w) - (h - y) * (w - x);
      System.out.println(result);
  }
}

// 自分
// public class C052 { 
//   public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           int h = sc.nextInt(); // 縦の解像度
//           int w = sc.nextInt(); // 横の解像度
//           sc.nextLine(); // 改行
//           int y = sc.nextInt(); // y軸へスクロールする距離
//           int x = sc.nextInt(); // x軸へスクロールする距離
//           // System.out.println(); // 入力受付確認

//           // absメソッドで絶対値へ変換
//           int height = h * Math.abs(y); // 縦軸の差分
//           int width = w * Math.abs(x); // 横軸の差分
//           int distance = Math.abs(y * x); // 共通部分
//           // System.out.println(height);
//           // System.out.println(width);
//           // System.out.println(distance);
          
//           int result = height + width - distance; // 描画結果を計算して代入
//           System.out.println(result); // 結果を出力
//   }
// }
