package week7.practical_6.tool;

public interface ITallyCounter {

    public int increment() throws InvalidOperationException;

    public int reset();

    public int read();
}
