import Algorithms.Exceptions.Recursion.IllegalFactorialNumberException;
import Algorithms.Recursion.Recursion;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.factorialExample();
    }
    public void factorialExample() {
        try {
            Recursion recursion = new Recursion();
            long fact = recursion.factorial(3);
            System.out.println(fact);
        }
        catch (IllegalFactorialNumberException e){
            System.out.println(e.getMessage());
        }
    }
}

