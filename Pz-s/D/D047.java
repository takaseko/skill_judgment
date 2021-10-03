package D;
import java.util.Scanner;

public class D047 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
    String n_g = sc.nextLine(); //nextLine()メソッドで文字列として取得
    String n_s = sc.nextLine(); //nextLine()メソッドで文字列として取得
    String n_b = sc.nextLine(); //nextLine()メソッドで文字列として取得
    // sc.nextLine();  //nextLine()メソッドで1行読み取り
    
    //結果を出力  
    System.out.println("Gold" + " " + n_g);
    System.out.println("Silver" + " " + n_s);
    System.out.println("Bronze" + " " + n_b);
  }
}