import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = 2;
        int c = 3;
        int b = 4;
        int a = 5;
        int howManyDs = 0;
        int howManyCs = 0;
        int howManyBs = 0;
        int howManyAs = 0;

        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            if (grade == d) {
                howManyDs++;
            } else if (grade == c) {
                howManyCs++;
            } else if (grade == b) {
                howManyBs++;
            } else if (grade == a) {
                howManyAs++;
            }
        }
        System.out.println(howManyDs + " " + howManyCs + " " + howManyBs + " " + howManyAs);
    }
}