package D;
import java.util.Scanner;

public class D070 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int m = sc.nextInt(); //数値として取得
    int n = sc.nextInt(); //数値として取得
    sc.nextLine();  //1行読み取り

      System.out.println(m - n);  //結果を出力
  }
}