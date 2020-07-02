import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int number1 = scanner.nextInt();
        final int number2 = scanner.nextInt();
        final int number3 = scanner.nextInt();

        System.out.println(number1 >= number2 && number1 <= number3 || number1 >= number3 && number1 <= number2);
    }
}