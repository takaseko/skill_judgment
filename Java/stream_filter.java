// // 参照：AMG Solution
// // 【Java Stream API 超入門】filterメソッドを使って、条件でコレクション要素をフィルタリングする方法

// 1 Stream APIとは？
// ・Streamとは、Listなどのコレクションに対する操作をサポートするクラス
// ・オブジェクトのListに対して、条件による絞り込みや合計値や平均値などの集計処理を行うメソッドが用意
// ・for文の処理に比べて、処理がわかりやすいようにコードを記述できるのが特徴

// 2 使い方
// 基本的な流れは次のとおりです。
// ・コレクションからStreamを取得
// ・Streamに対して、絞り込みや要素の変換などの中間処理を行う
// ・変換したStreamに対して結果の取得など行う終端処理を行う

// 3 Streamの取得
// （例：「Tokyo」、「Chiba」、「Saitama」、「Kanagawa」、「Gunma」、「Tochigi」、「Ibaraki」、「Yamanashi」の8つの要素を持つ文字列のList）
// List<String> list = Arrays.asList(
//   "Tokyo",
//   "Chiba",
//   "Saitama",
//   "Kanagawa",
//   "Gunma",
//   "Tochigi",
//   "Ibaraki",
//   "Yamanashi"
// );
// Stream<String> stream = list.stream();

// 4 中間処理（絞り込みや要素の変換などの中間処理）
// （例：絞り込みを行うStream.filter()メソッド）
// ・filterメソッドは、条件でフィルタリングした新しいStreamを返却
// （例：文字列の長さが６文字以上という条件でフィルタリングを行う）
// Stream<String> stream2 = stream.filter(str -> str.length() >= 6);
// ・ここではラムダ式というものを使っています。->の左に要素を受け取る引数を置き、右に条件式を記述
// ・filterメソッドは、条件式を満たす要素のみの新しいStreamを返却します。これにより、文字数が６文字以上の要素だけからなるstream2が取得できます。

// 5 終端処理（結果の取得や表示など）
// stream2.foreEach(str -> System.out.println(str));
// ・Stream.foreEach()は、ストリームの要素全てに対して１つずつ処理を実施するメソッド
// ・Stream.foreEach()は、ストリームの要素全てに対して１つずつ処理を実施するメソッドです。
// ・filterメソッドと同じで、ラムダ式によって->の左に要素を受け取る引数、右に処理の内容を記述します。

// 6 for文との比較
// 6_1 （例：拡張for文での記述）
// List<String> list = Arrays.asList(
//   "Tokyo",
//   "Chiba",
//   "Saitama",
//   "Kanagawa",
//   "Gunma",
//   "Tochigi",
//   "Ibaraki",
//   "Yamanashi"
// );
 
// for (String str : list) { // Listのすべての要素に対して処理を実施
// 	if (str.length() >= 6) { // 文字列長が6文字以上という条件を満たした場合のみ表示を行う
// 		System.out.println(str); 
// 	}
// }
// （実行結果）
// Saitama
// Kanagawa
// Tochigi
// Ibaraki
// Yamanashi

// 6_2 （例：Stream APIでの記述）
// List<String> list = Arrays.asList(
//   "Tokyo",
//   "Chiba",
//   "Saitama",
//   "Kanagawa",
//   "Gunma",
//   "Tochigi",
//   "Ibaraki",
//   "Yamanashi"
// );
// Stream stream = list.stream(); // Streamの取得
// Stream stream2 = stream.filter(str -> str.length() >= 6); // 文字列長が6文字以上のものだけを集める中間処理
// stream2.foreEach(str -> System.out.println(str)); // 集めた要素をすべて表示する終端処理
// （実行結果）
// Saitama
// Kanagawa
// Tochigi
// Ibaraki
// Yamanashi
// for文が、すべての要素を１つずつ取り出し、条件を満たすか判定して満たすなら表示という処理となっているのに対し、Streamを用いた処理は条件を満たすものだけを集めて、集めたものをすべて表示するという処理になっています。

// 参照：IT Sakura
// Java Stream APIでリストを操作する(stream)

