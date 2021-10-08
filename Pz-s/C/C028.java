package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C028 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt(); // 1行目：問題数 
    sc.nextLine(); // 改行
    // System.out.println(); // 受付入力確認済

    // 与えられた文字列のリスト
    List<List<String>> list = new ArrayList<>(); 
    for (int i = 0; i < N; i++) {  // 問題数分繰り返す
      String str = sc.nextLine();
      String array[] = str.split(" ");
      list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
    }
    // System.out.println(list); // リスト格納確認済
    
    String perfect; // 完全一致の文字列を初期化
    int s = 0; // 理系科目を初期化
    int l = 0; // 文系科目を初期化
    int passTest = 0; // 試験通過した人数を初期化
    
    // 与えられた入力全件に対して以下の処理をする 例)[[apple, aple]]
    for (List<String> subList : list) {
      // if文を入れ子にして記述
      // 解答が完全一致の場合
      // 全ての科目を足した結果を変数allSubに代入
      if (subList.equals(subList)) {
            passTest += 2; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
      }
        
      // 解答が一文字違いの場合
      if (subList) {
        passTest += 1; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
  }
    }
    // for文内で条件処理して、最終的に試験通過した人数をfor文の外で出力
    System.out.println(passTest);
  }
}