import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigitInt = scanner.nextInt();
        System.out.println(threeDigitInt / 100 + threeDigitInt / 10 % 10 + threeDigitInt % 10);
    }
}