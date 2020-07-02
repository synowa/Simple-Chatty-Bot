import java.util.Scanner;
class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}