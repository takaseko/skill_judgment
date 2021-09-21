// import java.util.List;
// import java.util.ArrayList;
// import java.util.*;
// import java.util.Scanner;

// public class C049 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // 1行目の入力を変数に代入する。
//     int n = sc.nextInt(); // 1行目：ログの行数
//     sc.nextLine();
//     // System.out.println(n);変数nログの行数の確認：OK
    
//     // 与えられた入力(エレベータの動いた階)をリストList<Integer>に格納する
//     List<Integer> givenNumList = new ArrayList<>();
//     for (int i = 0; i < n; i++) {
//         givenNumList.add(sc.nextInt());
//         sc.nextLine(); // 行送り
//     }
//     // System.out.println(givenNumList);与えられた入力(エレベータの動いた階)の確認：OK
    
//     int sum = 0; エレベーターの合計値
//     int currentFloor = 1; 現在のフロア
//     // 以下、与えられた入力全件に対してエレベータが何階分を動いたかの合計値を出力する処理
//     for (Integer num : givenNumList) {
//       sum += Math.abs(currentFloor - num);
//       currentFloor = num;
//   }
//   System.out.println(sum); // 何階分動いたかの合計を出力する
//   }  
// }  