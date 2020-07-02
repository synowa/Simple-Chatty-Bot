import java.util.Scanner;
public class Check_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.toUpperCase().startsWith("J"));
    }

}
