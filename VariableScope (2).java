/**********************************************************************
  
  Program Title : Demonstrating Variable Scope in Java
  File Name: "VariableScope.java"
  
  Programmer : Abdulaziz Salokhiddinov
  Contact Details : abdulazizsaloxiddinov404@gmail.com
  Date : 06 September 2025
  
 **********************************************************************/

public class VariableScope {
    static int staticVar = 100;
    int instanceVar = 50;

    public void printOutputMethod() {
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableScope obj1 = new VariableScope();
        VariableScope obj2 = new VariableScope();

        System.out.println("---- Object 1 ----");
        obj1.printOutputMethod();

        obj1.instanceVar = 200;
        VariableScope.staticVar = 500;

        System.out.println("\n---- Object 2 ----");
        obj2.printOutputMethod();

        System.out.println("\n---- Object 1 Again ----");
        obj1.printOutputMethod();
    }
}