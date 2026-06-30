package Day1;

class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Available Processors: " + r.availableProcessors());
    }
}
