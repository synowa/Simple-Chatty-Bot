import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* On the input the program receives non-negative integers H, A, B,
         where H > B and A > B. Every integer does not exceed 100.
         */
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = (int)Math.ceil((double) (h - a) / (a - b)) + 1;
        /* first part counts how many days and nights it will take to get to the height
         which is smaller from the given one (H) exactly by the amount of one day trip (which is A)
         */
        System.out.println(result);







    }
}
