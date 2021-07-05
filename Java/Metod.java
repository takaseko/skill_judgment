// 参照：Potepan Style
// 【Java】 メソッドを徹底解説！定義から呼び出し、戻り値、引数まとめ

1-1 メソッドとは？
・メソッドとは、複数の文をまとめて、それを1つの”処理”として名前を付けたもの。クラスがもっている機能を定義した、ひとかたまりの文章とも言えます。

1-2 メソッドのメリット
・プログラム全体の見通しが良くなる
・機能単位に分かれているので、修正が簡単
・同じ処理を1つのメソッドにまとめると、作業効率が上がる
（例）以下のようにmainメソッドではメソッドの呼び出しだけ行い、別ファイルで分割したメソッドを定義しておけば、プログラム全体の見通しが良くなる
public class Main {
  public static void main(String[] args){
    calculate(); // 計算するメソッド
    check(); // 確認するメソッド
    print(); // 印刷するメソッド
  }
}
public static void calculate() {
  // 計算処理
}
 
public static void check() {
  // 確認処理
}
 
public static void print() {
  // 印刷処理
}
※処理が意図しないものであれば、メソッドが定義されているファイルだけを確認すれば良いため、管理も楽になる。
※メソッドで一度定義すれば、同じ処理を何度も書く必要がなくなるので作業効率も上がる。

2 メソッドの定義方法
メソッドを作成することを、メソッドの定義と言う
（例：メソッドの定義の記述）
public static[装飾子] 戻り値の型 メソッド名(引数リスト) {
  // メソッドが呼び出された時に実行される具体的な処理
}
public static void hello() {
  System.out.println("Hello World!");
}

3 メソッドの呼び出し方法
（例：メソッドの呼び出し記述）
メソッド名(引数リスト);
（例：先ほどの、helloメソッドを実際に呼び出す）
public class Main {
  public static void main(String[] args) {
      hello();
  }
  
  public static void hello() {
      System.out.println("Hello World!");
  }
}
（実行結果）
Hello World!