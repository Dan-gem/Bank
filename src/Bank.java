import java.util.Scanner;

public class Bank {
    public static void pay(double money) { // метод pay, который в качестве аргумента принимает сумму платежа money
        double credit = 1000;     // Кредит
        double debts = 0;         // Долг
        double overPayment = 0;   // Переплата

        if (money > credit) {
            overPayment = money - credit;
            System.out.println("Переплата составила " + overPayment + " $");
            System.out.println("Кредит погашен");
        } else {
            if (money == credit) {
                System.out.println("Кредит погашен");
            } else {
                debts = credit - money;
                System.out.println("Задолженность составляет " + debts + " $");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        System.out.println("Введите сумму для оплаты кредита и нажмите Enter, далее ");
        double money = in.nextDouble();
        pay(money);
    }
}