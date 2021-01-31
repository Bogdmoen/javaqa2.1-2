public class Main {
    public static void main(String[] args) {
        int balance = 100; // изначальный баланс
        int payment = 1150; // платеж
        int bonus;
        int bonusPayment;
        if (payment >= 1000) {
            bonus = payment / 100;

        } else {
            bonus = 0;
        }
        bonusPayment = payment + bonus;
        balance = balance + bonusPayment;
        System.out.println(bonus);
        System.out.println(balance);
    }
}
