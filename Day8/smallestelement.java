package Day8;

class SmallestArray {
    public static void main(String[] args) {
        int[] a = {25, 10, 60, 15, 40};

        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Smallest = " + min);
    }
}
