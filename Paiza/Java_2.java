/* 参照：Piazaラーニング
Java入門編1：プログラミングを学ぶ

1 chapter01_Javaとは？

2 chapter02_Javaでプログラムを書いてみよう

public class Java_2 {
	public static void main(String[] args) {
		System.out.println("グッドモーニング")
	}
}

2_1 間違いやすいポイント
・末尾のセミコロン忘れ。
・カッコやダブルクォーテーションが全角文字になっている。
・メソッドが、全て半角小文字で記述されていない。（× Println、○ println）
・ただし、System.outの先頭は、大文字にする。

2_2 メソッドとは
Javaでは、この「println」のような命令を「メソッド」と呼んでいます。
プログラミングでは、「println」のようなメソッドで、コンピュータに対して動作を指示していきます。「println」と書くと、文字を表示するのだなとJavaが理解して、そのとおり動いてくれるのです。
プログラミング言語は、このようなメソッドをたくさん持っています。各メソッドがどのように動作をするか、プログラミング言語ごとに決まっています。*/

// 3 Chapter03_コメントでプログラムを見やすく！
// // コメントを入力する
// public class Main { //メインクラス
// 	public static void main(String[] args) {
// 		System.out.println("hello world1");//文字を表示
// 		/*System.out.println("hello world2");
// 		System.out.println("hello world3");*/
// 	}
// }

// 3_1 コメントアウトの方法
// ・Javaでは、「//」から行末までがコメントになる
// ・複数の行をコメントアウトするときは、コメント行の先頭に「/*」を、末尾に「*/」を記述 */

/*4 Chapter04_HTMLを表示してみよう 
4_1 文字データの呼び方
・プログラムでは、文字データのことを「テキスト」「文字列」(もじれつ)「String」(ストリング/ストリングス)と呼ぶことがある

4_2 
// HTMLを表示する
public class Main {
	public static void main(String[] args) {
			System.out.print("<h1>hello world</h1>");
			System.out.print("<p>世界の皆さん、");
			System.out.print("<b>こんにちは</b></p>");
	}
}*/

4 Chapter05_変数を使えるようになろう
/* 変数を使う
public class Main {
	public static void main(String[] args) {
	    String player = "勇者";
		System.out.println(player + "は、荒野を歩いていた");
		System.out.println(player + "は、モンスターと戦った");
		System.out.println(player + "は、モンスターをたおした");
	}
}

4_1 変数の名前のつけ方
・変数の名前は、次のルールに従って付けます。
・最初の1文字目：英文字または、「_」(アンダーバー)、「$」
・2文字目以降：英文字・数字「_」(アンダーバー) 、「$」
・変数名の例：○ player 1文字目が、英小文字
・◯ Player 1文字目が、英大文字
・○ _weapon 1文字目が、「_」(アンダーバー)
・○ player01 2文字目以降に数字
・× 1player 1文字目に数字は使えない
・また、Javaは、予約語(キーワード)と呼ばれる単語が決まっており、この予約語は変数名に利用できません。例えば、「public」や「class」といった単語が予約語になっています。

4_2 変数の宣言
・変数を使うとき、最初にデータの種類を指定して宣言する必要があります。
String player = "勇者"; // 文字列データの変数
int number = 3; // 整数データの変数
・Stringの頭文字は大文字にします。intは、すべて小文字です。
・2回目以降、変数にデータを代入する時には、データの種類の指定は不要です。

4_3 文字列と変数を連結する方法
変数と文字列は、「+」記号で連結できます。

player = "戦士"
print(player + "は、荒野を歩いていた")*/