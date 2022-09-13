public class App {
    public static void main(String[] args) throws Exception {

        App myApp = new App();

        // Non-static method call
        myApp.showHelloJava();

        // Static method call
        showHelloWorld();

        // Non-static method call with parameter
        myApp.showName("Elizer");

        // Static method call with parameter
        showAge(20);

        // Static method call with two parameters
        showNameAndAge("Elizer", 20);

        // Non-static method call with two parameters that returns an int
        int sum = myApp.add(1, 1);
        System.out.println(sum);

        // Static method call with two parameters that returns an int
        int difference = subtract(1, 1);
        System.out.println(difference);

        int product = multiply(3, 5);
        System.out.println(product);

        int quotient = divide(9,3);
        System.out.println(quotient);

        int remainder = modulo(5,2); //practice
        System.out.println(remainder);

        System.out.println(is_equal(5,5));

        String word = concat("Meaningless","equivalence"); //practice
        System.out.println(word);
    }

    // Non-static method
    void showHelloJava() {
        System.out.println("Hello Java! This is a non-static method.");
    }

    // Static method
    static void showHelloWorld() {
        System.out.println("Hello World! This is a static method.");
    }

    // Non-static method with a parameter
    void showName(String name) {
        System.out.println("My name is " + name);
    }

    // Static method with a parameter
    static void showAge(int age) {
        System.out.println("My age is " + age);
    }

    // Static method with two parameters
    static void showNameAndAge(String name, int age) {
        System.out.println("Hello: " + name);
        System.out.println("You are : " + age + " years old!");
    }

    // Non-static method with two parameters with a return type
    int add(int x, int y) {
        int z = x + y;
        return z;
    }

    // Static method with two parameters with a return type
    static int subtract(int x, int y) {
        int z = x - y;
        return z;
    }

    static int multiply (int x, int y) {
        int z = x * y;
        return z;
    }

    static int divide (int x, int y) {
        int z = x / y;
        return z;
    }
    //practice
    static int modulo (int x, int y) {
        int z = x % y;
        return z;
    }

    static Boolean is_equal (int x, int y) {
        Boolean equal = (x == y);
        return equal;
    }
    //practice
    static String concat (String a, String b) {
        String word = a + b;
        return word;
    }
}
