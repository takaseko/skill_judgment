package D;
import java.util.Scanner;

public class D174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int k = sc.nextInt(); //k nextInt()メソッドで数値として取得する →変数kへ代入 →値を1行読み取り
        sc.nextLine(); // 行送り
        
        for (int i = 0; i < 1; i++) { // for文で繰り返し処理
        System.out.println(k * 1500);  // 栄養の接種の結果を出力
      }
    }
}