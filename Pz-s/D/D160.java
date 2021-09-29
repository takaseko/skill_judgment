package D;
import java.util.Scanner;

public class D160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); //数値として取得
        int M = sc.nextInt(); //数値として取得
        sc.nextLine(); 
        
        System.out.println(N / 10 * M);  // 結果を出力   
    }
}