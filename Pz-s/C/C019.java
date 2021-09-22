// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class C019 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int q = sc.nextInt();
//         sc.nextLine();

//         // 与えられた整数のリスト
//         List<Integer> givenNumList = new ArrayList<>(); // ← [28, 16, 777]
//         for (int i = 0; i < q; i++) {
//             givenNumList.add(Integer.parseInt(sc.nextLine()));
//         }

//         for (Integer givenNum : givenNumList) {
//             getResult(givenNum);
//         }
//     }

//     private static void getResult(Integer num) {
//         // 与えられた整数の約数を格納するリスト ← 確認用
//         List<Integer> divisor = new ArrayList<>();
//         // 自身を除いたものの和
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             // 与えられた整数 割る i の余りが0の場合
//             if (num % i == 0) {
//                 divisor.add(i);
//                 if (i != num) {
//                     sum += i;
//                 }
//             }
//         }

        // if (sum - num == 0) {
        //     // 自身を除いたものの和 - 与えられた整数 = 0 の場合
        //     System.out.println("perfect");
        // } else if (sum - num == -1) {
        //     // 自身を除いたものの和 - 与えられた整数 = -1 の場合
        //     System.out.println("nearly");
        // } else {
        //     // それ以外
        //     System.out.println("neither");
        // }
//     }
// }