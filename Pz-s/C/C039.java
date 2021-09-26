package C;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class C039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String e = sc.nextLine();
        String[] strArray = e.split("");

        int sum = 0; // 合計
        int tempSum = 0; // 一区切りの合計値を一時的に保持する変数
        for (int i = 0; i < strArray.length; i++) {
            String str = strArray[i];
            // 記号が"<"の場合
            if (str.equals("<")) {
                tempSum += 10;
            }
            // 記号が"/"の場合
            if (str.equals("/")) {
                tempSum += 1;
            }
            // 記号が"+"の場合
            if (str.equals("+")) {
                sum += tempSum;
                tempSum = 0;
            }
            // ループが一番最後の場合
            if (i == strArray.length - 1) {
                sum += tempSum;
            }
        }
        System.out.println(sum);
    }
}

//         高瀬 仮説2
//         Scanner sc = new Scanner(System.in);
//         //まず以下で入力受付
//         String E = sc.nextLine(); // パイザ記法 nextLineメソッドで1行分の入力を取得し変数へ代入
//         sc.nextLine(); // 改行
//         System.out.println(E); // パイザ記法Eの入力受付確認OK

//         // 仮説2 parseIntメソッドで文字列を数値へ変換
//         String srashNum = "/";
//         int srashVal = Integer.parseInt(srashNum);
//         srashVal = 1; // 変数の上書き / → 1

//         String symbolNum = "<";
//         int symbolVal = Integer.parseInt(symbolNum);
//         symbolVal = 10; // 変数の上書き < → 10

//         // 結果の出力
//         for (int i = 0; i < 1; i++) { // for文で入力に対して繰り返し処理
//           E = srashVal + symbolVal; // ←ここで、記号「/、<」を数値として変換した結果をEへ代入できるのか？
//           System.out.println(E);  
//         }
//     }   
// }

        // 高瀬仮説1_replaceメソッドで文字と文字列の置換で計算できないためNG
        // String srashNum1 = "/";
        // String srashNum2 = srashNum1.replace("/", "1");
        // String symbolNum1 = "<";
        // String symbolNum2 = symbolNum1.replace("<", "10");
        // String addNum1 = "+";
        // String addNum2 = addNum1.replace("+", "+");