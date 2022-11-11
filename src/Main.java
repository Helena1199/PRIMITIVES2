public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 110;
        int bonus = refill / 100;
      
        if (refill > 1000) {
            System.out.println(" Сумма на счету: " + (bonus + balance + refill) + " рублей");
        } else {
            System.out.println(" Сумма на счету: " + (balance + refill) + " рублей");
        }

    }
}
