import java.util.Scanner;

public class meore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}
