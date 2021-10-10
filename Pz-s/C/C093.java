package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C093 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] array = sc.nextLine().split(" ");

    int bob = getResult(array[0].split(""));
    int alice = getResult(array[1].split(""));

    if (bob < alice) {
        System.out.println("Alice");
    } else if (alice < bob){
        System.out.println("Bob");
    } else {
        System.out.println("Draw");
    }
  }

  public static int getResult(String[] array) {
      int sum;
      if (1 < array.length) {
          sum = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
      } else {
          sum = Integer.parseInt(array[0]);
      }

      String sumStr = String.valueOf(sum);
      if (sumStr.length() == 1) {
          return Integer.parseInt(sumStr);
      } else {
          return Integer.parseInt(sumStr.substring(1));
      }
  }
}





//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //まず以下で入力受付
//         int X = sc.nextInt(); // 点数（男性）
//         int Y = sc.nextInt(); // 点数（女性）
//         sc.nextLine(); // 改行
//         // System.out.println(); // 受付確認
        
//         List<List<Integer>> Xlist = new ArrayList<>(); // 入力を一時的に保持するList
//             // 子カードを枚数だけ処理を繰り返す。
//             for (int i = 0; i < 1; i++) {
//                 List<Integer> X = new ArrayList<>(); 
//                 X.add(Integer.parseInt(array[0])); // 子カード1つ目の番号
//                 X.add(Integer.parseInt(array[1])); // 子カード2つ目の番号
//                 Xlist.add(X);
//                 System.out.println(); // 子カードの格納確認OK
//             }
        
//         //     // 結果の出力
//         //     // 入力を一時的に保持するList全件に対して処理を繰り返す。
//         //     for (List<Integer> integerList : list) {
//           //         if (a > integerList.get(0)) { // 1つ目の番号で親カードが大きい場合
//         //             System.out.println("High");
//         //         }
        
//         //         if (a < integerList.get(0)) { // 1つ目の番号で親カードが小さい場合
//           //             System.out.println("Low");
//           //         }
          
//         //         if (a == integerList.get(0)) { // 1つ目の番号で親カードと同じで、2つ目の番号で親カードが大きい場合と小さい場合
//           //             if (b < integerList.get(1)) {
//             //                 System.out.println("High");
//             //             } else {
//         //                 System.out.println("Low");
//         //             }
//         //         }
//         //     }
//       }
// }