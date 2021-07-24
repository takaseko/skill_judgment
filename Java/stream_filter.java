// 参照：AMG Solution
// 【Java Stream API 超入門】filterメソッドを使って、条件でコレクション要素をフィルタリングする方法

1 Stream APIとは？
・Streamとは、Listなどのコレクションに対する操作をサポートするクラス
・オブジェクトのListに対して、条件による絞り込みや合計値や平均値などの集計処理を行うメソッドが用意
・for文の処理に比べて、処理がわかりやすいようにコードを記述できるのが特徴

2 使い方
基本的な流れは次のとおりです。
・コレクションからStreamを取得
・Streamに対して、絞り込みや要素の変換などの中間処理を行う
・変換したStreamに対して結果の取得など行う終端処理を行う

3 Streamの取得
（例：「Tokyo」、「Chiba」、「Saitama」、「Kanagawa」、「Gunma」、「Tochigi」、「Ibaraki」、「Yamanashi」の8つの要素を持つ文字列のList）
List<String> list = Arrays.asList(
  "Tokyo",
  "Chiba",
  "Saitama",
  "Kanagawa",
  "Gunma",
  "Tochigi",
  "Ibaraki",
  "Yamanashi"
);
Stream<String> stream = list.stream();

4 中間処理（絞り込みや要素の変換などの中間処理）
（例：絞り込みを行うStream.filter()メソッド）
・filterメソッドは、条件でフィルタリングした新しいStreamを返却
（例：文字列の長さが６文字以上という条件でフィルタリングを行う）
Stream<String> stream2 = stream.filter(str -> str.length() >= 6);
・ここではラムダ式というものを使っています。->の左に要素を受け取る引数を置き、右に条件式を記述
・filterメソッドは、条件式を満たす要素のみの新しいStreamを返却します。これにより、文字数が６文字以上の要素だけからなるstream2が取得できます。

5 終端処理（結果の取得や表示など）
stream2.foreEach(str -> System.out.println(str));
・Stream.foreEach()は、ストリームの要素全てに対して１つずつ処理を実施するメソッド
・Stream.foreEach()は、ストリームの要素全てに対して１つずつ処理を実施するメソッドです。
・filterメソッドと同じで、ラムダ式によって->の左に要素を受け取る引数、右に処理の内容を記述します。

6 for文との比較
6_1 （例：拡張for文での記述）
List<String> list = Arrays.asList(
  "Tokyo",
  "Chiba",
  "Saitama",
  "Kanagawa",
  "Gunma",
  "Tochigi",
  "Ibaraki",
  "Yamanashi"
);
 
for (String str : list) { // Listのすべての要素に対して処理を実施
	if (str.length() >= 6) { // 文字列長が6文字以上という条件を満たした場合のみ表示を行う
		System.out.println(str); 
	}
}
（実行結果）
Saitama
Kanagawa
Tochigi
Ibaraki
Yamanashi

6_2 （例：Stream APIでの記述）
List<String> list = Arrays.asList(
  "Tokyo",
  "Chiba",
  "Saitama",
  "Kanagawa",
  "Gunma",
  "Tochigi",
  "Ibaraki",
  "Yamanashi"
);
Stream stream = list.stream(); // Streamの取得
Stream stream2 = stream.filter(str -> str.length() >= 6); // 文字列長が6文字以上のものだけを集める中間処理
stream2.foreEach(str -> System.out.println(str)); // 集めた要素をすべて表示する終端処理
（実行結果）
Saitama
Kanagawa
Tochigi
Ibaraki
Yamanashi
for文が、すべての要素を１つずつ取り出し、条件を満たすか判定して満たすなら表示という処理となっているのに対し、Streamを用いた処理は条件を満たすものだけを集めて、集めたものをすべて表示するという処理になっています。