package D;
import java.util.Scanner;

public class D187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        String a = sc.nextLine(); //nextLine()メソッドで文字列として取得
        String b = sc.nextLine(); //nextLine()メソッドで文字列として取得
        
        System.out.print(a + "/" + b);  // 結果を出力
    }
}