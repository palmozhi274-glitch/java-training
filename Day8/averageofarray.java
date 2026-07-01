package Day8;

class AverageArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        double avg = (double) sum / a.length;

        System.out.println("Average = " + avg);
    }
}
