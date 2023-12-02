
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");

        try {
            Scanner fin = new Scanner(Paths.get(dir, "test.txt"), "UTF-8");
            StringBuilder final_string = new StringBuilder();
            while (fin.hasNext()){
                final_string.append(fin.next()).append(" ");
            }
            System.out.println(final_string);

        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }
    }
}