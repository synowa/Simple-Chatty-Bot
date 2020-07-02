import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsInGroup1 = scanner.nextInt();
        int studentsInGroup2 = scanner.nextInt();
        int studentsInGroup3 = scanner.nextInt();

        int result = (studentsInGroup1 + 1) / 2 + (studentsInGroup2 + 1) / 2 + (studentsInGroup3 + 1) / 2;
        System.out.println(result);



    }
}