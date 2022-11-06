public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 110;
        int b = refill / 100;
        int a = balance + refill;
        int c = b + balance + refill;

        if (refill > 1000) {
            System.out.println(" Сумма на счету: " + c + " рублей");
        } else {
            System.out.println(" Сумма на счету: " + a + " рублей");
        }

        // Через тернарный оператор:
        // int bonus = refill>1000 ? c : a;
        //System.out.println("Сумма на счету: " + bonus + " рублей");

    }
}
