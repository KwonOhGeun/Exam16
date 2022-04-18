import java.util.Scanner;

public class Exam16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        int k;
        int result;

        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = s.nextInt();
        System.out.printf("<1>덧셈, <2>뺄셈, <3>곱셈, <4>나눗셈 :");
        k = s.nextInt();
        System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
        b = s.nextInt();

        if (k == 1) {
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        }
        if (k == 2) {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (k == 3) {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (k == 4) {
            result = a / b;
            System.out.println(a + "/"+ b + "=" +result);
        }
    }
}
