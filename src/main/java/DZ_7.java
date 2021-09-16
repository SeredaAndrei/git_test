public class DZ_7 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for(int i=0,a=1; i<array.length; a=a+2,i++){
            array[i] = a;
        }
        for(int i=array.length-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
