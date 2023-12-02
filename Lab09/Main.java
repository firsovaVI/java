import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class testClass{
    private int f;
    private String s;
    private Double t;

    public testClass(){
        f = 5; s = "Варя"; t = 5.0;
    }
    public void print(){
        System.out.println(f + " " + s + " " + t);
    }
}

public class Main {

    public static void main(String[] args) {
        String className = "testClass"; // Имя нужного класса
        String methodName = "print"; // Имя метода, который хотите вызвать

        try {
            // Получаем объект Class по имени класса
            Class<?> clazz = Class.forName(className);

            // Создаем экземпляр класса
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Получаем метод по имени
            Method method = clazz.getDeclaredMethod(methodName);

            // Вызываем метод для созданного экземпляра (если метод статический, первый аргумент можно передать null)
            Object result = method.invoke(obj);

            // Выводим результат выполнения метода (если есть)
            if (result != null) {
                System.out.println("Результат выполнения метода: " + result.toString());
            } else {
                System.out.println("Метод успешно вызван.");
            }

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}