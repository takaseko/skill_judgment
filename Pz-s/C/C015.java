package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C015 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //まず以下で入力受付
      int N = sc.nextInt(); // 1行目：レシート枚数
      sc.nextLine(); // 改行
      // System.out.println(); // レシート枚数の入力受付確認OK

      List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
          // レシート枚数の処理を繰り返す。
          for (int i = 0; i < N; i++) {
              String[] array = sc.nextLine().split(" "); // 入力例: 1 1024 → {"1", "1024"}に変換
              // 配列の中身はString型なので、intに変換してListに格納する。
              List<Integer> tmpList = new ArrayList<>(); 
              tmpList.add(Integer.parseInt(array[0])); // 日付(d)
              tmpList.add(Integer.parseInt(array[1])); // 購入金額(h)
              list.add(tmpList);
              // System.out.println(tmpList); // リストの格納確認OK
          }

          // 結果の出力
          // 入力を一時的に保持するList全件に対して処理を繰り返す。
          int endPoint = 0; // 月末ポイント残高

          for (int i = 0; i < list.size(); i++) {
            int point = 0; // ポイント残高初期値（0）
            int date = list.get(i).get(0); // レシート日付
            int purchasePraice = list.get(i).get(1); // 購入金額
            
            // 日付に3のつくの購入金額の場合(ポイント3％（小数点以下切り捨て）)
            if (Integer.toString(date).contains("3")) { //containsメソッドでレシート日付に3がつく数字を条件にする
              point += purchasePraice * 0.03; // 購入金額 * 3% 
            // 日付に5のつく日の購入金額の場合(ポイント5％（小数点以下切り捨て）) //containsメソッドでレシート日付に5がつく数字を条件にする
            } else if (Integer.toString(date).contains("5")) { 
              point += purchasePraice * 0.05; // 購入金額 * 5%
            // それ以外（日付が通常の購入金額の場合(ポイント1％（小数点以下切り捨て）)
            }  else {
              point += purchasePraice * 0.01; // 購入金額 * 1%
            }
             // for文のポイントを足して月末ポイント残高へ代入
             endPoint += point;

          }
            // 月末ポイント残高結果を出力する。
            System.out.println(endPoint);
  }
}

//   // 山岡さんコード
//   public class C015 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //まず以下で入力受付
//         int N = sc.nextInt(); // 1行目：レシート枚数
//         sc.nextLine(); // 改行

//         List<List<String>> list = new ArrayList<>(); // 入力を一時的に保持するList
//         // レシート枚数の処理を繰り返す。
//         for (int i = 0; i < N; i++) {
//             String[] array = sc.nextLine().split(" "); // 入力例: 1 1024 → {"1", "1024"}に変換
//             // 配列の中身はString型なので、intに変換してListに格納する。
//             List<String> tmpList = new ArrayList<>();
//             tmpList.add(array[0]); // 日付(d)
//             tmpList.add(array[1]); // 購入金額(h)
//             list.add(tmpList);
//         }

//         // 上記入力を一時的に保持するListはStringなら下記でも良い
//         // List<List<String>> list = new ArrayList<>(); // 入力を一時的に保持するList
//         // // レシート枚数の処理を繰り返す。
//         // for (int i = 0; i < N; i++) {
//         //     String[] array = sc.nextLine().split(" "); // 入力例: 1 1024 → {"1", "1024"}に変換
//         //     // 配列の中身はString型なので、intに変換してListに格納する。
//         //     list.add(Arrays.asList(array));
//         // }

//         // 結果の出力
//         // 入力を一時的に保持するList全件に対して処理を繰り返す。
//         int endPoint = 0; // 月末ポイント残高

//         for (List<String> tmpList: list) {
//             String date = tmpList.get(0); // レシート日付
//             int purchasePrice = Integer.parseInt(tmpList.get(1)); // 購入金額 parseIntメソッドで文字列を数値へ変換

//             // 日付に3のつくの購入金額の場合(ポイント3％（小数点以下切り捨て）)
//             if (date.contains("3")) { //containsメソッドでレシート日付に3がつく数字を条件にする
//                 endPoint += purchasePrice * 0.03; // 購入金額 * 3%
//                 // 日付に5のつく日の購入金額の場合(ポイント5％（小数点以下切り捨て）)
//             } else if (date.contains("5")) {  //containsメソッドでレシート日付に5がつく数字を条件にする
//                 endPoint += purchasePrice * 0.05; // 購入金額 * 5%
//                 // それ以外（日付が通常の購入金額の場合(ポイント1％（小数点以下切り捨て）)
//             }  else {
//                 endPoint += purchasePrice * 0.01; // 購入金額 * 1%
//             }
//         }
//         // 月末ポイント残高結果を出力する。
//         System.out.println(endPoint);
//     }
// }