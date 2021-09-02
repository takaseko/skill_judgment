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

/*2 Chapter02_複数の条件を組み合わせてみよう 
// if文による条件分岐 else if
public class Main {
	public static void main(String[] args) {
		int number = 100;
		if (number == 1) {
			System.out.println("スキ！");		// 条件式が成立したときの処理
		} else if(number == 2) {
		    System.out.println("どちらでもない");//条件式2が成立しなかった時の処理
		} else {
			System.out.println("キライ");		// どの条件式も成立しなかったときの処理
		}
	}
}

2_1 if、else if、elseの基本形
public class Main {
    public static void main(String[] args) {
        int number = 1;
        if (条件式1) {
            // 条件式1が成立したときの処理
        } else if (条件式2) {
            // 条件式2が成立したときの処理
        } else {
            // 条件式がどれも成立しなかったときの処理
        }
    }
}
・else ifはいくらでも記述可能*/