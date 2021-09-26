package D;
import java.util.Scanner;

public class D112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int n = sc.nextInt(); //nextInt()メソッドで数値として取得する →変数nへ代入
        int m = sc.nextInt(); //nextInt()メソッドで数値として取得する →変数mへ代入
        sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
          
        for (int i = 0; i < 1; i++) {
        System.out.println(n * m);  //工場の生産力の結果を出力
      }    
    }
}