import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt(); //how many days
        int foodCostPerDay = scanner.nextInt(); //multiply by duration
        int oneWayFlightCost = scanner.nextInt(); //multiply by 2, so you could come back
        int hotelNightCost = scanner.nextInt(); //the number of nights equal duration minus one

        int vacationCost = foodCostPerDay * duration + oneWayFlightCost * 2 + hotelNightCost * (duration - 1);
        System.out.println(vacationCost);
    }
}