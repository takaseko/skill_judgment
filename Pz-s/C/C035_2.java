package C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TestResult {
    String classification;
    Integer english;
    Integer math;
    Integer science;
    Integer language;
    Integer society;

    public TestResult(String classification, Integer english, Integer math, Integer science, Integer language, Integer society) {
        this.classification = classification;
        this.english = english;
        this.math = math;
        this.science = science;
        this.language = language;
        this.society = society;
    }

    public Integer getAllSubTotal() {
        return this.english + this.math + this.science + this.language + this.society;
    }

    public Integer getLSubTotal() {
        return this.language + this.society;
    }

    public Integer getSSubTotal() {
        return this.math + this.science;
    }

    public boolean isPassed() {
        if (350 <= this.getAllSubTotal()) {
            // 文系の場合
            if ("l".equals(this.classification)) {
                if (160 <= this.getLSubTotal()) {
                    return true;
                }
            }
            // 理系の場合
            if ("s".equals(this.classification)) {
                if (160 <= this.getSSubTotal()) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class C035_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 1行目：受験者
        sc.nextLine(); // 改行

        List<TestResult> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String[] array = str.split(" ");
            TestResult testResult = new TestResult(
                    array[0],
                    Integer.parseInt(array[1]),
                    Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]),
                    Integer.parseInt(array[4]),
                    Integer.parseInt(array[5])
            );
            list.add(testResult);
        }

        int passTest = 0; // 試験通過した人数を初期化
        for (TestResult testResult : list) {
            if (testResult.isPassed()) {
                passTest++;
            }
        }
        System.out.println(passTest);
    }
}