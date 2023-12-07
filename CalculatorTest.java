public class CalculatorTest {

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static int divide(int a, int b) {
    return a / b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(CalculatorTest.subtract(5, 2));   // Output: 3
    System.out.println(CalculatorTest.multiply(3, 4));   // Output: 12
    System.out.println(CalculatorTest.divide(10, 2));    // Output: 5
    System.out.println(CalculatorTest.add(7, 3));        // Output: 10
  }
}

   

    
    

