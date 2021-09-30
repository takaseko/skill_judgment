package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C013 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //まず以下で入力受付
      int n = sc.nextInt(); // 1行目：嫌いな数字
      sc.nextLine(); // 改行
      int m = sc.nextInt(); // 2行目：病室の総数
      sc.nextLine(); // 改行
      // System.out.println(); // 入力受付確認済

      // 与えられた入力(病室の総数)をリストList<Integer>に格納する
      List<Integer> givenNumList = new ArrayList<>();
      for (int i = 0; i < m; i++) {
        givenNumList.add(sc.nextInt());
        sc.nextLine(); // 行送り
      }
      // System.out.println(givenNumList); // 病室の総数のリスト格納確認済

      // 結果の出力
      // 与えられた入力全件に対して以下の処理をする。
      int count = 0;
      String str = Integer.toString(n);
      for (Integer num : givenNumList) {
          // 嫌いな数字が含まれていない場合
          if (!Integer.toString(num).contains(str)) {
            System.out.println(num); 
            count++;
          } 
      }
          // 嫌いな数字が含まれている場合
          if (count == 0) {
              System.out.println("none");
          }

  }
}
    
    
    // else {                      // 嫌いな数字が含まれている場合
    //   System.out.println("none"); //←noneの箇所で躓く
    // }

  // // 結果の出力（高瀬）
  // // 入力を一時的に保持するList全件に対して処理を繰り返す。
          // for (List<Integer> integerList : list) {
          //   Collections.sort(integerList); // Collectionsクラスのsortメソッドでリストを昇順にする
          //   int ansNum = list.indexOf(integerList); // indexOf()メソッドでリストをインデックス番号で検索する
          //   if (r * 2 <= integerList.get(0)) { // ボールの直径より大きい箱を出力する
          //     System.out.println(ansNum); // 現状インデックス番号が「0」から出力 ←動作確認済
          //   }
          // }   