package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C022 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //まず以下で入力受付
      int n = sc.nextInt(); // 1行目：日数
      sc.nextLine(); // 改行
      // System.out.println(); // 日数の入力受付確認OK

      List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
          // 人数分の処理を繰り返す。
          for (int i = 0; i < n; i++) {
              String[] array = sc.nextLine().split(" "); // 入力例: 0 0 → {"0", "0"}に変換
              // 配列の中身はString型なので、intに変換してListに格納する。
              List<Integer> tmpList = new ArrayList<>(); 
              tmpList.add(Integer.parseInt(array[0])); // 株価（1番目の値）
              tmpList.add(Integer.parseInt(array[1])); // 株価（2番目の値）
              tmpList.add(Integer.parseInt(array[2])); // 株価（3番目の値）
              tmpList.add(Integer.parseInt(array[3])); // 株価（4番目の値）
              list.add(tmpList);
              //System.out.println(tmpList); // 結果の格納確認OK
          }

          // 結果の出力
          // 入力を一時的に保持するList全件に対して処理を繰り返す。
          for (int i = 0; i < list.size(); i++) {
              int firstPrice = list.get(i).get(0); // 株価（1番目の値）
              int secondPrice = list.get(i).get(1); // 株価（2番目の値）
              int thirdPrice = list.get(i).get(2); // 株価（3番目の値）
              int fourthPrice = list.get(i).get(3); // 株価（4番目の値）

              // // 株価（始値）を出力
              // if (Arrays.asList(firstPrice).contains()) {
              //   System.out.println();  
              // }
              // // 株価（終値）を出力
              // if (Arrays.asList(secondPrice).contains()) {
              //   System.out.println();
              // }
              // // 株価（高値）を出力
              // if () { //条件の検討がつかない
              //   System.out.println(Collections.max(list));
              // }
              // // 株価（安値）を出力
              // if () { //条件の検討がつかない
              //   System.out.println(Collections.min(list));
              // }
          }
  }
}
