public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment = 1001;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int finalScore = check + replenishment + bonus;
        System.out.println("Баланс: " + finalScore + " руб. Бонус: " + bonus + " руб.");
    }
}