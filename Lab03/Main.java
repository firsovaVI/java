

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");

        try {
            //Scanner fin = new Scanner(Paths.get(dir, "example.txt"), "UTF-8");

            // Logical operators
            boolean a = true;
            boolean b = false;
            boolean c = a && b;
            System.out.println(c);

            boolean d = a || b;
            System.out.println(d);

            boolean e = !a;
            System.out.println(e);

            // Ternary operator
            int x = 5;
            int y = 10;
            int min = x < y ? x : y;
            System.out.println(min);

            // Bitwise logical operators
            int num1 = 5; // 0101 in binary
            int num2 = 3; // 0011 in binary

            int bitwiseAnd = num1 & num2; // 0001 in binary
            System.out.println(bitwiseAnd);

            int bitwiseOr = num1 | num2; // 0111 in binary
            System.out.println(bitwiseOr);

            int bitwiseXor = num1 ^ num2; // 0110 in binary
            System.out.println(bitwiseXor);

            int bitwiseNot = ~num1; // 1010 in binary
            System.out.println(bitwiseNot);

            // Bitwise shift operators
            int num3 = 8; // 1000 in binary

            int rightShift = num3 >> 2; // 0010 in binary
            System.out.println(rightShift);

            int leftShift = num3 << 2; // 100000 in binary
            System.out.println(leftShift);

            int unsignedRightShift = num3 >>> 2; // 0010 in binary
            System.out.println(unsignedRightShift);

        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }
    }
}