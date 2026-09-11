public class Smallest {
    public static void main(String[] args) {

        int[] a = {10, 5, 20, 3, 8};

        int small = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
            }
        }

        System.out.println("Smallest number = " + small);
    }
}