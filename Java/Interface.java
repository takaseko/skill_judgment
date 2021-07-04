// 参照：Potepan Style
// 【Java】インターフェースの使い方をわかりやすく解説！【継承】

// 1 インターフェース(interface)とは？
// ・インターフェースとは、クラス内にあるメソッドの具体的な処理は書かずに「変数」または「メソッドの型」を記述したもの

// 1_1 インターフェイス使用の条件
// ・すべてのメソッドが抽象メソッドであること
// ・基本的にフィールドを1つも持っていないこと

// 2 インターフェースの宣言
// アクセス修飾子 interface インターフェース名 {
//   ・
//   ・
//   ・
// }

// 3 インターフェースの実装・使い方
// ・インターフェースを継承して子クラスを定義する際は「implements」を使用します。これを「インターフェースを実装する」と言うので覚えておきましょう。
// （例：インターフェースを実装するための記述）
// アクセス修飾子 class クラス名 implements インターフェース名 {
//   ・
//   ・
//   ・
// }
// (例：インターフェイス宣言から実装まで)
// // インターフェースの宣言
// interface Name {
//   String name1 = "ポテパン";
//   String name2 = "インターフェース";

//   void call();
// }

// // インターフェースの実装
// // 登録した名前で文章を作成するクラス
// class Link implements Name {
//   public void call(){
//       System.out.println(name1 + "で" + name2 + "を学ぼう!");
//   }
// }

// // インターフェースの実装
// // 登録した名前の文字数を数えるクラス
// class Count implements Name {
//   public void call() {
//       int num1 = name1.length();
//       int num2 = name2.length();
//       System.out.println("「" + name1 + "」は" + num1 + "文字");
//       System.out.println("「" + name2 + "」は" + num2 + "文字");
//   }
// }

// // 実装したクラスを実行
// public class Main {
//   public static void main(String args[]) {
//       Link link = new Link();
//       link.call();

//       Count count = new Count();
//       count.call();
//   }
// }
// （実行結果）
// ポテパンでインターフェースを学ぼう!
// 「ポテパン」は4文字
// 「インターフェース」は8文字
// ・このプログラムでは、NameインターフェースのcallメソッドをLinkクラスとCountクラスの両方で実装しています。
// ・実装の処理内容は決められていないので、LinkクラスとCountクラスでそれぞれ異なった動作をしているのです。
// ・Linkクラスでは、2つの文字列を組み合わせた文章を表示します。Countクラスでは、それぞれの文字の文字数を数えて表示します。
// ・このように、メソッドは用意するけど中身（処理）までは決めない場合にインターフェースは有効といえる。


// public class Interface {
  
// }

4_1インターフェースのメリット・必要性は？
・インターフェースの最大メリットは、「処理内容を具体的に書いていない」点です。使いたいときに処理内容を実装すればい良いので、将来的に処理の変更が起こりうる場合などに便利
・「複数のインタフェースを同時に継承可能」
・クラスの継承の場合、親クラスを子クラスに継承する際は1つの親クラスしか指定できません。そのため、クラスの継承に対してインターフェースは複数継承できるのでひとつの利点だといえる。
・大規模なプログラムなど複数のインターフェースを利用する場合、長期的な目で見ると開発時間の短縮につながる
4_2 インターフェイスのメリットまとめ
・使いたいときに処理内容を実装できる（処理内容を後回しにできる）
・複数のインタフェースを同時に継承できる
・プログラムによっては開発時間の短縮になる

5 インターフェースと抽象クラスはどう使い分ける？
インターフェースと抽象クラスの違い
・抽象クラスは多重継承不可、インターフェースは複数実装可能
・インターフェースのアクセス修飾子は「public」のみ
・インターフェースは定義できるメンバに制限あり、抽象クラスはなし

6 抽象クラスは多重継承不可、インターフェースは複数実装可能
（例：インターフェースを複数実装したプログラム）

// インターフェースの宣言
interface Start {
  String name1 = "ポテパン";

  void start();
}

// インターフェースの宣言
interface Call {
  String name2 = "インターフェース";

  void call();
}

// インターフェースを実装するクラスの作成
class Message implements Name {
  public void start(){
      System.out.println(name1 + "と一緒に" + name2 + "を学ぼう!");
  }

  public void call() {
       System.out.println(name2 + "を学ぶなら" + name1 + "!");

  }
}

// 実装したクラスを実行
public class Main {
  public static void main(String args[]) {
      Message mg = new Message();
      mg.start();
      mg.call();
  }
}
（実行結果）
ポテパンと一緒にインターフェースを学ぼう!
インターフェースを学ぶならポテパン!
・MessageクラスでStartとCallの2つのインターフェースを実装し、Messageクラスで変数name1とname2を利用できているのがわかります。このように、インターフェースは複数実装することが可能

6_2 インターフェースのアクセス修飾子は「public」のみ
・インターフェースは、他のクラスに実装することを前提に作られているので、指定できるアクセス修飾子はpublicのみ
・publicを付けない場合は、同じファイル内のみの利用に制限される

6_3 インターフェースは定義できるメンバに制限あり、抽象クラスはなし
インターフェースで定義できるメンバは、
・抽象メソッド
・defaultメソッド
・クラス定数
に限られています。一方、抽象クラスには制限がありません。抽象クラスにabstractメソッドがあれば、そのクラスは抽象クラスになるだけです。

7 まとめ
インターフェースは、処理内容を具体的に書いていないため処理内容を変えたい場合に有効な手段です。
また、クラスの継承とは異なり複数のインタフェースを同時に継承できるといったメリットもあります。
ぜひ、インターフェイスを有効活用してプログラムを実装してみてください。