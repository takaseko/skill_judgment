package D;
import java.util.Scanner;

public class D126 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int C = sc.nextInt(); //nextInt()メソッドで数値として取得
    int T = sc.nextInt(); //nextInt()メソッドで数値として取得
    int A = sc.nextInt(); //nextInt()メソッドで数値として取得
    sc.nextLine();  //改行

    System.out.println(C + T + A); //結果を出力
  }
}