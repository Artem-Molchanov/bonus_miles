public class Main {

    public static void main(String[] args) {

        int ticketCost = 11_000;
        int rublePerMile = 20;

        int mileQuantity = ticketCost / rublePerMile;

        System.out.println("Количество бонусных миль: " + mileQuantity);

    }

}
