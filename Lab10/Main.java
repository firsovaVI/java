class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public T min() {
        return min(first, min(second, third));
    }

    public T max() {
        return max(first, max(second, third));
    }

    public double mean() {
        return (toDouble(first) + toDouble(second) + toDouble(third)) / 3.0;
    }

    private T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    private T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    private double toDouble(T value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        } else {
            throw new UnsupportedOperationException("Unsupported type for mean calculation");
        }
    }

    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(5, 10, 3);
        System.out.println("Triple: " + triple);
        System.out.println("Min: " + triple.min());
        System.out.println("Max: " + triple.max());
        System.out.println("Mean: " + triple.mean());

        // Пример с выбрасыванием исключения при попытке расчета среднего для неподдерживаемого типа
        Triple<String> stringTriple = new Triple<>("one", "two", "three");
        try {
            System.out.println("Mean: " + stringTriple.mean());
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}