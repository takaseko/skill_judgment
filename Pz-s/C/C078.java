package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C078 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 1行目：株を売買する日数
    int c_1 = sc.nextInt(); // 1行目：株の売買条件1
    int c_2 = sc.nextInt(); // 1行目：株の売買条件2
    sc.nextLine();
    // System.out.println(); // 入力受付確認済
    
    // 株を売買する日数だけ処理を繰り返す。
    // 与えられた入力(株を売買する日数)をリストList<Integer>に格納する
    List<Integer> givenNumList = new ArrayList<>();
    for (int i = 0; i < N; i++) { 
      givenNumList.add(sc.nextInt());
      if (i != N - 1) { // 最後の行では行送りしない記述
          sc.nextLine(); 
      }
    }
    //System.out.println(givenNumList); // 株を売買する日数の株価出力確認済
    
    // 結果の出力
      // 入力を一時的に保持するList全件に対して処理を繰り返す。
      int stock = 0; // 持ち株
      int profit = 0; // 損益
      int loopCount = 1; // ループ回数を定義（ループが最終行か判定する処理に必要）
      // 与えられた入力全件に対して以下の処理をする。
      for (Integer num : givenNumList) {
          //最終日の場合
          //（最終日の処理は、for文の頭に持ってくる必要あり、下の方にあると、他のif文の処理に入るため）
          if (loopCount == N) {
              // 持ち株を全て売ってループ終了
              profit += num * stock;
              break;
          }

          // 株価が c_1 円以下の場合 （株の売買条件1）
          if (num <= c_1) {
              stock++; // 1株買う
              profit -= num; // 損失を計上する
          }

          // 株価が c_2 円以上の場合（株の売買条件2）
          if (num >= c_2 ) {
              profit += num * stock; // 持ち株「を」すべて売る
              stock = 0; // 持ち株を初期化（全て売ると0になるため）
          }

          loopCount++; // インクリメント
      }
      System.out.println(profit); // 最終損益取得
    }
}

// 備考
// ・処理をかく場合は、まず細分化して1つずつ処理を書くこと
// ・紙に書いて計算したこと（言語化したもの）、その手順をコードに落とし込む


//     // 結果の出力（高瀬）
//     // 入力を一時的に保持するList全件に対して処理を繰り返す。
//     int stock = 0; // 持ち株
//     int profit = 0; // 損益
//     int tradeConditionsOne = c_1; // 株の売買条件1
//     int tradeConditionsTwo = c_2; // 株の売買条件2
//     int loopCount = 1; // ループ回数を定義（ループが最終行か判定する処理のため）
//     // 与えられた入力全件に対して以下の処理をする。
//     for (Integer num : givenNumList) {

//         // 株価が c_1 円以下の場合 （株の売買条件1）
//         if (num <= tradeConditionsOne) { 
//           stock -= num; // 1株買う
//         } 
        
//         // 株価が c_2 円以上の場合（株の売買条件2）
//         if (num >= tradeConditionsTwo ) { 
//           stock += num * 2; // 持ち株「を」すべて売る
//           stock = 0;
//         } 
        
//         // 株価が c_1 円、c_2 円の間の場合
//         if (tradeConditionsOne <= num && num <= tradeConditionsTwo) { 
//           stock = num; // 株の売買はなし
//         }

//         //最終日の場合
//         if (loopCount == N) { 
//           // 持ち株を全て売ってループ終了
//           profit += num * stock;
//           break;
//         }
//         loopCount++;
//         // System.out.println(profit); // 最終損益取得
//     }
//     System.out.println(profit); // 最終損益取得
//   }
// }  
        // // 株価が c_2 円以上の場合（株の売買条件2）
        // if (num >= tradeConditionsTwo ) {
        //     stock += num; // 持ち株「を」すべて売る
        // } 

        // // 株価が c_1 円、c_2 円の間の場合は、株の売買はなし
        // if (tradeConditionsOne <= num && num <= tradeConditionsTwo) {
        //     stock = num;
        // }
        // // 損益を出力する。
        // System.out.println(stock);
    
    // // 与えられた入力全件に対して以下の処理をする。
    // for (Integer num : givenNumList) {
    //     if (num <= pointBalance ) {
    //         // ポイント残高が運賃以上の場合
    //         pointBalance -= num; // ポイント残高から運賃を支払う
    //     } else {
    //         // それ以外の場合
    //         cashBalance -= num; // 現金残高から運賃を支払う
    //         pointBalance += num * 0.1; // 運賃の10%をポイントに加算する。
    //     }
    //     // 現在の現金残高、ポイント残高を出力する。
    //     System.out.println(cashBalance + " " + pointBalance);
    // }
//   }
// }  