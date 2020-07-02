import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final boolean aPositive = a > 0 && b <= 0 && c <= 0;
        final boolean bPositive = b > 0 && a <= 0 && c <= 0;
        final boolean cPositive = c > 0 && a <= 0 && b <= 0;

        System.out.println(aPositive || bPositive || cPositive);
    }
}