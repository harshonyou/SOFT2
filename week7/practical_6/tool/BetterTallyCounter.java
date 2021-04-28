package tool;

import java.util.ArrayList;
import java.util.List;

public class BetterTallyCounter extends BasicTallyCounter implements IAdvancedCounter {

    @Override
    public int decrement() throws InvalidOperationException {
        if (this.counter == 0) {
            throw new InvalidOperationException("");
        }
        this.counter = this.counter - 1;
        return this.counter;
    }

    public static void main(String[] args) {
        List<ITallyCounter> allCounters = new ArrayList<>();
        allCounters.add(new BasicTallyCounter());
        allCounters.add(new BetterTallyCounter());
        try {
            allCounters.get(0).increment();
            allCounters.get(0).increment();
            allCounters.get(1).increment();
        } catch (InvalidOperationException ex) {
            // Do nothing.
        }
        int sum = 0;
        for (ITallyCounter counter : allCounters) {
            System.out.println(counter.read());
            sum += counter.read();
        }
        System.out.println("Total sum of counters is: " + sum);
    }
}
