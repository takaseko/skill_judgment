package D;
import java.util.Scanner;

public class D123 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int x = sc.nextInt(); //nextInt()メソッドで数値として取得
    sc.nextLine();  //nextLine()メソッドで改行

    //結果を出力
    if (x < 10000) {
      System.out.println(x + 10000); 
    } else {
      System.out.println(x);
    }
  }
}