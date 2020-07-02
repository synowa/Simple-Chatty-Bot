import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int heightOfBus = scanner.nextInt();
        final int howManyBridges = scanner.nextInt();
        boolean crash = false;

        for (int i = 0; i < howManyBridges; i++) {
            final int heightOfBridge = scanner.nextInt();

            if (heightOfBus >= heightOfBridge) {
                crash = true;
                System.out.print("Will crash on bridge " + (i + 1));
                break;
            }
        }

        if (!crash) {
            System.out.println("Will not crash");

        }
    }
}
