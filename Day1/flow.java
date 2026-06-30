package Day1;

 class Flow {

    static {
        System.out.println("1. Static Block");
    }

    Flow() {
        System.out.println("2. Constructor");
    }

    public static void main(String[] args) {
         new Flow();
        System.out.println("3. Main Method");
    }
}
