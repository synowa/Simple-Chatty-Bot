import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reeses = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean weekDays = (reeses >= 10 && reeses <= 20 && !isWeekend);
        boolean weekend = (reeses >= 15 && reeses <= 25 && isWeekend);

        System.out.println(weekDays || weekend);
    }
}