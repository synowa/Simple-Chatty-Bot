import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        int toFix = 0;
        int reject = 0;
        int ready = 0;

        for (int i = 0; i < n; i++) {
            final int detectorPrints = scanner.nextInt();

            switch (detectorPrints) {
                case 1:
                    toFix++;
                    break;
                case -1:
                    reject++;
                    break;
                case 0:
                    ready++;
                    break;
                default:
            }

//            if (detectorPrints == 1) {
//                toFix++;
//            } else if (detectorPrints == -1) {
//                reject++;
//            } else if (detectorPrints == 0) {
//                ready++;
//            }
        }
        System.out.println(ready + " " + toFix + " " + reject);
    }
}