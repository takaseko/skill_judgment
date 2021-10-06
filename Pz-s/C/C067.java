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
    int X = sc.nextInt(); // 対象の数値
    sc.nextLine();
    // System.out.println(); // 受付確認
    
    // 与えられた入力(対象の桁数)をリストList<Integer>に格納する
    List<Integer> givenNumList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        givenNumList.add(sc.nextInt());
        sc.nextLine(); // 行送り
      }
      // System.out.println(givenNumList); // 対象の桁数確認
    
    String binary = Integer.toBinaryString(X); // toBinaryStringメソッドで、Xを2進数に変換してbinaryへ代入
    // System.out.println(binary); // 2進数変換確認
    
    // 与えられた入力全件に対して以下の処理をする。
    for (Integer num : givenNumList) {
        // 2進数の数値(binary)を、出力する順番(リスト)に基づいて出力
        char result = binary.charAt(binary.length() - num); // charAtメソッドを使用して、右から出力する順番（リスト）の文字を切り出して、変数(result)へ代入
        System.out.println(result); // 結果を出力
    }
  }
}  

// // 山岡さん
// public class C067 {
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       // 1行目の入力を変数に代入する。
//       int N = sc.nextInt(); // 対象の桁数
//       int X = sc.nextInt(); // 対象の数値
//       sc.nextLine();

//       List<Integer> givenNumList = new ArrayList<>();
//       for (int i = 0; i < N; i++) {
//           givenNumList.add(sc.nextInt());
//           sc.nextLine(); // 行送り
//       }

//       List<String> binary = Arrays.asList(Integer.toBinaryString(X).split(""));
//       Collections.reverse(binary);

//       for (Integer num : givenNumList) {
//           String result = binary.get(num - 1);
//           System.out.println(result);
//       }
//   }
// }