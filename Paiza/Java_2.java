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