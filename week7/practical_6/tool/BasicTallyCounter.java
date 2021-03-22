package week7.practical_6.tool;

public class BasicTallyCounter implements ITallyCounter{
    protected int counter;
    protected int digits;

    public BasicTallyCounter() {
        this.counter = 0;
        this.digits = 3;
    }

    public BasicTallyCounter(int digits) throws Exception {
        if (digits<3){
            throw new Exception("The number of digits must be at least 3!");
        }
        this.counter = 0;
        this.digits = digits;
    }

    public String toString() {
        return "0".repeat(this.digits - String.valueOf(counter).length()) + String.valueOf(counter);
    }

    @Override
    public int increment() throws InvalidOperationException{
        if(this.counter == (Math.pow(10, this.digits) - 1)){
            throw new InvalidOperationException("yes");
        }
        this.counter = this.counter + 1;
        return this.counter;
    }

    @Override
    public int read() {
        return this.counter;
    }

    @Override
    public int reset() {
        int temp = this.counter;
        this.counter = 0;
        return temp;
    }

}
