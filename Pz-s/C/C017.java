// package C;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class C017 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //まず以下で入力受付
//         int a = sc.nextInt(); // 親カード1 nextLineメソッドで1行分の入力を取得し変数へ代入
//         int b = sc.nextInt(); // 親カード2
//         sc.nextLine(); // 改行
//         int n = sc.nextInt(); // 整数n（子カードの枚数）
//         sc.nextLine(); // 改行
//         //System.out.println();親カード、整数nの入力受付確認OK

//         List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
//             // 子カードを枚数だけ処理を繰り返す。
//             for (int i = 0; i < n; i++) {
//                 String[] array = sc.nextLine().split(" "); // 入力例: 7 2 → {"7", "2"}に変換
//                 // 配列の中身はString型なので、intに変換してListに格納する。
//                 List<Integer> tmpList = new ArrayList<>(); 
//                 tmpList.add(Integer.parseInt(array[0])); // 子カード1つ目の番号
//                 tmpList.add(Integer.parseInt(array[1])); // 子カード2つ目の番号
//                 list.add(tmpList);
//                 // System.out.println(); 子カードの格納確認OK
//             }
        
//             // 結果の出力（山岡さん）
//             // 入力を一時的に保持するList全件に対して処理を繰り返す。
//             for (List<Integer> integerList : list) {
//                 if (a > integerList.get(0)) { // 1つ目の番号で親カードが大きい場合
//                     System.out.println("High");
//                 }

//                 if (a < integerList.get(0)) { // 1つ目の番号で親カードが小さい場合
//                     System.out.println("Low");
//                 }
                
//                 if (a == integerList.get(0)) { // 1つ目の番号で親カードと同じで、2つ目の番号で親カードが大きい場合と小さい場合
//                     if (b < integerList.get(1)) {
//                         System.out.println("High");
//                     } else {
//                         System.out.println("Low");
//                     }
//                 }
//             }
//     }
// }

                // // 結果の出力（高瀬）
                // // 入力を一時的に保持するList全件に対して処理を繰り返す。
                // for (int i = 0; i < list.size(); i++) {
                //     int firstNum = list.get(i).get(0); // 子カード1つ目の番号
                //     int secondNum = list.get(i).get(1); // 子カード2つ目の番号
                    
                //     boolean isCompare =  a > firstNum; // 1つ目の番号で親カードが大きい場合
                //     if (isCompare) {
                //         System.out.println("High"); 
                //     } else if (isCompare) {
                //         System.out.println("Low");
                //     } else if (a == firstNum && b < secondNum) {  // 1つ目の番号が同じの場合、かつ2つ目の番号で親カードが小さい場合
                //         System.out.println("High");
                //     } else {
                //         System.out.println("Low");
                //     }
                //  }

//         // 与えられた整数のリスト
//         List<Integer> givenNumList = new ArrayList<>(); // ← [28, 16, 777]
//         for (int i = 0; i < q; i++) {
//             givenNumList.add(Integer.parseInt(sc.nextLine()));
//         }

//         for (Integer givenNum : givenNumList) {
//             getResult(givenNum);
//         }
//     }

//     private static void getResult(Integer num) {
//         // 与えられた整数の約数を格納するリスト ← 確認用
//         List<Integer> divisor = new ArrayList<>();
//         // 自身を除いたものの和
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             // 与えられた整数 割る i の余りが0の場合
//             if (num % i == 0) {
//                 divisor.add(i);
//                 if (i != num) {
//                     sum += i;
//                 }
//             }
//         }

//         if (sum - num == 0) {
//             // 自身を除いたものの和 - 与えられた整数 = 0 の場合
//             System.out.println("perfect");
//         } else if (sum - num == -1) {
//             // 自身を除いたものの和 - 与えられた整数 = -1 の場合
//             System.out.println("nearly");
//         } else {
//             // それ以外
//             System.out.println("neither");
//         }
//     }
// }