package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C021 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //まず以下で入力受付
      int xc = sc.nextInt(); // 1行目：中心の座標1
      int yc = sc.nextInt(); // 1行目：中心の座標2
      int r1 = sc.nextInt(); // 1行目：半径1
      int r2 = sc.nextInt(); // 1行目：半径2
      sc.nextLine(); // 改行
      int n = sc.nextInt(); // 2行目：人の数
      sc.nextLine(); // 改行

      // System.out.println(); // 中心の座標、半径、人の数nの入力受付確認OK

      List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
          // 人数分の処理を繰り返す。
          for (int i = 0; i < n; i++) {
              String[] array = sc.nextLine().split(" "); // 入力例: 0 0 → {"0", "0"}に変換
              // 配列の中身はString型なので、intに変換してListに格納する。
              List<Integer> tmpList = new ArrayList<>(); 
              tmpList.add(Integer.parseInt(array[0])); // 座標結果1
              tmpList.add(Integer.parseInt(array[1])); // 座標結果2
              list.add(tmpList);
              // System.out.println(tmpList); // 座標結果の格納確認OK
          }

          // 結果の出力
          // 入力を一時的に保持するList全件に対して処理を繰り返す。
          for (List<Integer> integerList : list) {
            double target = Math.pow(integerList.get(0) - xc, 2) + Math.pow(integerList.get(1) - yc, 2);
            boolean cond1 = Math.pow(r1, 2) <= target;
            boolean cond2 = target <= Math.pow(r2, 2);

            if (cond1 && cond2) {
                System.out.println("yes");
            } else { // 暴風域に該当しない場合
                System.out.println("no");
            }
          }
    }
}


          // // 結果の出力（高瀬）
          // // 入力を一時的に保持するList全件に対して処理を繰り返す。
          // for (List<Integer> integerList : list) {
          //   if ((r1 * r1) <= (xc * xc) && (yc * yc) <= (r2 * r2) == integerList.get(0)) { // 暴風域の条件に該当する場合
          //           System.out.println("yes");
          //       } else { // 暴風域に該当しない場合
          //           System.out.println("no");
          //   }
          // }