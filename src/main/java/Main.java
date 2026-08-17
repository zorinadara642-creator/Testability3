public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 1) + " рублей");

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 2) + " рублей");

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 3) + " рублей");
    }
}
