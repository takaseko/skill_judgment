package D;
import java.time.Year;
import java.util.Scanner;

public class D168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int Y = sc.nextInt(); // nextInt()メソッドで数値として取得
        int M = sc.nextInt(); // nextInt()メソッドで数値として取得
        int D = sc.nextInt(); // nextInt()メソッドで数値として取得
        sc.nextLine(); // 行送り
        
        //結果を出力
          System.out.println(M + "/" + D + "/" + Y); 
    }
}