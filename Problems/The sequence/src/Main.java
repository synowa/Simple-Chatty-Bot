import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyNumbers = scanner.nextInt();
        int max = 0;
        int i = 0; // or i=1, but then while (i <= howManyNumbers)

        while (i < howManyNumbers) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
            i++;
        }
        System.out.println(max);
    }
}