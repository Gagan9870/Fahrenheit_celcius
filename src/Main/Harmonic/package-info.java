package Main.Harmonic;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (float) 1 / i;
        }
        System.out.println(sum);
        s1.close();
    }
}