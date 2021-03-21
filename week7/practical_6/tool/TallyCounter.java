package week7.practical_6.tool;

public class TallyCounter {
    private int counter;
    private int digits;

    public TallyCounter() {
        this.counter = 0;
        this.digits = 3;
    }

    public TallyCounter(int digits) {
        this.counter = 0;
        this.digits = digits >= 3 ? digits : 3;
    }

    public String toString() {
        return "0".repeat(this.digits - String.valueOf(counter).length()) + String.valueOf(counter);
    }

    public int increment() {
        this.counter = this.counter == (Math.pow(10, this.digits) - 1) ? 0 : this.counter + 1;
        return this.counter;
    }

    public int read() {
        return this.counter;
    }

    public int decrement() {
        this.counter = this.counter == 0 ? 0 : this.counter - 1;
        return this.counter;
    }

    public int reset() {
        int temp = this.counter;
        this.counter = 0;
        return temp;
    }

    public static void main(String[] args) {
        TallyCounter temp = new TallyCounter(4);
        System.out.println(temp);
        for (int i = 0; i < 999 + 1; i++) {
            temp.increment();
        }
        System.out.println(temp);
    }
}
