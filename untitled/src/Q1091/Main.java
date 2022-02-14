package Q1091;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시작 값
        int m = sc.nextInt(); //곱할 값
        int d = sc.nextInt(); //더할 값
        int n = sc.nextInt(); //n번째 수

        long result = a;

        for (int i = 1; i < n; i++) {
            result = (result * m) + d;
        }
        System.out.println(result);
    }
}
