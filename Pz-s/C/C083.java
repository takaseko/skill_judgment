package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C083 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 受付入力
      int N = sc.nextInt(); // 売上数
      int salesUnit = sc.nextInt(); // 売上単位
      sc.nextLine();

      // 与えられた入力(運賃)をリストList<Integer>に格納する
      List<Integer> givenNumList = new ArrayList<>();
      for (int i = 0; i < N; i++) {
          givenNumList.add(sc.nextInt());
          sc.nextLine(); // 行送り
      }

      int max = Collections.max(givenNumList); //List<Integer>からMax値を取得し代入
      int length = max / salesUnit; // 出力時の横幅(売上の最大値/売上単位) を代入


      // 与えられた入力全件に対して以下の処理をする。
      int index = 1;
      for (Integer num : givenNumList) {
          int sales = num / salesUnit;
          StringBuilder sb = new StringBuilder(); // 文字列連結はStringBuilder

          for (int i = 0; i < length; i++) { 
              if (i < sales) {
                  sb.append("*"); // "*"を表示する条件処理
              } else {
                  sb.append("."); // それ以外の場合"."を表示する条件処理
              }
          }
          System.out.println(index + ":" + sb.toString()); //結果の出力
          index++;
      }
  }
}


// // 高瀬
// public class C083 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // 1行目の入力を変数に代入する。
//     int N = sc.nextInt(); // 売上数
//     int R = sc.nextInt(); // 売上単位
//     sc.nextLine();
//     // System.out.println(N); 受付確認
    
//     // 与えられた入力(売上数)をリストList<Integer>に格納する
//     List<Integer> givenNumList = new ArrayList<>();
//     for (int i = 0; i < N; i++) {
//         givenNumList.add(sc.nextInt());
//         sc.nextLine(); // 行送り
//     }
//     // System.out.println(givenNumList); リスト確認
    
//     int result = 0; // 結果を初期化
//     int profit = R; // 売上単位を変数へ代入
//     int width = (Math.max(givenNumList)) / profit; // 出力時の横幅(売上の最大値/R)を変数へ代入したい（記述が違う→max）
    
//     // 与えられた入力全件に対して以下の処理をする。
//     for (Integer num : givenNumList) {
//         if () { // "*"を表示する条件処理
//             System.out.println("*");
//         } else { // それ以外の場合"."を表示する条件処理
//             System.out.println(".");
//         }
//         // 結果を出力する。
//         System.out.println(result); //
//     }
//   }
// } 