/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java
  File Name: "VariableDataTypes.java"
  
  Programmer : Abdulaziz Salokhiddinov
  Contact Details : abdulazizsaloxiddinov404@gmail.com
  Date : 28 August 2025
  
 **********************************************************************/

public class VariableDataTypes {
    public static void main(String[] args) {
        System.out.println("Demonstrating Variable Data Types in Java");
        System.out.println("-----------------------------------------");

        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);

        System.out.println("\n--- Non-Primitive Data Types ---");

        String str = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("String value: " + str);
        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
