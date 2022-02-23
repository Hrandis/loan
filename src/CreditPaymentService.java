//Метод для расчета ежемесячного платежа по кредиту
//на основе формулы, взятой в https://www.raiffeisen.ru/wiki/kak-rasschitat-annuitetnyj-platezh/

public class CreditPaymentService {
    public double calculate(int amount, int years, double interestRate) {
        int months = years * 12; //переводим годы в месяцы для расчета месячной процентной ставки
        double monthInterestRate = interestRate / (100 * 12); //расчет месячной процентной ставки
        double payment = amount * (monthInterestRate / (1 - Math.pow(1 + monthInterestRate, -months))); //расчет ежемесячного платежа
        return payment;
    }
}
