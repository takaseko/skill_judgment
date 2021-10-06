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

    // 与えられた文字列のリスト
    List<List<String>> list = new ArrayList<>(); 
    for (int i = 0; i < N; i++) {  // 受験者分繰り返す
      String str = sc.nextLine();
      String array[] = str.split(" ");
      list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
    }
    // System.out.println(list); リスト格納確認済
    
    int allSub = 0; // 全科目を初期化
    int s = 0; // 理系科目を初期化
    int l = 0; // 文系科目を初期化
    int passTest = 0; // 試験通過した人数を初期化
    
    // 与えられた入力全件に対して以下の処理をする 例)[[s 70 78 82 57 74]]
    for (List<String> subList : list) {
      // if文を入れ子にして記述
      // 全科目合計が350点以上の場合
      allSub = Integer.parseInt(subList.get(1)) + Integer.parseInt(subList.get(2)) + Integer.parseInt(subList.get(3)) + Integer.parseInt(subList.get(4)) + Integer.parseInt(subList.get(5)); // 全ての科目を足した結果を変数allSubに代入
      if (350 <= allSub) {

        // 文字列がs（理系）の場合
        if ("s".equals(subList.get(0))) {
          s = Integer.parseInt(subList.get(2)) + Integer.parseInt(subList.get(3)); // 「数学、理科」の足した結果を変数sに代入
          // 数学,理科の合計が160点以上の場合
          if (160 <= s) {
            passTest += 1; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
          }
        }
        
        // 文字列がl（文系）の場合
        if ("l".equals(subList.get(0))) {
          l = Integer.parseInt(subList.get(4)) + Integer.parseInt(subList.get(5)); // 「国語、地理歴史」の足した結果を変数lに代入
          // 国語,地理歴史の合計が160点以上の場合
          if (160 <= l) {
            passTest += 1; // 全科目合計が350点以上、かつ国語,地理歴史の合計が160点以上で試験通過した人を変数(passTest)へ足す
          }
        }
      }
    }
    // for文内で条件処理して、最終的に試験通過した人数をfor文の外で出力
    System.out.println(passTest);
  }
}


// int english = 0;
// int math = 0;
// int science = 0;
// int natLan = 0;
// int geoHis = 0;