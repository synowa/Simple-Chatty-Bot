import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int howMany = 0;
        int sum = 0;

        for (int i = a; i < b + 1; i++) {
            if (i % 3 == 0) {
                howMany++;
                sum = sum + i;
            }
        }
        System.out.println((double) sum / howMany);
    }
}