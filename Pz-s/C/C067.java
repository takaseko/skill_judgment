package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C067 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1行目の入力を変数に代入する。
    int N = sc.nextInt(); // 対象の桁数
    int X = sc.nextInt(); // 出力する順番
    sc.nextLine();
    // System.out.println(); // 受付確認
    
    // 与えられた入力(対象の桁数)をリストList<Integer>に格納する
    List<Integer> givenNumList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        givenNumList.add(sc.nextInt());
        sc.nextLine(); // 行送り
      }
      // System.out.println(givenNumList); // 対象の桁数確認
    
    String binary = Integer.toBinaryString(X); // Xを2進数に変換してbinaryへ代入
    // System.out.println(binary); // 2進数変換確認
    int result = 0; // 最終的な結果
    
    // 与えられた入力全件に対して以下の処理をする。
    for (Integer num : givenNumList) {
        if (num == ) {
            // ポイント残高が運賃以上の場合
            pointBalance -= num; // ポイント残高から運賃を支払う
        } else {
            // それ以外の場合
            cashBalance -= num; // 現金残高から運賃を支払う
            pointBalance += num * 0.1; // 運賃の10%をポイントに加算する。
        }
        // 2進数の数値(binary)を出力する順番(givenNumList)に基づいて出力
    }
      String binary2 = binary.substring(binary.length() - num);
      System.out.println(binary2);
  }
}  