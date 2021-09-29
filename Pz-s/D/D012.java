package D;
import java.util.Scanner;

public class D012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int n = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得する →変数nへ代入
        sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り
          
        for (int i = 0; i < 1; i++) {
        System.out.println(Math.abs(n));  //変数nの絶対値の結果を出力
      }    
    }
  }