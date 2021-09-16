import java.util.Scanner;

public class DZ_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (input.hasNextInt()) {
            int a = input.nextInt();
            if (a < 0) {
                System.out.println("Отрицательные числа к натуральным не относят, введите натуральное число");
            } else if (a==0) {
                System.out.println("На ноль делить нельзя");
            }
            else System.out.print("Делителями числа " + a + " являются ");
            for (int i = a; i > 0; i--) {
                int b = a % i;
                if (b == 0)
                    System.out.print(i + " ");
            }
        } else System.out.println("Ошибка. Введено не число");
    }
}
