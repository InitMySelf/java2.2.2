public class Main {
    public static void main(String[] args) {

        int check = 1200;                       //счет
        int replenishment = 800;               //сумма пополнения
        int finalScore = check + replenishment; //финальный счет
        int bonus = replenishment / 100;        //бонусы

        if (replenishment >= 1100) {
            System.out.println(finalScore + bonus); }
        else
        {
            System.out.println(finalScore);
        }

    }
}
