public class DZ_6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0, a = 2; i < array.length; a = a + 2, i++) {
            array[i] = a;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
