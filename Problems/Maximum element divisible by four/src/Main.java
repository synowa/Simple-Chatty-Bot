import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            final int element = scanner.nextInt();
            if (element % 4 == 0 & element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}
