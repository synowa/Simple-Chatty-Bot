import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number / 10) % 10); //dzielac np 173 na 10 masz 17,3,
        // co int trzyma jako 17 i potem modulo 10 (%10) wypisuje ostatnią cyfrę liczby
    }
}