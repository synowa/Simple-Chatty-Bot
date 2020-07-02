import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final boolean option1 = a + b == 20;
        final boolean option2 = a + c == 20;
        final boolean option3 = b + c == 20;

        System.out.println(option1 || option2 || option3);

    }
}