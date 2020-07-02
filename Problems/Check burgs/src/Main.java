import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String burg = "burg";
        System.out.println(city.toLowerCase().endsWith(burg));
    }
}