package ru.netology.services.PaAndCy;
public class WorkService {
    public int cal(int income, int expenses, int threshold, int money) {

        if (money < threshold) {
            money = money + income - expenses;
            return money;
        } else if (money >= threshold) {
            money = (money - expenses) / 3;
            return money;
        }


        return -1;
    }
}