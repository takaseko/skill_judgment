package D;
import java.util.Scanner;

public class D107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        String s = sc.nextLine(); //文字列として取得
        String c = sc.nextLine(); //文字列として取得
          
        System.out.print(c + s + c);  //結果を出力 
    }
  }