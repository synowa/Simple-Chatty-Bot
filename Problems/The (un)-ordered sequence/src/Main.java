import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int previous = scanner.nextInt();
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 1_000_000; i++) {
            int current = scanner.nextInt();

            if (current == 0) {
                break;
            }
            if (previous > current) {
                ascending = false;
            }
            if (previous < current) {
                descending = false;
            }
            previous = current;
        }

        System.out.println(ascending || descending);

    }
}