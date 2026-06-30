package Day4;

class MultipleCasting {
    public static void main(String[] args) {
        int a = 100;
        double d = a;
        float f = (float)d;
        long l = (long)f;

        System.out.println("Int = " + a);
        System.out.println("Double = " + d);
        System.out.println("Float = " + f);
        System.out.println("Long = " + l);
    }
}
