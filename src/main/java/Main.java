public class Main {
    public static void main(String[] args) {
        long amount = 1_000_000;
        boolean registered = true;
        int bonus;
        int percent;
        if (registered) {
            percent = 3;
        } else {
            percent = 1;
        }
        System.out.println(amount * percent / 100 == 500);

    }
}
