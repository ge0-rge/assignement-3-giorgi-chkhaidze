public class mesame {
    public static void main(String[] args) {
        int i;
        System.out.print("even");
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("odd");
        for (i = 50; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
