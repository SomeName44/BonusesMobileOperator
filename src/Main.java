public class Main {
    public static void main(String[] args) {
        //Колличество денег на счету клиента
        int amount = 100;
        //сумма пополнения
        int replenishment = 1000;
        int balance;
        int bonus;

        if (replenishment < 1000) {
            bonus = replenishment + 100;

        } else {
            bonus = replenishment / 100;
        }
        balance = amount + replenishment + bonus;
        System.out.println("Колличество:" + " " + bonus + " " + "бонусных рублей");
        System.out.println("Итоговый счет:" + " " + balance + " " + "рублей");
    }

}



