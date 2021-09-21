// import java.util.List;
// import java.util.*;
// import java.util.Scanner;

// // ●問題1
// // ・Listの中身を全て出力する。
// // List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
// // 期待する出力
// // 100
// // 200
// // 300
// // 400
// // 500

// public class task1 {
//   public static void main(String[] args) {
//     List<Integer> list = Arrays.asList(100, 200, 300, 400, 500); //値を変数listへ格納
//     for (int i = 0; i < list.size(); i++) { //list全てに対して処理を繰り返す
//       System.out.println(list.get(i)); //list全ての値を出力
//     }
//   }
// }

// // ●問題2
// // ・Listの中身を全て足して合計を出力する。
// // List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
// // 期待する出力
// // 1500

// public class task1 {
//   public static void main(String[] args) {
//     List<Integer> list = Arrays.asList(100, 200, 300, 400, 500); //値を変数listへ格納
//     int sum = 0; //変数sumの初期化
//     for (int i = 0; i < list.size(); i++) { //list全てに対して処理を繰り返す
//      sum += list.get(i);  //合計値を取得
//     }
//     System.out.println(sum); //合計値を出力
//   }
// }

// // ●問題3
// // ・奇数か偶数かを出力する。
// // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// // 期待する出力
// // 奇数
// // 偶数
// // 奇数
// // 偶数
// // 奇数
// // 偶数
// // 奇数
// // 偶数
// // 奇数
// // 偶数

// public class task1 {
//   public static void main(String[] args) {
//     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //値を変数listへ格納
//     for (int i = 0; i < list.size(); i++) { //list全てに対して処理を繰り返す
//       int num = list.get(i); //num変数にlist取得結果を代入
//       if (num % 2 == 0 ) { //2で割った値が0なら偶数、それ以外は奇数の条件で出力
//         System.out.println("偶数"); //偶数を出力
//       } else {
//         System.out.println("奇数"); //奇数を出力
//       }
//     }
//   }
// }

// // ●問題4
// // ・20以上、50以下の値を全て出力する
// // List<Integer> list = Arrays.asList(100, 56, 27, 83, 42);
// // 期待する出力
// // 27
// // 42

// public class task1 {
//   public static void main(String[] args) {
//     List<Integer> list = Arrays.asList(100, 56, 27, 83, 42); //値を変数listへ格納
//     for (int i = 0; i < list.size(); i++) { //list全てに対して処理を繰り返す
//       int num = list.get(i); //num変数にlist取得結果を代入
//       if (num >= 20 && num <= 50 ) { //20以上、50以下の値の条件で出力
//         System.out.println(num); 
//       } 
//     }
//   }
// }