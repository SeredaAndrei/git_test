import java.util.Scanner;

class DZ_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}


