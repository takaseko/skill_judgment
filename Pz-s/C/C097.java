package C;

import java.util.Scanner;

public class C097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); // 応募者
        int X = sc.nextInt(); // Xの倍数番目のプレゼント A の当選者
        int Y = sc.nextInt(); // Yの倍数番目のプレゼント B の当選者
        sc.nextLine(); // 改行
        // System.out.println(); // 受付確認済

        // 結果の出力
        // for分でプレゼント当選者の条件処理を繰り返す。
        // 応募者の数は1人目からのためindex番号を1からとし、それにあわせ応募者(N)も+1とする
        for (int i = 1; i < N + 1; i++) {
          if (i % X == 0 && i % Y == 0) { // Xの倍数かつYの倍数の場合「AB」
              System.out.println("AB");
          } else if (i % X == 0) { // Xの倍数の場合「A」
              System.out.println("A");
          } else if (i % Y == 0) { // Yの倍数の場合「B」
              System.out.println("B");
          } else {
              System.out.println("N"); // それ以外の場合「N」
          }
        }
  }
}

        // List<List<Integer>> list = new ArrayList<>(); // 入力を一時的に保持するList
        // // 木陰の数だけ処理を繰り返す。
        // for (int i = 0; i < N; i++) {
        //     String[] array = sc.nextLine().split(" "); // 入力例: 25 10 → {"25", "10"}に変換
        //     // 配列の中身はString型なので、intに変換してListに格納する。
        //     List<Integer> tmpList = new ArrayList<>();
        //     tmpList.add(Integer.parseInt(array[0])); // 木陰のx座標
        //     tmpList.add(Integer.parseInt(array[1])); // 木陰のy座標
        //     list.add(tmpList);
        //     // System.out.println(tmpList); // 木陰のx座標、木陰のy座標リスト確認済
        // }

          // // 結果の出力
          // // 入力を一時的に保持するList全件に対して処理を繰り返す。
          // for (List<Integer> integerList : list) {
          //   // 木陰の位置の条件（「位置 (x, y) が工事現場から R メートル以上離れている」）
          //   // Mathクラスのpowメソッドで2乗の計算をして、dobole型の変数を定義（powメソッドの引数と結果はdouble型となる）
          //   double target = Math.pow(integerList.get(0) - a, 2) + Math.pow(integerList.get(1) - b, 2);
          //   boolean cond = Math.pow(R, 2) <= target; 
          //   // Mathクラスのpowメソッドでboolean型で変数を定義することで、以下if文の条件を変数(cond)にしてtrueの場合「silent」false(それ以外)の場合「noisy」とできる

          //   // 木陰の位置の条件処理
          //   if (cond) { // 木陰の位置（cond）の場合「silent」
          //       System.out.println("silent");
          //   } else { // それ以外の場合「noisy」
          //       System.out.println("noisy");
          //   }
          // }