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

// ●問題2
// ・Listの中身を全て足して合計を出力する。
// List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
// 期待する出力
// 1500

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

// ●問題3
// ・奇数か偶数かを出力する。
// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// 期待する出力
// 奇数
// 偶数
// 奇数
// 偶数
// 奇数
// 偶数
// 奇数
// 偶数
// 奇数
// 偶数

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

// ●問題4
// ・20以上、50以下の値を全て出力する
// List<Integer> list = Arrays.asList(100, 56, 27, 83, 42);
// 期待する出力
// 27
// 42

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

// - D120
// public class task1 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in); //値を変数listへ格納
//     int n = sc.nextInt(); //list全てに対して処理を繰り返す
//     sc.nextLine();   //N変数にlist取得結果を代入
//     System.out.println(n * 12);  //Nに1ダース12本掛ける
//     }
// }

// // - C051
// public class task1 {
//   public static void main(String[] args) {
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

// - D038 
// キーワード
// java 総当り
// public class task1 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
//     int N = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得する→N変数へ代入
//     sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
//     for (int i = 0; i < 1; i++) {
//       System.out.println(N * (N - 1) / 2);  //自分自身から見た結果と、相手側から見た結果を出力
//     }    
//   }
// }

//- C055
// public class task1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // 1行目
//         sc.nextLine();
//         String str = sc.nextLine(); // ai

//         // 与えられた文字列のリスト
//         List<String> givenStrList = new ArrayList<>(); // [pizza, paiza, aizu, ai, sai]
//         for (int i = 0; i < n; i++) {
//             givenStrList.add(sc.nextLine());
//         }

//         int count = 0;
//         for (String s : givenStrList) {
//             if (s.contains(str)) {
//                 System.out.println(s);
//                 count++;
//             }
//         }
//         if (count == 0) {
//             System.out.println("None");
//         }
//     }
// }

// - D012 
// public class task1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
//         int n = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得する →変数nへ代入
//         sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
          
//         for (int i = 0; i < 1; i++) {
//         System.out.println(Math.abs(n));  //変数nの絶対値の結果を出力
//       }    
//     }
//   }

// - C023
// public class C023 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // 1行目
//         sc.nextLine();
//         String str = sc.nextLine(); // ai

//         // 与えられた文字列のリスト
//         List<String> givenStrList = new ArrayList<>(); // [pizza, paiza, aizu, ai, sai]
//         for (int i = 0; i < n; i++) {
//             givenStrList.add(sc.nextLine());
//         }

//         int count = 0;
//         for (String s : givenStrList) {
//             if (s.contains(str)) {
//                 System.out.println(s);
//                 count++;
//             }
//         }
//         if (count == 0) {
//             System.out.println("None");
//         }
//     }
// }