public class DZ_8 {
    public static void main(String[] args) {
        int[] array1 = new int[5], array2 = new int[5];
        int s1, s2;
        double a1, a2;
        s1 = 0;
        s2 = 0;
        for(int i=0; i<array1.length; i++){
            array1[i] = (int)(Math.random()*6);
            array2[i] = (int)(Math.random()*6);
        }
        for(int i=0; i<array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for(int i=0; i<array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
        for(int i=0; i<array1.length; i++){
            s1 = s1+array1[i];
        }
        for(int i=0; i<array2.length; i++){
            s2 = s2+array2[i];
        }
        System.out.println();
        a1 = (double)s1/5;
        a2 = (double)s2/5;
        if(a1<a2) {
            System.out.println("Среднее арифметическое array1 меньше среднего арифметического array2");
        } else if(a2<a1) {
            System.out.println("Среднее арифметическое array2 меньше среднего арифметического array1");
        } else {
            System.out.println("Среднее арифметическое array1 == array2");
        }
    }
}
