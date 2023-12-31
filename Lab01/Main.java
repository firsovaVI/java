class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Метод length() - возвращает длину строки
        int length = str.length();
        System.out.println("Длина строки: " + length);

        // Метод charAt() - возвращает символ по указанному индексу
        char firstChar = str.charAt(0);
        System.out.println("Первый символ строки: " + firstChar);

        // Метод substring() - возвращает подстроку, начиная с указанного индекса
        String substring = str.substring(7);
        System.out.println("Подстрока: " + substring);

        // Метод indexOf() - возвращает индекс первого вхождения указанного символа или подстроки
        int index = str.indexOf(",");

        System.out.println("Индекс запятой в строке \"" + str + "\": " + index);

        // Метод replace() - заменяет все вхождения указанной подстроки на другую подстроку
        String replacedStr = str.replace("World", "Java");
        System.out.println("Замененная строка: " + replacedStr);

        // Метод toUpperCase() - преобразует все символы строки в верхний регистр
        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        // Метод toLowerCase() - преобразует все символы строки в нижний регистр
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        // Метод trim() - удаляет начальные и конечные пробелы
        String trimmedStr = "  Hello, World!  ".trim();
        System.out.println("Обрезанная строка: " + trimmedStr);
    }
}