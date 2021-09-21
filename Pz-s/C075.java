// import java.util.List;
// import java.util.ArrayList;
// import java.util.*;
// import java.util.Scanner;

// public class C075 {
//   public static void main(String[] args) {
//     // 自分の得意な言語で
//     // Let's チャレンジ！！
//     Scanner sc = new Scanner(System.in);
//     // 1行目の入力を変数に代入する。
//     int n = sc.nextInt(); // 残高
//     int m = sc.nextInt(); // 乗車回数
//     sc.nextLine();
    
//     // 与えられた入力(運賃)をリストList<Integer>に格納する
//     List<Integer> givenNumList = new ArrayList<>();
//     for (int i = 0; i < m; i++) {
//         givenNumList.add(sc.nextInt());
//         sc.nextLine(); // 行送り
//     }
    
//     int cashBalance = n; // 現金残高
//     int pointBalance = 0; // ポイント残高
    
//     // 与えられた入力全件に対して以下の処理をする。
//     for (Integer num : givenNumList) {
//         if (num <= pointBalance ) {
//             // ポイント残高が運賃以上の場合
//             pointBalance -= num; // ポイント残高から運賃を支払う
//         } else {
//             // それ以外の場合
//             cashBalance -= num; // 現金残高から運賃を支払う
//             pointBalance += num * 0.1; // 運賃の10%をポイントに加算する。
//         }
//         // 現在の現金残高、ポイント残高を出力する。
//         System.out.println(cashBalance + " " + pointBalance);
//     }
//   }
// }  
  
// // 自分のコード
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         String line = sc.nextLine();

// //         // 1行目の入力を変数に代入する。
// //         int N = 2000; // チャージされている金額（元々のカード残高）
// //         int M = sc.nextInt(); // バスの乗車回数

// //         // 与えられた入力(運賃)をリストList<Integer>に格納する
// //         List<Integer> list = new java.util.ArrayList<>();

// //         // 追加する
// //         list.addAll(Arrays.asList(300, 500, 100));

// //         // 変数 現金残高（カード残高）]
// //         // 変数 ポイント残高
// //         Int c_1 =  listC.get(N - (list));
// //         Int p_1 =  listP.get(N - (list));

// //         // 与えられた入力全件に対して以下の処理をする。
// //         // ポイント残高が運賃以上の場合
// //         // ポイント残高から運賃を支払う
// //         // それ以外の場合
// //         // 現金残高から運賃を支払う
// //         // 運賃の10%をポイントに加算する。
// //         for (int i = 1; i <= num; i++) {
// //             if (p_1 >= list) {
// //                 System.out.println();
// //             } else {
// //                 System.out.println();
// //             }
// //         }
// //         // 現在の現金残高、ポイント残高を出力する。
// //         System.out.println();
//    }
// // }