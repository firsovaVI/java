class testClass{
    private int f;
    private String s;
    private Double t;

    public testClass(int _f, String _s, Double _t){
        f = _f; s = _s; t = _t;
    }
    public void print(){
        System.out.println(f + " " + s + " " + t);
    }
}
public class Main {
    public static <T> void swapValues(T obj1, T obj2) {
        try {
            java.lang.reflect.Field[] fields = obj1.getClass().getDeclaredFields();
            for (java.lang.reflect.Field field : fields) {
                field.setAccessible(true);
                Object help = field.get(obj1);
                field.set(obj1, field.get(obj2));
                field.set(obj2, help);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        //Пример использования с тестовым классом
        testClass test1 = new testClass(5, "Молодец", 5.0);
        testClass test2 = new testClass(3, "Не молодец", 3.0);

        System.out.println("\nИсходные значения:");
        System.out.print("Объект 1: ");
        test1.print();
        System.out.print("Объект 2: ");
        test2.print();

        // Вызываем обобщенный метод для обмена значениями
        swapValues(test1, test2);

        System.out.println("\nЗначения после обмена:");
        System.out.print("Объект 1: ");
        test1.print();
        System.out.print("Объект 2: ");
        test2.print();
    }
}