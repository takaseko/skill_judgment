/*参照：Piazaラーニング
Java入門編2：条件によって処理を変えてみよう

1 Chapter01_IF文による条件分岐
// if文による条件分岐
数値に応じて、表示するメッセージを切り替えるプログラム
public class Main {
	public static void main(String[] args) {
	    int number = 2;
        if (number == 1) {
            System.out.println("好き！");//条件式が成立したときの処理
        } else {
            System.out.println("嫌い");//条件式が成立しなかった時の処理
            System.out.println("嫌い");
        }
	}
}

1_1 作ったプログラムを「好き/嫌い」占い（ランダム）にする方法
このチャプターで作ったプログラムを元に
number = 1 としているところを
number = (int)(Math.random() * 2 + 1)とすると、コードの実行毎にランダムで結果が変わる「スキ！／キライ」占いが作れる*/