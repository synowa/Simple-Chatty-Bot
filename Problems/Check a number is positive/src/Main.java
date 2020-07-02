import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}