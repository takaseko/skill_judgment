package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C056 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); // 学生の人数
          int m = sc.nextInt(); // 合格点
          sc.nextLine(); // 改行

          List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
          // 学生の人数の数だけ処理を繰り返す。
          for (int i = 0; i < n; i++) {
              String[] array = sc.nextLine().split(" "); // 入力例: 80 11 → {"80", "11"}に変換
              // 配列の中身はString型なので、intに変換してListに格納する。
              List<Integer> tmpList = new ArrayList<>(); 
              tmpList.add(Integer.parseInt(array[0])); // テストの点数
              tmpList.add(Integer.parseInt(array[1])); // 欠席回数
              list.add(tmpList);

            System.out.println(tmpList);
          }
          
          // 結果の出力
          // 入力を一時的に保持するList全件に対して処理を繰り返す。
          for (int i = 0; i < list.size(); i++) {
              int score = list.get(i).get(0); // テストの点数
              int absenceCount = list.get(i).get(1); // 欠席回数
              int finalScore = score - (absenceCount * 5); // 最終的な点数 テストの点数 - (欠席回数 * 5)
              if (finalScore < 0) {
                  // 最終的な点数が0未満(マイナス)の場合は0点とする。
                  finalScore = 0;
              }
              // 最終的な点数が合格点m 以上の場合
              boolean isPassed = m <= finalScore;
              if (isPassed) {
                  // 学籍番号を出力する(index + 1)
                  System.out.println(i + 1);
              }
          }
      }
}

// C056_2 List<Data>みたいな形でclassに格納された状態で処理する方法

// package com.paiza.paiza_c;
// ​
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// ​
// class Data {
//     Integer id;
//     Integer score;
//     Integer absenceCount;
// ​
//     public Integer getId() {
//         return id;
//     }
// ​
//     public void setId(Integer id) {
//         this.id = id;
//     }
// ​
//     public Integer getScore() {
//         return score;
//     }
// ​
//     public void setScore(Integer score) {
//         this.score = score;
//     }
// ​
//     public Integer getAbsenceCount() {
//         return absenceCount;
//     }
// ​
//     public void setAbsenceCount(Integer absenceCount) {
//         this.absenceCount = absenceCount;
//     }
// }
// ​
// public class C056_2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         sc.nextLine();
// ​
//         List<Data> list = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             String[] array = sc.nextLine().split(" ");
//             Data tempData = new Data();
//             tempData.setId(i + 1);
//             tempData.setScore(Integer.parseInt(array[0]));
//             tempData.setAbsenceCount(Integer.parseInt(array[1]));
//             list.add(tempData);
//         }
// ​
//         for (Data data : list) {
//             int score = data.getScore();
//             int absenceCount = data.getAbsenceCount();
//             int finalScore = score - (absenceCount * 5);
//             if (finalScore < 0) {
//                 finalScore = 0;
//             }
//             boolean isPassed = m <= finalScore;
//             if (isPassed) {
//                 System.out.println(data.getId());
//             }
//         }
//     }
// }