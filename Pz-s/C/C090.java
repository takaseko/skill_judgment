package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C090 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //以下で入力受付
      String S = sc.nextLine(); //変換する前の値
      // System.out.println(s); // 入力受付確認済

      List<Integer> num = new ArrayList<Integer>();
      Collections.addAll(num, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9); // Collections.addAllで数値リストを追加
      
      List<Integer> distance = new ArrayList<Integer>();
      Collections.addAll(distance, 12, 3, 4, 5, 6, 7, 8, 9, 10, 11); // Collections.addAllで距離リストを追加
    
      // List<String> strList = new ArrayList<>(Arrays.asList(S.split(""))); // 与えられた文字列をArrayListに変換
      // // ハイフンを覗いた文字列の出力
      // for (String str : strList) {
      //   if (str.contains(num)) {

      //   }
      //   System.out.print(str.replace("-", ""));
      // }
    }
}

      // // 数値リスト要素を指定して距離リスト数値へ上書き
      // Integer distance1 = num.set(0, 24);
      // Integer distance2 = num.set(1, 6);
      // Integer distance3 = num.set(2, 8);
      // Integer distance4 = num.set(3, 10);
      // Integer distance5 = num.set(4, 12);
      // Integer distance6 = num.set(5, 14);
      // Integer distance7 = num.set(6, 16);
      // Integer distance8 = num.set(7, 18);
      // Integer distance9 = num.set(8, 20);
      // Integer distance10 = num.set(9, 22);

      // System.out.println(distance1);

            // int finalNumDis = 0; // 総距離の初期化
      // for (Integer numDis : distance) {
      //   numDis *= 2;
      //   // System.out.println(numDis); 各距離×2の確認済み
      // }

      // int toalDistance = 0;
      // for (Integer str : distance) {
      //   System.out.println(toalDistance + ":" + str);
      //   toalDistance++;
      // }