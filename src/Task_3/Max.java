package Task_3;

public class Max<T extends Comparable<T>> {
    public T getMax(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}