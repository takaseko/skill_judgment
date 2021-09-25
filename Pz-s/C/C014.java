package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C014 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //まず以下で入力受付
      int n = sc.nextInt(); // 1行目：箱数
      int r = sc.nextInt(); // 1行目：半径
      sc.nextLine(); // 改行
      // System.out.println(); // 箱数、半径の入力受付確認OK

      List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
          // 箱数の処理を繰り返す。
          for (int i = 0; i < n; i++) {
              String[] array = sc.nextLine().split(" "); // 入力例: 0 0 → {"0", "0"}に変換
              // 配列の中身はString型なので、intに変換してListに格納する。
              List<Integer> tmpList = new ArrayList<>(); 
              tmpList.add(Integer.parseInt(array[0])); // 箱の高さ(h)、幅(w)、奥行き(d)
              tmpList.add(Integer.parseInt(array[1])); // 箱の高さ(h)、幅(w)、奥行き(d)
              tmpList.add(Integer.parseInt(array[2])); // 箱の高さ(h)、幅(w)、奥行き(d)
              list.add(tmpList);
              // System.out.println(tmpList); // 箱数結果の格納確認OK
          }

           // 結果の出力
          // 入力を一時的に保持するList全件に対して処理を繰り返す。
          int i = 1; // 初期値を1にする
          for (List<Integer> integerList : list) {
              Collections.sort(integerList); // Collectionsクラスのsortメソッドでリストを昇順にする
              if (r * 2 <= integerList.get(0)) { // ボールの直径より大きい箱をインデックス番号1より出力する
                  System.out.println(i); 
              }
              i++;
          }
    }
}


          // // 結果の出力（高瀬）
          // // 入力を一時的に保持するList全件に対して処理を繰り返す。
          // for (List<Integer> integerList : list) {
          //   Collections.sort(integerList); // Collectionsクラスのsortメソッドでリストを昇順にする
          //   int ansNum = list.indexOf(integerList); // indexOf()メソッドでリストをインデックス番号で検索する
          //   if (r * 2 <= integerList.get(0)) { // ボールの直径より大きい箱を出力する
          //     System.out.println(ansNum); // 現状インデックス番号が「0」から出力 ←動作確認済
          //   }
          // }   