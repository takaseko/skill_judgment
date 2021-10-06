// package C;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// ​
// class TestResult {
//   String classification; // 文系or理系 "l" or "s"
//   Integer english; // 英語
//   Integer math; // 数学
//   Integer science; // 理科
//   Integer language; // 国語
//   Integer society; // 社会
//   Integer allSubjects;  // 全科目
//   Integer s; // 理系科目
//   Integer l; // 文系科目
// }

//     public String getClassification() {
//       return classification;
//     }

//     public void setClassification() {
//       this.classification = classification;
//     }
// ​
//     public Integer getEnglish() {
//         return english;
//     }
// ​
//     public void setEnglish(Integer english) {
//         this.english = english;
//     }

//     public Integer getMath() {
//         return math;
//     }
// ​
//     public void setMath(Integer math) {
//         this.math = math;
//     }

//     public Integer getScience() {
//         return science;
//     }
// ​
//     public void setScience(Integer science) {
//         this.science = science;
//     }

//     public Integer getLanguage() {
//         return language;
//     }
// ​
//     public void setLanguage(Integer language) {
//         this.language = language;
//     }

//     public Integer getSociety() {
//         return society;
//     }
// ​
//     public void setSociety(Integer society) {
//         this.society = society;
//     }

//     public Integer getAllSubjects() {
//         return allSubjects;
//     }
// ​
//     public void setAllSubjects(Integer allSubjects) {
//         this.allSubjects = allSubjects;
//     }

//     public Integer getS() {
//         return s;
//     }
// ​
//     public void setS(Integer s) {
//         this.s = s;
//     }

//     public Integer getL() {
//         return l;
//     }
// ​
//     public void setL(Integer l) {
//         this.l = l;
//     }

// ​
// public class C035_2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N  = sc.nextInt(); // 1行目：受験者 
//         sc.nextLine(); // 改行
// ​
//         List<List<String>> list = new ArrayList<>(); 
//         for (int i = 0; i < N; i++) {  // 受験者分繰り返す
//           String str = sc.nextLine();
//           String array[] = str.split(" ");
//           list.add(Arrays.asList(array)); //配列をリストへ変換したものをadd（追加）する
//         }
// ​
//         // 与えられた入力全件に対して以下の処理をする 例)[[s 70 78 82 57 74]]
//         for (List<String> subList : list) {
//           // if文を入れ子にして記述
//           // 全科目合計が350点以上の場合
//           allSub = Integer.parseInt(subList.get(1)) + Integer.parseInt(subList.get(2)) + Integer.parseInt(subList.get(3)) + Integer.parseInt(subList.get(4)) + Integer.parseInt(subList.get(5)); // 全ての科目を足した結果を変数allSubに代入
//           if (350 <= allSub) {

//             // 文字列がs（理系）の場合
//             if ("s".equals(subList.get(0))) {
//               s = Integer.parseInt(subList.get(2)) + Integer.parseInt(subList.get(3)); // 「数学、理科」の足した結果を変数sに代入
//               // 数学,理科の合計が160点以上の場合
//               if (160 <= s) {
//                 passTest += 1; // 全科目合計が350点以上、かつ数学,理科の合計が160点以上で試験通過した人を変数(passTest)へ足す
//               }
//             }
            
//             // 文字列がl（文系）の場合
//             if ("l".equals(subList.get(0))) {
//               l = Integer.parseInt(subList.get(4)) + Integer.parseInt(subList.get(5)); // 「国語、地理歴史」の足した結果を変数lに代入
//               // 国語,地理歴史の合計が160点以上の場合
//               if (160 <= l) {
//                 passTest += 1; // 全科目合計が350点以上、かつ国語,地理歴史の合計が160点以上で試験通過した人を変数(passTest)へ足す
//               }
//             }
//           }
//         }
//     }
// }