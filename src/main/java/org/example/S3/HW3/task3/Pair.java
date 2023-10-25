package org.example.S3.HW3.task3;

public class Pair<T, S> {
    private T valueFirst;
    private S valueSecond;

    public Pair(T valueFirst, S valueSecond) {
        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
    }

    public T getValueFirst() {
        return valueFirst;
    }

    public void setValueFirst(T valueFirst) {
        this.valueFirst = valueFirst;
    }

    public S getValueSecond() {
        return valueSecond;
    }

    public void setValueSecond(S valueSecond) {
        this.valueSecond = valueSecond;
    }

    @Override
    public String toString() {
        return "Первое значение: " + valueFirst.toString() + ";\n" + "Второе значение: " + valueSecond.toString() + ";\n";
    }
}
