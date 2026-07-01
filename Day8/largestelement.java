package Day8;

class LargestArray {
    public static void main(String[] args) {
        int[] a = {25, 10, 60, 15, 40};

        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        System.out.println("Largest = " + max);
    }
}
