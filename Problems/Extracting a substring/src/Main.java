import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        System.out.println(str.substring(in1, in2 + 1));
    }
}