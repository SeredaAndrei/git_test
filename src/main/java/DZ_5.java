import java.util.Scanner;

public class DZ_5 {
    static int sum(int n) {
        if (n < 10) return n;
        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int a = input.nextInt();

            int res = sum(a);
            if (a <= 0) {
                System.out.println("Ноль и отрицательные числа к натуральным не относят, введите натуральное число");
            } else System.out.println(res);
            input.close();
        } else
        System.out.println("Введите число");
    }

}