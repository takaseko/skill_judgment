package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C077 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int studentNum = sc.nextInt(); // 学生の人数
          int questNum = sc.nextInt(); // 問題数
          sc.nextLine(); // 改行
          // System.out.println(); // 入力受付確認

          List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
          // 学生の人数の数だけ処理を繰り返す。
          for (int i = 0; i < studentNum; i++) {
              String[] array = sc.nextLine().split(" "); // 入力例: -2 17 → {"-2", "17"}に変換
              // 配列の中身はString型なので、intに変換してListに格納する。
              List<Integer> tmpList = new ArrayList<>(); 
              tmpList.add(Integer.parseInt(array[0])); // 学生のレポート提出日
              tmpList.add(Integer.parseInt(array[1])); // 正解した問題数
              list.add(tmpList);
              // System.out.println(tmpList); // リストへの格納確認
          }
          
          // 結果の出力
          // 入力を一時的に保持するList全件に対して処理を繰り返す。
          for (List<Integer> target: list) {
            int fillingDate = target.get(0); // 学生のレポート提出日
            int correctNum = target.get(1); // 正解した問題数
            int allocation = 100 / questNum; // 1問の配点（100 / 問題数）

            //提出期限の評価減点に対する処理
            int finalScore = 0; // 最終的な点数を定義
            if (fillingDate <= 0) { // 提出期限内の場合、評価減点なし
                finalScore = correctNum * allocation; //（点数= 正解した問題数 * 1 * 1問の配点）
            } else if (1 <= fillingDate && fillingDate <= 9){ // 1日〜9日遅れの場合、元の得点の8割となる
                finalScore = (int) (correctNum * allocation * 0.8); //（点数= 正解した問題数 * 0.8 * 1問の配点）
            } else { // それ以外の場合（10日以上遅れた場合）0点となる
                //（点数= 正解した問題数に関係なく、0）
            }

            // 最終的な点数の評価に対する処理
            if (80 <= finalScore && finalScore <= 100) { // 点数が80点~100点の場合「A」と出力
                System.out.println("A");
            } else if (70 <= finalScore && finalScore <= 79) {  // 点数が70点~79点の場合「B」と出力
                System.out.println("B");
            } else if (60 <= finalScore && finalScore <= 69) {  // 点数が60点~69点の場合「C」と出力
                System.out.println("C");
            } else {  // それ以外（点数が0点~59点）の場合「D」と出力
                System.out.println("D");
            }
          }
    }
}
        //   // 結果の出力（高瀬）
        //   // 入力を一時的に保持するList全件に対して処理を繰り返す。
        //   for (int i = 0; i < list.size(); i++) {
        //       int fillingDate = list.get(i).get(0); // 学生のレポート提出日
        //       int correctNum = list.get(i).get(1); // 正解した問題数
        //       int allocation = 100 / questNum; // 1問の配点（100 / 問題数）

        //       //提出期限の評価減点に対する処理
        //       if (fillingDate <= 0) { // 提出期限内の場合、評価減点なし
        //           correctNum *= 1 * allocation; //（点数= 正解した問題数 * 1 * 1問の配点）
        //       } else if (1 <= fillingDate && fillingDate <= 9){ // 1日〜9日遅れの場合、元の得点の8割となる
        //           correctNum *= 0.8 * allocation; //（点数= 正解した問題数 * 0.8 * 1問の配点）
        //       } else { // それ以外の場合（10日以上遅れた場合）0点となる
        //           correctNum = 0; //（点数= 正解した問題数に関係なく、0）
        //       }
        //       // System.out.println(); //評価減点と点数の確認
              
        //       // 最終的な点数の評価に対する処理
        //       if (80 <= correctNum && correctNum <= 100) { // 点数が80点~100点の場合「A」と出力
        //           System.out.println("A");
        //       } else if (70 <= correctNum && correctNum <= 79) {  // 点数が70点~79点の場合「B」と出力
        //           System.out.println("B");
        //       } else if (60 <= correctNum && correctNum <= 69) {  // 点数が60点~69点の場合「C」と出力
        //           System.out.println("C");
        //       } else {  // それ以外（点数が0点~59点）の場合「D」と出力
        //         System.out.println("D");
        //       }
        //   }