package D;
import java.util.Scanner;

public class D022 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int a = sc.nextInt(); //nextInt()メソッドで数値として取得
    sc.nextLine();  //nextLine()メソッドで改行

      System.out.println(6 * (a * a));  //結果を出力   
  }
}