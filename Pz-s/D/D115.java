package D;
import java.util.Scanner;

public class D115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); //N nextInt()メソッドで数値として取得
        sc.nextLine();  //改行
          
        System.out.println(N / 2);  //結果を出力
    }
}