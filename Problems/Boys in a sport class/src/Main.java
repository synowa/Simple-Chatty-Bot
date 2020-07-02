import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean ascendingOrder = h1 >= h2 && h2 >= h3;
        boolean descendingOrder = h3 >= h2 && h2 >= h1;

        System.out.println(ascendingOrder || descendingOrder);
    }
}