package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C051 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split(" ");
    List<String> list = Arrays.asList(str);
    List<List<String>> result = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
        Collections.swap(list, 0, i); // 入れ替え
        for (int j = 1; j < list.size(); j++) {
            Collections.swap(list, 1, j); // 入れ替え
            for (int k = 2; k < list.size(); k++) {
                Collections.swap(list, 2, k); // 入れ替え
                List<String> copyList = new ArrayList<>(list);
                if (!result.contains(copyList)) {
                    result.add(copyList);
                }
                Collections.swap(list, 2, k); // 元に戻す
            }
            List<String> copyList = new ArrayList<>(list);
            if (!result.contains(copyList)) {
                result.add(copyList);
            }
            Collections.swap(list, 1, j); // 元に戻す
        }
        List<String> copyList = new ArrayList<>(list);
        if (!result.contains(copyList)) {
            result.add(copyList);
        }
        Collections.swap(list, 0, i); // 元に戻す
    }

    int max = 0; // 最大値
    for (List<String> stringList : result) {
        int left = Integer.parseInt(stringList.get(0) + stringList.get(1));
        int right = Integer.parseInt(stringList.get(2) + stringList.get(3));
        int sum = left + right;

        if (max < sum) {
            max = sum;
        }
    }
    System.out.println(max);
  }
}

//     Scanner sc = new Scanner(System.in);
//     // 1行目の入力を変数に代入する。
//     int n1 = sc.nextInt(); // 左から2枚のカード
//     int n2 = sc.nextInt(); // 右から2枚のカード
//     String line = sc.nextLine(); //nextLine()メソッドでユーザがキーボードから入力した値を1行読み取り

//     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); //1〜9までの値を変数listへ格納
//     for (int i = 0; i < list.size(); i++) { //list全てに対して処理を繰り返す
//       int sum = list.get(i); //Sumにlist取得結果を代入
//       if () { //1〜9まで変数n1と変数n2の和を求める条件
//         System.out.println();  //1〜9まで変数n1と変数n2の和をを出力
//       }
//     }
//   }
// }