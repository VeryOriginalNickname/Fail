import ru.netology.services.PaAndCy.WorkService;
import org.junit.jupiter.api.Test;

public class ServTest {


        public void test(String[] args) {
            int income = 100_000, expenses = 60_000, threshold = 150_000;
            WorkService service = new WorkService();
            int money = 0;

            for (int month = 1; month < 13; month++) {
                if (money < threshold) {
                    System.out.println("Месяц " + month + ". Денег:" + money + " За работу... Заработал: +" + income + ", потратил: -" + expenses);
                    money = service.cal(income, expenses, threshold, money);
                    continue;
                }
                System.out.println("Месяц " + month + ". Денег:" + money + " Отдыхаем. Потратил: -" + expenses + " и ещё -" + (money - expenses) / 3);
                money = service.cal(income, expenses, threshold, money);
            }
        }
    }
