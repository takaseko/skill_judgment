package D;
import java.util.Scanner;

public class D132 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    int D = sc.nextInt(); //nextInt()メソッドで数値として取得
    sc.nextLine();  //改行

    //結果を出力
    System.out.println(D / 180 + 2); 
  }
}