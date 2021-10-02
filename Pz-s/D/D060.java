package D;
import java.util.Scanner;

public class D060 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int a = sc.nextInt(); //数値として取得
    int b = sc.nextInt(); //数値として取得
    sc.nextLine();  //nextLine()メソッドで入力した値を1行読み取り

        System.out.println(a - b);
  }
}