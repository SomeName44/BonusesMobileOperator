public class Main {
    public static void main(String[] args) {
        //Колличество денег на счету клиента
        int balance = 100;
        //сумма пополнения
        int replenishment = 1100;
        int bonus;
        int money;

        if (replenishment <= 1000) {
            bonus = 0;
            money = (balance + replenishment + bonus);

        } else {
            bonus = replenishment / 100;
            money = (balance + replenishment + bonus);
        }

        System.out.println("Колличество:" + " " + bonus + " " + "бонусных рублей");
        System.out.println("Итоговый сумма на счету:" + " " + money + " " + "рублей");


    }

}



