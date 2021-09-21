// import java.util.List;
// import java.util.ArrayList;
// import java.util.*;
// import java.util.Scanner;

// public class C024 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n  = sc.nextInt(); // 1行目：命令の個数 
//     sc.nextLine();

//     List<List<String>> list = new ArrayList<>(); // 与えられた文字列のリスト
//     for (int i = 0; i < n; i++) {
//       String str = sc.nextLine();
//       String array[] = str.split(" ");
//       list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
//     }

//     // System.out.println(list);

//     // 変数1,2を初期化
//     int val1 = 0;
//     int val2 = 0;
//     // 与えられた入力全件に対して以下の処理をする 例)[[SET, 1, 10], [SET, 2, 20], [ADD, 40]]
//     for (List<String> list2 : list) {
//         // 文字列がSETの場合
//         if ("SET".equals(list2.get(0))) {
//             // 1の場合
//             if ("1".equals(list2.get(1))) {
//               val1 = Integer.parseInt(list2.get(2));// 変数1に値を代入する
//             }
//             // 2の場合
//             if ("2".equals(list2.get(1))) {
//               val2 = Integer.parseInt(list2.get(2));// 変数2に値を代入する
//             }
//         }
//         // 文字列がADDの場合
//         if ("ADD".equals(list2.get(0))) {
//           val2 = val1 + Integer.parseInt(list2.get(1)); // 「変数 1 の値 + a」を計算し、計算結果を変数 2 に代入する
//         }
//         // 文字列がSUBの場合
//         if ("SUB".equals(list2.get(0))) {
//           val2 = val1 - Integer.parseInt(list2.get(1));// 「変数 1 の値 - a」を計算し、計算結果を変数 2 に代入する
//         }
//     }
//     System.out.println(val1 + " " + val2);
//   }
// }

//          // 高瀬記述
// //       Scanner sc = new Scanner(System.in);
// //       int n  = sc.nextInt(); // 1行目：命令の個数 
// //       sc.nextLine();
// //       String order1 = sc.nextLine(); // 2行目：命令1
// //       String order2 = sc.nextLine(); // 3行目：命令2
// //       String order3 = sc.nextLine(); // 4行目：命令3
// //       sc.nextLine();

// //       // 3種類の命令をリストにする
// //       List<String> order1List = Arrays.asList(order1.split(" "));
// //       List<String> order2List = Arrays.asList(order2.split(" "));
// //       List<String> order3List = Arrays.asList(order3.split(" "));
// //       List<List<String>> list = new ArrayList<>(); // 与えられた文字列のリスト
// //       for (int i = 0; i < n; i++) {
// //         String str = sc.nextLine();
// //         String array[] = str.split(" ");
// //         list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
// //       }

// //       // System.out.println(list);

// //       for (List<String> list2 : list) {
// //         if ("SET".equals(list.get(0))) {
// //           if ("1".equals(list.get(1))) {
// //             System.out.println(list);
// //           } 
// //           if ("2".equals(list.get(1))) {
// //             System.out.println(list);
// //           } 
// //         }
        
// //         if ("ADD".equals(list.get(0))) {
// //           System.out.println(list);
// //         }
        
// //         if ("SUB".equals(list.get(0))) {
// //           System.out.println(list);
// //         }
 
// //       }
// //   }
// // }
//       // SET の場合、変数1 or 2どちらに値を設定するか、に応じて処理を分ける


//       // // 変数val1,val２を初期化
//       // int val1 = 0;
//       // int val2 = 0;

//       // // Stringからint型へ変換し、変数num1,num２,num3へ代入
//       // int num1 = Integer.parseInt(order1);
//       // int num2 = Integer.parseInt(order2);
//       // int num3 = Integer.parseInt(order3);

//       // //命令を定義する
//       // int set = val1 + num1;
//       // int add = set + val2;
//       // int sub = set - val2;

//       // // 3種類の命令があった場合の変数1,2を出力する
//       // if (val1 == 0) {
//       //   System.out.println(num1);
//       // } else if(val2 == 0) {
//       //   System.out.println(num2);
//       // }

// // ◆仮説（手順）
// // 1.以下入力で受付する
// // int n  = sc.nextInt(); // 1行目：命令の個数     
// // String order1 = sc.nextLine(); // 2行目：命令1
// // String order2 = sc.nextLine(); // 3行目：命令2
// // String order3 = sc.nextLine(); // 4行目：命令3
// // sc.nextLine();

// // 2.変数1,2を初期化

// // 3.String型である命令1,2,3を、int型へ変換することで計算できるようにする

// // 4.3種類の命令（SET,ADD,SUB）を定義する

// // 5.n個のコンピュータから3種類の命令があった場合の変数1,2を出力する

// // ◆山岡さん助言
// // ・SET, ADD, SUB 文字列がどれか、
// // →ADD,SUBが文字列（計算するため）
// // ※SETは変数iに代入するだけのため、数値となる

// // ・SET の場合、変数1 or 2どちらに値を設定するか、に応じて処理を分ける必要がある
// // if () {
// //   System.out.println();
// // }

// // ・まず下準備として、与えられた入力を下記のようにリストに格納する必要がある。
// // [[SET, 1, 10], [SET, 2, 20], [ADD, 40]]
