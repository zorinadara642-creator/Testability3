public class CreditPaymentService {
    public int calculate(int amount, double annualRate, int yaers) {
        double monthlyRate = annualRate / 12 / 100;
        int months = yaers * 12;

        double payment = amount * (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
        return (int) payment;
    }
}
