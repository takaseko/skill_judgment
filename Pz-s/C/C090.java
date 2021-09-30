package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

// パターン①
public class C090 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          //以下で入力受付
          String S = sc.nextLine(); //変換する前の値
          // System.out.println(s); // 入力受付確認済
  
          List<String> num = new LinkedList<>(); //String型、LinkedListにしている
          Collections.addAll(num, "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"); // Collections.addAllで数値リストを追加
  
          List<Integer> distance = new LinkedList<>();
          Collections.addAll(distance, 12, 3, 4, 5, 6, 7, 8, 9, 10, 11); // Collections.addAllで距離リストを追加
  
          List<String> strList = new ArrayList<>(Arrays.asList(S.replace("-", "").split(""))); // 与えられた文字列をArrayListに変換
  
          // index番号によってnumのList と distanceのリストの付け合せを行っている
          int count = 0; // 合計
          for (String str : strList) {
              int index = num.indexOf(str);
              int value = distance.get(index);
  
              count += value * 2;
          }
          System.out.print(count);
      }
  }

// パターン②（Map）
// public class C090_2 {
//       public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           String S = sc.nextLine(); //変換する前の値
  
//           Map<String, Integer> map = new HashMap<>();
//           map.put("0", 12);
//           map.put("1", 3);
//           map.put("2", 4);
//           map.put("3", 5);
//           map.put("4", 6);
//           map.put("5", 7);
//           map.put("6", 8);
//           map.put("7", 9);
//           map.put("8", 10);
//           map.put("9", 11);
  
//           String[] strArray = S.replace("-", "").split("");
  
//           int count = 0; // 合計
//           for (String str : strArray) {
//               count += map.get(str) * 2;
//           }
//           System.out.print(count);
//       }
//   }

  
// パターン③（高瀬）
// public class C090 {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       //以下で入力受付
//       String S = sc.nextLine(); //変換する前の値
//       // System.out.println(s); // 入力受付確認済

//       List<Integer> num = new ArrayList<Integer>();
//       Collections.addAll(num, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9); // Collections.addAllで数値リストを追加
      
//       List<Integer> distance = new ArrayList<Integer>();
//       Collections.addAll(distance, 12, 3, 4, 5, 6, 7, 8, 9, 10, 11); // Collections.addAllで距離リストを追加
    
//       // List<String> strList = new ArrayList<>(Arrays.asList(S.split(""))); // 与えられた文字列をArrayListに変換
//       // // ハイフンを覗いた文字列の出力
//       // for (String str : strList) {
//       //   if (str.contains(num)) {

//       //   }
//       //   System.out.print(str.replace("-", ""));
//       // }
//     }
// }