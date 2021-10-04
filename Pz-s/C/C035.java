package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C035 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt(); // 1行目：受験者 
    sc.nextLine(); // 改行
    // System.out.println(); // 受付入力確認済

    List<List<String>> list = new ArrayList<>(); // 与えられた文字列のリスト
    for (int i = 0; i < N; i++) {
      String str = sc.nextLine();
      String array[] = str.split(" ");
      list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
    }
    // System.out.println(list); リスト格納確認済

    // 変数1,2を初期化
    int val1 = 0;
    int val2 = 0;
    // 与えられた入力全件に対して以下の処理をする 例)[[s 70 78 82 57 74]]
    for (List<String> subList : list) {
        // 全科目合計が350点以上の場合
        if ("SET".equals(subList.get(0))) {
            // 1の場合
            if ("1".equals(subList.get(1))) {
              val1 = Integer.parseInt(subList.get(2));// 変数1に値を代入する
            }
            // 2の場合
            if ("2".equals(subList.get(1))) {
              val2 = Integer.parseInt(subList.get(2));// 変数2に値を代入する
            }
        }
        // 文字列がADDの場合
        if ("ADD".equals(subList.get(0))) {
          val2 = val1 + Integer.parseInt(subList.get(1)); // 「変数 1 の値 + a」を計算し、計算結果を変数 2 に代入する
        }
        // 文字列がSUBの場合
        if ("SUB".equals(subList.get(0))) {
          val2 = val1 - Integer.parseInt(subList.get(1));// 「変数 1 の値 - a」を計算し、計算結果を変数 2 に代入する
        }
    }
    System.out.println(val1 + " " + val2);
  }
}