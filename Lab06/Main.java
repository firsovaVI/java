class ArrayStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    private void redouble_capacity(){
        stackArray = java.util.Arrays.copyOf(stackArray, stackArray.length * 2);
        maxSize = stackArray.length;
    }

    // Конструктор для создания стека заданного размера
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Инициализируем вершину стека
    }

    // Метод для добавления элемента в стек
    public void push(int value) {
        if (top >= maxSize - 1) {
            redouble_capacity();
        }
        stackArray[++top] = value;
        System.out.println("Добавлен элемент: " + value);
    }

    // Метод для извлечения элемента из стека
    public int pop() {
        if (top >= 0) {
            int value = stackArray[top--];
            System.out.println("Извлечен элемент: " + value);
            return value;
        } else {
            System.out.println("Стек пуст. Невозможно извлечь элемент.");
            return -1; // Возвращаем -1, чтобы указать на ошибку извлечения
        }
    }

    // Метод для получения верхнего элемента стека без его извлечения
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Стек пуст. Нет верхнего элемента.");
            return -1; // Возвращаем -1, чтобы указать на ошибку доступа к вершине
        }
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return (top == -1);
    }

    // Метод для проверки, полон ли стек
    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);

        System.out.println("Верхний элемент стека: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Стек пуст? " + stack.isEmpty());
        System.out.println("Стек полон? " + stack.isFull());
    }
}