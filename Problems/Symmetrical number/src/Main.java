import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String num = scanner.next();


//        if (num.length() == 1) {
//            num = "000" + num;
//        } else if (num.length() == 2) {
//            num = "00" + num;
//        } else if (num.length() == 3) {
//            num = "0" + num;
//        }

        if (num.length() == 4) {
            final char a = num.charAt(0);
            final char b = num.charAt(1);
            final char c = num.charAt(2);
            final char d = num.charAt(3);
            if (a == d && b == c) {
                final int numberIsSymmetricOutput = 1;
                System.out.println(numberIsSymmetricOutput);
            } else {
                final int numberIsNotSymmetricOutput = 42;
                System.out.println(numberIsNotSymmetricOutput);
            }
        }
    }
}
