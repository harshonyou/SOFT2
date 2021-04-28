// package week6.practical_5;

public class MainApp extends TallyCounter {
    public static void main(String[] args) {
        TallyCounter tallyCount = new TallyCounter(4);
        System.out.println(tallyCount);
        for (int i = 0; i < 9999 + 1; i++) {
            tallyCount.increment();
        }
        System.out.println(tallyCount.read());
    }
}
