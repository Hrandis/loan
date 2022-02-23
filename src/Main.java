// В предоставленном примере калькулятора нет случаев,
// когда в ежемесяном платеже без округления было бы больше 50 копеек.
// Поэтому понять, как в калькуляторе производится округление (вниз или по правилам), нельзя.
// Было принято решение округлять по правилам до целого.

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentOneYear = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж по кредиту составит " + Math.round(monthlyPaymentOneYear) + " руб.");

        double monthlyPaymentTwoYears = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж по кредиту составит " + Math.round(monthlyPaymentTwoYears) + " руб.");

        double monthlyPaymentThreeYears = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж по кредиту составит " + Math.round(monthlyPaymentThreeYears) + " руб.");
    }

}
