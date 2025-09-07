/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Sathish Sarma (modified by Rasul)
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Type Size and Range in Java");
        System.out.println("------------------------------------------------");

        
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';

        // byte
        System.out.println("byte value: " + b);
        System.out.println("  Size: " + Byte.SIZE + " bits (" + Byte.BYTES + " bytes)");
        System.out.println("  Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("short value: " + s);
        System.out.println("  Size: " + Short.SIZE + " bits (" + Short.BYTES + " bytes)");
        System.out.println("  Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("int value: " + i);
        System.out.println("  Size: " + Integer.SIZE + " bits (" + Integer.BYTES + " bytes)");
        System.out.println("  Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("long value: " + l);
        System.out.println("  Size: " + Long.SIZE + " bits (" + Long.BYTES + " bytes)");
        System.out.println("  Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("float value: " + f);
        System.out.println("  Size: " + Float.SIZE + " bits (" + Float.BYTES + " bytes)");
        System.out.println("  Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("double value: " + d);
        System.out.println("  Size: " + Double.SIZE + " bits (" + Double.BYTES + " bytes)");
        System.out.println("  Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("char value: " + c);
        System.out.println("  Size: " + Character.SIZE + " bits (" + Character.BYTES + " bytes)");
        System.out.println("  Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println();
    }
}