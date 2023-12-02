import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void printClassInfo(Class<?> clazz) {
        // Выводим имя класса
        System.out.println("Имя класса: " + clazz.getName());

        // Выводим модификаторы класса
        int modifiers = clazz.getModifiers();
        System.out.println("Модификаторы: " + Modifier.toString(modifiers));

        // Выводим информацию о полях класса
        System.out.println("\nПоля класса:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Имя поля: " + field.getName());
            System.out.println("Тип поля: " + field.getType().getName());
            System.out.println("Модификаторы поля: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }

        // Выводим информацию о методах класса
        System.out.println("\nМетоды класса:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Имя метода: " + method.getName());
            System.out.println("Тип возвращаемого значения: " + method.getReturnType().getName());
            System.out.println("Модификаторы метода: " + Modifier.toString(method.getModifiers()));

            // Выводим параметры метода
            System.out.println("Параметры метода:");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("  " + parameterType.getName());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Пример использования метода для вывода информации о классе
        printClassInfo(String.class);
    }
}