public class Main {
    public static void main(String[] args) {
        int balance = 100; // изначальный баланс
        int payment = 1150; // платеж
        int bonus;
        int bonus_payment;
        if (payment >= 1000) {
            bonus = payment / 100;

        } else {
            bonus = 0;
        }
        bonus_payment = payment + bonus;
        balance = balance + bonus_payment;
        System.out.println(bonus);
        System.out.println(balance);
    }
}
