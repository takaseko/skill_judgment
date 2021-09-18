// 参照：Qiita
// 3分でわかるMyBatis -MyBatis vs Hibernate-
// URL：https://qiita.com/wanko5296/items/d7829f18d4827cecd4f6

// 1 MyBatisとは何か
// ・MyBatis はカスタム SQL、ストアドプロシージャ、高度なマッピング処理に対応した優れた永続化フレームワークです。

// 2 永続化とは何か
// ・ファイルやDBなど、プログラム終了後もデータが失われないような場所へのデータ保存を指す
// ・オブジェクト指向プログラミングでは、あるクラスのインスタンスを生成し、メソッドを呼び出すことで特定の処理を実行します。例えば、ショッピングサイトであれば、注文やキャンセルなど様々な処理が考えられます
// ・当然のことながら、各処理の記録をデータとして長期的に記録する必要が出てきます。
// ・インスタンスは主記憶装置上に生成されるため、プログラムの終了とともにその内容は消えてしまうのです。ゆえに、プログラムで実行された処理内容をデータベースに保存する処理（永続化）が必要となります。

// 3 結局MyBatisとは何か
// オブジェクト指向言語におけるオブジェクトとデータベースに関する処理との対応づけを容易にする便利ツール
// ※このようなフレームワークのことをO/Rマッパーといいます。

// 4 O/Rマッパーとは何か
// ・O/RマッパーとはO/Rマッピングを実現するライブラリやフレームワークのこと
// ・O/Rマッピングとは、オブジェクト指向言語におけるオブジェクトと、リレーショナルデータベースにおけるレコードとを対照させることである。ここでの「マッピング」とは「対応付ける」というほどの意味である。
// ・O/Rマッピングによって、リレーショナルデータベースのレコードがオブジェクトとして直感的に扱えるようになり、リレーショナルデータベースにアクセスするプログラムを記述する処理を容易にすることが可能となる。
// ※MyBatisもO/Rマッパーの一つ

// 5 コードから読み解くMyBatis
// ・abstractMyBatisではデータベースへの操作(SQL)をXMLに記載してJava側で呼び出します。
// （Annotationも使用できますがここでは省略）
// <?xml version="1.0" encoding="UTF-8" ?>
// <!DOCTYPE mapper
//   PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
//   "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
// <mapper namespace="org.mybatis.example.BlogMapper">
//   <select id="selectUser" resultType="User">
//     select * from Users where id = #{id}
//   </select>
// </mapper>
// ・MyBatisスタートガイドをもとに作成
// ・ここではユーザーのIDをもとにユーザのデータをデータベースから取得するSQLを記載しています。
// ・JavaでselectUser(任意のユーザID)を呼び出すことでSQLを実行し、取得した結果をresultTypeで指定したクラス(User)に代入できます。
// UserMapper mapper = session.getMapper(UserMapper.class);
// User user = mapper.selectUser(16280001);

// 6 MyBatisの特徴
// ・MyBatisは、一般的なO/Rマッパーのようにデータベースのテーブル構造とオブジェクトをマッピングするのではなく、SQL文とオブジェクトをマッピングするという特質を持っています。
// ・Java側ではSQLで取得するデータに着目すればよく、テーブル構造を意識する必要がないため柔軟性が高いといえます。

// 7 Hibernateと比較してみる
// 比較項目	  MyBatis            Hibernate
// マッピング	SQL文とオブジェクト	テーブル構造とオブジェクト
// SQL	       手動作成	          自動生成

// 8 SQLの扱いの違いが意味すること
// 8_1 手動生成
// ・SQLの細かいチューニングが可能
// ・SQL文によってはDBMSに依存する（特定のDBMSでしか使えない）
// ・開発者がSQLを意識する必要がある

// 8_2 自動生成
// ・実際に発行されるSQLが非効率になる恐れがある（＝細かいチューニングが不可能）
// ・特定のDBMSに依存しない
// ・開発者はSQLを意識しなくてよい
// MyBatisを使用するということはSQLをガッツリ書かなければならないということです。
// 手間はかかるものの、開発者がSQLを完全にコントロールできるため、開発者が意図した通りのデータ操作を実現することができる

// 参照：プログラミングマガジン
// O/Rマッパーとは？

// 1 O/Rマッパーを使うことになった背景
// DBとオブジェクト指向のデータ構造の違い
// ・データベースは、リレーショナルデータ構造を持っていますが、Javaは、オブジェクトになっています。
// ・なので、Javaであれば、RDBに接続する場合は、ResultSetとJavaBeansの詰め替えが必要になってきます。
// ・この詰め替え作業は項目数が多いとかなり面倒な作業になる。そのため「O/Rマッパー」という概念が生まれました。

// 2 O/Rマッパーのメリット・デメリット
// 2_1 メリット
// O/Rマッパーを使うと、SQLをほぼちまちま書くことなく、JavaBeansのリストで検索結果を取得したり、更新を行ったりすることができます。
// 2_2 デメリット
// SQLは書かなくていいが、設定ファイルを更新しなくてはならず、面倒。

// 3 Javaの有名なO/Rマッパーフレームワーク
// ・Hibernate
// ・iBatis

// 4 O/Rマッパー関連のJava仕様
// ・JDO
// ・JPA

// 5 JPA
// 特に、Javaの純正技術として浸透しているのは、「JPA」。
// ORMというよりは、SQLをJavaなりに使いやすくしているという意図で実装されています。
// 純正技術として、Springを初めとする多くのフレームワークで取り入れられています。