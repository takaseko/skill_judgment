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

    // 与えられた文字列のリスト（正解数、解答）
    List<List<String>> list = new ArrayList<>(); 
    for (int i = 0; i < N; i++) {  // 問題数分繰り返す
      String str = sc.nextLine();
      String array[] = str.split(" ");
      list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
    }
    // System.out.println(list); // リスト格納確認済
  
    int totalPoints = 0; // 合計点数
    // int differ = 0; // 間違い時の点数
    
    // 与えられた入力全件に対して以下の処理をする 例)[[apple, aple]]
    for (List<String> subList : list) {
      // 解答が完全一致の場合 +2点
      if (subList.get(0).equals(subList.get(1))) {
            totalPoints += 2; // 合計点数を変数(totalPoints)へ足す
      } else if (subList.get(0).length() != subList.get(1).length()) { // 解答の長さが違う場合
        totalPoints += 0; // 足される点数はなし（0点）
      } else if (subList.get(0).length() == subList.get(1).length()) { // 解答が1文字違いの場合 +1点
        totalPoints += 1; // 1文字違い時の点数を変数(totalPoints)へ足す
      // それ以外（解答が2文字以上違う）場合
      } else { 
        totalPoints += 0; // 足される点数はなし（0点）
      } 
      System.out.println(totalPoints);
    }
    // for文内で条件処理して、最終的な合計点数をfor文の外で出力
    System.out.println(totalPoints);
  }
}



// for (List<String> subList2 : list) {
//   // 解答の長さが違う場合
//   if (subList2.get(0).length() != subList2.get(1).length()) { 
//     differ += 0; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
//   } 
  
//   if (subList2.get(0).length() == subList2.get(1).length()) { // 解答が一文字違いの場合
//     differ -= 1; // 以上で間違い時の点数を変数(differ)へ足す
//   } else { // それ以外（解答が2文字以上違う）場合
//     differ += 0;
//   } 
// }


// // if文を記述（入れ子のパターン）
// // 解答が完全一致の場合
// if (subList.get(0).equals(subList.get(1))) {
//       totalPoints += 2; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
// } else if (subList.get(0).length() != subList.get(1).length()) { // 解答の長さが違うの場合
//   totalPoints += 0; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
// } else if (subList.get(0).length() == subList.get(1).length()) { // 解答が一文字違いの場合
//   totalPoints += 1; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
// } else { // それ以外（解答が2文字以上違う）場合
//   totalPoints += 0;
// }      