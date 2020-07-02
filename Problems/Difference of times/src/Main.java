import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int firstTimeInSeconds = hours1 * 3600 + minutes1 * 60 + seconds1;

        int hour2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int secondTimeInSeconds = hour2 * 3600 + minutes2 * 60 + seconds2;

        int difference = secondTimeInSeconds - firstTimeInSeconds;

        System.out.println(difference);
    }
}