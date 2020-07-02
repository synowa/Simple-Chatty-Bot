import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        boolean result = in < 10 && in > 0;
        System.out.println(result);
    }
}