// 1 Stream APIとは
// ・リストなどのコレクション、配列、ファイル等に使用します。
// ・例：リスト等を指定してストリームを生成し、そのストリームに対して処理します。
// →Streamを生成→中間操作→終端操作
// ・並列処理を行うこともできます。
// ・並列で処理を行うため値が変わらない変数のみアクセス可能です。
// →外部のローカル変数に対してアクセスできるのは再代入不可のfinal変数のみです。
// →for文では外部のローカル変数にアクセスできます。

// 1_1 コレクションでストリームを使用する
// コレクションではCollectionインターフェースのstreamメソッドを使用します。
// ArrayListなどのコレクションのクラスは、Collectionインターフェースを実装しているのでstreamメソッドを使用できます。

// 2 要素の条件が１つでも一致するか(anyMatch)
// List<Integer> num1 = new ArrayList<>(Arrays.asList(5,8,9));
//   boolean a = num1.stream()
//     .anyMatch(b -> b > 10); //10より大きい要素はあるか
//   System.out.println(a); //false
//   boolean c = num1.stream()
//     .anyMatch(d -> d > 8); //8より大きい要素はあるか
//   System.out.println(c); //true
// （実行結果）要素の条件が1つでも一致した場合はtrueをそうでない場合はfalseを返します。

// 3 要素の条件が全て一致するか(allMatch)
// List<Integer> num1 = new ArrayList<>(Arrays.asList(5,8,9));   
// boolean a = num1.stream()
//   .allMatch(b -> b > 7); //すべての要素は7より大きいか
// System.out.println(a); //false
// boolean c = num1.stream()
//   .allMatch(d -> d > 3); //すべての要素は3より大きいか
// System.out.println(c); //true
// （実行結果）すべての要素の条件が一致した場合はtrueをそうでない場合はfalseを返します。

// 4 要素の条件が一致するものは１つもないか(noneMatch)
// List<Integer> num1 = new ArrayList<>(Arrays.asList(5,8,9));   
// boolean a = num1.stream()
//   .noneMatch(b -> b > 7); //7より大きい要素はひとつもないか
// System.out.println(a); //false   
// boolean c = num1.stream()
//   .noneMatch(d -> d > 10); //10より大きい要素はひとつもないか
// System.out.println(c); //true
// （実行結果）noneMatchメソッドは一致が1つもない場合にtrueを返します。

// 参照：Qiita
// Java 8 Stream API にテキストを流してみた（終端操作編）
// URL：https://qiita.com/kumazo/items/284098c530fceb05805c

// 1 検索する
// 1_1 findFirst()/findAny()
// ・メソッド名findFirst()/findAny()はそれ自体が要素を検索するわけではない。それはfilter()などの中間処理の役割
// ・findFirst()は始めの要素をOptionalで返す。
// ・findAny()は初めの要素をOptionalで返す。
// （Optionalは空かもしれない。）
// ※findLast()的な最後の要素を得る終端操作は用意されていない。
// （例：find系終端処理の基本）
// String[] words = {"aaaaaa", "bbbbbb", "cccccc"};
//     List<String> list = Arrays.asList(words);
//     Optional<String> first = list.stream().findFirst();
//     first.ifPresent(s -> {
//         System.out.println(s);  // "aaaaaa"
//     });
//     Set<String> set = new HashSet<>(list);
//     Optional<String> any = set.stream().findAny();
//     any.ifPresent(s -> {
//         System.out.println(s);  // "cccccc"
//     });
// （例：素数を見つける ※Setの要素を１個だけ取得する）
// final int from = 1_000_000;
//     final int to = from + new Random(System.currentTimeMillis()).nextInt(from); // 揺さぶり。
//     int p = IntStream.range(from, to)
//             .parallel()
//             //.sequential() // sequencial ではどちらでも同じ結果になる。(=1000003)
//             .filter(n -> {
//                 return IntStream.range(2, n)
//                         .noneMatch(m -> n % m == 0);
//             })
//             .findAny()     // prallel ではどの素数が得られるかわからない。
//             //.findFirst() // prallel でも最小の素数が得られる(=1000003)
//             .getAsInt();
//     System.out.println(p);
// ・要素が得られた時点で以降の Stream 処理は打ち切られる(短絡操作)。
// ・並列処理にすればfindFirst()よりもfindAny()の方が速く結果を返せる可能性がある。
// ・テキスト処理では検索対象そのものより、その前後や位置の方を知りたいことも多いが、副作用や状態を持たない Stream では難しい。