import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int howManyNumbers = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= howManyNumbers; i++) {
            final int number = scanner.nextInt();
            if (number % 6 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
