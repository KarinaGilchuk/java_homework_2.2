public class Main {
    public static void main(String[] args) {
        int currentAmount = 25; // текущее состояние счёта
        int stepForBonus = 100; // шаг для начисления одного бонуса
        int amountTopUp = 1250; // сумма пополнения
        int bonus; // бонусов к начислению

        currentAmount += amountTopUp; // считаем сумму после пополнения
        bonus = currentAmount >= 1000 ? currentAmount / stepForBonus : 0; // считаем количество бонусов к начислению
        currentAmount += bonus; // считаем сумму после начисления бонусов;

        System.out.println("Вы пополнили счёт на " + amountTopUp + " р.");
        System.out.println("Был начислен бонус " + bonus + " р.");
        System.out.println("Ваш текущий счёт " + currentAmount + " р.");
    }
}