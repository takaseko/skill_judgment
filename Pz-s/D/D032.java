package D;
import java.util.Scanner;

public class D032 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int n = sc.nextInt(); //nextInt()メソッドで文字列ではなく数値として取得
    sc.nextLine();  // 1行読み取り行送り

    System.out.println(100 - n);  //結果を出力
  }
}