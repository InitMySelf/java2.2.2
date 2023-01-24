public class Main {
    public static void main(String[] args) {
        int check = 1200;                       //счет
        int replenishment = 1050;               //сумма пополнения
        int finalScore = check + replenishment; //финальный счет
        int bonus = replenishment / 100;        //бонусы
        if (replenishment >= 1100) {
            System.out.printf("bonus=%d; finalScore=%d; \n", finalScore);
        } else {
            System.out.printf("bonus=0; finalScore=%d; \n", finalScore);
        }

    }
}
