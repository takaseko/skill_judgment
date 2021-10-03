package D;
import java.util.Scanner;

public class D077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int a = sc.nextInt(); //nextInt()メソッドで数値として取得
        int b = sc.nextInt(); //nextInt()メソッドで数値として取得
        sc.nextLine();  //1行読み取り
        
        //結果を出力  
        if ((a * b) < 9999) {
          System.out.println(a * b);
        } else {
          System.out.println("NG");
        }
    }
}