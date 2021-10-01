package D;
import java.util.Scanner;

public class D010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        String s = sc.nextLine(); //文字列として取得
        String t = sc.nextLine(); //文字列として取得
        
        //結果を出力  
        System.out.println(s + "@" + t); 
    }
}