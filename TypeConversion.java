/**********************************************************************
  
  Program Title : Demonstrating Type Conversion in Java
  File Name: "TypeConversion.java"
  
  Programmer : Abdulaziz Salokhiddinov
  Contact Details : abdulazizsaloxiddinov404@gmail.com
  Date : 06 September 2025
  
 **********************************************************************/

public class TypeConversion {
    public static void main(String[] args) {
        int intVar1 = 100;
        double doubleVar1 = intVar1 + 2.00;
        System.out.println("Implicit Conversion int->double: " + doubleVar1);

        double doubleVar2 = 99.99;
        double doubleVar3 = doubleVar2 + 1;
        int intVar3 = (int) doubleVar2 + 1;
        System.out.println("Double (no conversion): " + doubleVar3);
        System.out.println("Explicit Conversion double->int: " + intVar3);

        char letter = 'A';
        int asciiValue = letter;
        System.out.println("Char 'A' to int: " + asciiValue);

        int number = 66;
        char convertedChar = (char) number;
        System.out.println("Int 66 to char: " + convertedChar);
    }
}
