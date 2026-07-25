package Day12;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        sb.insert(5, " Core");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 7);

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);
    }
}